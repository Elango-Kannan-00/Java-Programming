// Program to find the sum of the sequence of numbers using recursion.
    import java.util.Scanner;
    public class Recursion 
    {
        int x;
        static int sequenceAdd(int x)
        {
            if (x>0)
            {
               return x+sequenceAdd(x-1);
            }
            else
            {
                return 0;
            }
        }
        public static void main(String[] Elango)
        {
         Scanner Scan=new Scanner(System.in);
         System.out.println("Enter any number :");
         int x=Scan.nextInt();
         int result=sequenceAdd(x);
         System.out.println(result);
         Scan.close();
        }
    }
    // Output:
    // Enter any number :
    // 5
    // 15 

