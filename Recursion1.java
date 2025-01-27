//  Sequence Factorial using Recursion

import java.util.Scanner;
public class Recursion1 {
    static int sequenceFactorial(int x)
    {
        if(x>0)
        {
            return x*sequenceFactorial(x-1);
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args)
    {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter any Number :");
        int y=Scan.nextInt();
        int result=sequenceFactorial(y);
        System.out.println(result);
        Scan.close();
    }
}

// Output:
// Enter any Number
// 5
// 120