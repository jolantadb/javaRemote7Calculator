package carpet;

public class Carpet {

    double cost;

    public Carpet (double cost){
        this.cost = cost;
//        cost = 8.0;

        if (cost < 0 ){
            cost = 0;
//            System.out.println("Cost: " + cost);
        }
    }

    public  double getCost(){
//        System.out.println(cost);
        return cost;
    }
}
