public class Error2 
{
    @SuppressWarnings("unused")
    public static void main(String[] args) 
    {
        try 
        {
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }

        try 
        {
            String str = "Hello";
            int length = str.length();
            System.out.println("Length of string: " + length);

            String nullStr = null;
            if (nullStr != null) 
            {
                int nullLength = nullStr.length();
                System.out.println("Length of null string: " + nullLength);
            } 
            else 
            {
                System.out.println("The string is null.");
            }
        } 
        catch (NullPointerException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}