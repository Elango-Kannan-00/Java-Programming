public class Arrays 
{
    public static void main(String [] args)
    {
        int MyArray[] = {11,21,89,55,51,37,2,44,52,16};
        int LengthofMyArray= MyArray.length;
        for ( int i=0; i<LengthofMyArray; i++) /*Tradititonal for loop for accessing array elements 
                                                  and displaying indexvalues*/
        {
            System.out.println("Element at Index" +i+" is " +MyArray[i]);
        }
        // Now we will use for-each loop to access array elements
        for ( int element : MyArray)
        {
            System.out.println("Element is " +element); /* Mostly used to iterate through the array without 
                                                              using Index*/ 
        }

        // Now let we find avg of the Array

         int Sum=0;
         for ( int element : MyArray)
         {
            Sum+=element; // Sum of all elements of the array
         }
         int Average = Sum/LengthofMyArray;
         System.out.println("Sum of the Array is :" +Average);

         //Finding the smallest number in the given array
        
        int Smallest_no = MyArray[0]; 
        for( int Number : MyArray)
        {
            if(Smallest_no > Number)
            {
                Smallest_no=Number;
            }
        }
        System.out.println("The Smallest Number in the Array is :" +Smallest_no);
    }
    
}
