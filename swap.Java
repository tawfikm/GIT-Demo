public class Swap {

    public static  void  main(String args[]){

        int x = 10;
        int y = 20;

        System.out.println("x is " + x);
        System.out.println("y is " + y);


        System.out.println("swapping...");

        // swapping
        int temp = x;
        x = y;
        y = temp;

        System.out.println("x is " + x);
        System.out.println("y is " + y);

    }
}