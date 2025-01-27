// Program to find the Fibonacci Series using Recursion

import java.util.Scanner;
public class Recursion2 {
    static int Fibonacci(int x)
    {
        if(x==0)
        {
            return 0;
        }
        else if(x==1)
        {
            return 1;
        }
        else
        {
            return Fibonacci(x-1)+Fibonacci(x-2);
        }
    }
    public static void main(String[] args)
    {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter any Number :");
        int y=Scan.nextInt();
        int result=Fibonacci(y);
        System.out.println(result);
        Scan.close();
    }
}
