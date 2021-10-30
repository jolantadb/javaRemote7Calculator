package carpet;

public class Carpet {

    double cost;

    public Carpet (double cost){


//        if (cost < 0 ){
//            cost = 0;
//        }

        this.cost = (cost < 0) ? 0 : cost;

    }

    public  double getCost(){

        return cost;
    }
}
