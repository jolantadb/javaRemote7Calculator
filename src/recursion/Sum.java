package recursion;

public class Sum {

    public static void main(String[] args) {
        System.out.println(sumOfAllNumbers(0));


    }


    public static long sumOfAllNumbers (long number){
        if (number != 0){
            return number + sumOfAllNumbers(number - 1);

        }else {
            return  -1;
        }
    }
}
