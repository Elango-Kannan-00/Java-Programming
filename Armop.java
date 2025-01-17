import java.util.Scanner; // util package contains the Scanner function
public class Armop
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in); //creating an object called 'obj' for scanner purpose
System.out.println("Enter value 1:");
int a=obj.nextInt(); //nextInt function is used for reading int values from user
System.out.println("Enter value 2:");
int b=obj.nextInt(); //nextInt function is used for reading int values from user
int add = a+b;
int sub = a-b;
int mul = a*b;
int div = a/b;
System.out.println("ADDITION:" +add);
System.out.println("SUBTRACTION:" +sub);
System.out.println("MULTIPLICATION:" +mul);
System.out.println("DIVISION:" +div);
obj.close();
}
}