public class MethodOverloading 
{
    static double myMethod(double x, double t) 
    {
        return x + t;
    }

    static int myMethod(int x, int y) 
    {
        return x + y;
    }

    public static void main(String[] args) 
    {
        int c = myMethod(1, 3);
        System.out.println("The Sum is: " + c);
        double d = myMethod(99.99, 99.99);
        System.out.println("The Sum is: " + d);
    }
}

//  Output
  //  The Sum is 4.
  //  The Sum is 199.98.
