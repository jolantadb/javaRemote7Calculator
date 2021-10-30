package carpet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Floor input width: ");
       double width =  scanner.nextDouble();
        System.out.println("Floor input length: ");
       double length = scanner.nextDouble();

        Floor floor = new Floor(width, length);

        System.out.println("Enter carpet price per sqm: ");
        double cost = scanner.nextDouble();
        Carpet carpet = new Carpet(cost);

        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("That will cost you: " + calculator.getTotalCost());

    }
}


