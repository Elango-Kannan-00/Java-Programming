// Widening or implicit type casting
class TypeCasting 
{
    public static void main(String[] args) 
     {
       int myVariable=40;
       double myAnotherVariable=myVariable; //Implicit Casting
       System.out.println(myVariable);
       System.out.println(myAnotherVariable);
     }
}   
// Narrowing or explicit type casting
class TypeCasting1
{
    public static void main(String[] args) 
     {
        double myVariable=40.00;
        int myAnotherVariable=(int)myVariable; //Explicit Casting
        System.out.println(myVariable);
        System.out.println(myAnotherVariable);    
     }
           
} 
