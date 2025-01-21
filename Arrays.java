public class Arrays 
{
    public static void main(String [] args)
    {
        int MyArray[] = {11,21,89,55,51,37,2,44,52,16};
        int LengthofMyArray= MyArray.length;
        for ( int i=0; i<LengthofMyArray; i++) /*Tradititonal for loop for accessing array elements 
                                                  and displaying index values*/
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
    
    // Output will be:
 /* Element at Index0 is 11
    Element at Index1 is 21
    Element at Index2 is 89
    Element at Index3 is 55
    Element at Index4 is 51
    Element at Index5 is 37
    Element at Index6 is 2
    Element at Index7 is 44
    Element at Index8 is 52
    Element at Index9 is 16
    Element is 11
    Element is 21
    Element is 89
    Element is 55
    Element is 51
    Element is 37
    Element is 2
    Element is 44
    Element is 52
    Element is 16
    Sum of the Array is :37
    The Smallest Number in the Array is :2 */
}
