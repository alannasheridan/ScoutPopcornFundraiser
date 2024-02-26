//import java.util.*;
public class Main{
    public static void main(String[] args){
        MasterList popcorn2023 = new MasterList();
        
        popcorn2023.addOrder(new PopcornOrder("Jalapeno Cheese", 1));
        popcorn2023.addOrder(new PopcornOrder("Butter Microwave", 3));
        popcorn2023.addOrder(new PopcornOrder("Butter Microwave", 2));
        popcorn2023.addOrder(new PopcornOrder("Caramel With Sea Salt", 2));
        popcorn2023.addOrder(new PopcornOrder("Caramel With Sea Salt", 5));
        popcorn2023.addOrder(new PopcornOrder("Kettle Corn", 4));

        System.out.println(popcorn2023);
        System.out.println(popcorn2023.getTotalOrders());
        System.out.println(popcorn2023.removeVariety("Butter Microwave"));
        System.out.println(popcorn2023.removeVariety("Sea Salt Splash"));
        System.out.println(popcorn2023.removeVariety("Kettle Corn"));
        System.out.println(popcorn2023);

        MasterList popcorn2024 = new MasterList();

        System.out.println(popcorn2024.getTotalOrders());
        System.out.println(popcorn2024.removeVariety("Butter Microwave"));
        System.out.println(popcorn2024.removeVariety("Sea Salt Splash"));
        System.out.println(popcorn2024.removeVariety("Kettle Corn"));
        System.out.println(popcorn2024);

    }
}