// A method with simple program
class Method 
{
    static void myMethod() 
    {
        System.out.println("Hi this is a smaple program");
    }
    public static void main(String [] args)
    {
        myMethod();
    }
}

// Methods with parameter
// Single paramter
class Method1 
{
  static void myMethod(String Name) 
  {
    System.out.println("Hi " + Name);
  }  
  public static void main(String [] args)
  {
    myMethod("Elango");
    myMethod("Kannan");
  }  
}

// Multi Parameter
class Method2
{
    static void myMethod(int x, double t)
    {
     int sum = x+(int)t;
     System.out.println("Sum is  " +sum);
    }
    public static void main(String [] args)
    {
        myMethod(34,56.798);

    }
}

// Method with return type
class Method3
{
    static int myMethod( int x, int t)
    {
        int c =x+t;   // or we can use - return x+t;
        return c;
    }
    public static void main(String [] args)
    {
        int c = myMethod(54, 46);
        System.out.println(" The Sum is : " + c);
    }
}

// Output 
  // HI this is a Sample Program
  // Hi Elango
  // Hi Kannan
  // 90
  // 100
