package carpet;

public class Floor {

   private double width;
    private double length;


public Floor(double width, double length){
    this.length = length;
    this.width = width;

    if (width < 0){
        length = 0;
    }
    if (length < 0){
        width = 0;
    }

}

public  double getArea (){
    return (width * length);
    }


}