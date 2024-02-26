import java.util.*;
public class MasterList{
    private ArrayList <PopcornOrder> orders;
    
    public MasterList(){
        orders = new ArrayList <PopcornOrder>();
    }
    public void addOrder(PopcornOrder p){
        orders.add(p);
    }
    public int getTotalOrders(){
        int sum = 0;
        for (PopcornOrder order : orders){
            sum += order.getNumOrdered();
        }
        return sum;
    }
    public int removeVariety(String v){
        int numRemoved = 0;
        for (int i = orders.size()-1; i >= 0; i--){
            if(orders.get(i).getVariety().equals(v)){
                numRemoved += orders.get(i).getNumOrdered();
                orders.remove(orders.get(i));
            }
        }
        return numRemoved;
    }
    public String toString(){
        String str = "";

        if (orders.size() > 0){
            for (PopcornOrder order : orders){
                str += order + ", ";
            }
        }else{
        str = "There are no orders in the list";
    }
    return str;
}
}