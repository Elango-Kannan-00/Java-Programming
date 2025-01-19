class Strings 
{
    public static void main(String[] args)
    {
        String MyString0 = "hi, hello"; // Initialize MyString0 with "hi, hello"
        String MyString1 = "this is java programming"; // Initialize MyString1 with "this is java programming"
        String MyString2 = "1121"; // Initialize MyString2 with "1121"
        System.out.println(MyString0); // Print MyString0
        System.out.println(MyString1); // Print MyString1
        System.out.println("The length of MyString0 is: " + MyString0.length()); // Print the length of MyString0
        String MyString3 = MyString0.toUpperCase(); // Convert MyString0 to uppercase and store in MyString3
        String MyString4 = MyString1.toUpperCase(); // Convert MyString1 to uppercase and store in MyString4
        System.out.println(MyString3); // Print MyString3
        System.out.println(MyString4); // Print MyString4
        System.out.println(MyString0.concat(MyString1)); // Concatenate MyString0 and MyString1 
        System.out.println(MyString0 + " " + MyString2); // Concatenate MyString0 and MyString2  
    }
}

// Output:
    // hi, hello
    // this is java programming
    // The length of MyString0 is: 9
    // HI, HELLO
    // THIS IS JAVA PROGRAMMING
    // hi, hellothis is java programming
    // hi, hello 1121