public class PopcornOrder{
    String variety = "";
    int numOrdered = 0;
    public PopcornOrder(String v, int num){
        variety = v;
        numOrdered = num;
    }
    public String getVariety(){
        return variety;
    }
    public int getNumOrdered(){
        return numOrdered;
    }

    public String toString(){
        if (numOrdered != 0)
            return ("Variety: " + variety + " Number Ordered: " + numOrdered);
        else
        return("There are no popcorn orders for the MasterList");
    }
}