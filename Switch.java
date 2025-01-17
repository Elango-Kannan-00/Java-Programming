// import java.io.*;
public class Switch
{ 
public static void main(String[] args)
{
int day= 6;
switch(day)
{
    case 1 -> System.out.println("Sunday");
    case 2 -> System.out.println("Monday");
    case 3 -> System.out.println("Tuesday");
    case 4 -> System.out.println("Wednesday");
    case 6 -> System.out.println("Thursday");
    case 7 -> System.out.println("Friday");
    case 8 -> System.out.println("Saturday");
    default -> System.out.println("There is no day"); 
}
}
}