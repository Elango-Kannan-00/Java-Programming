import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> Fruits = new ArrayList<String>();
        Fruits.add("Pineapple");
        Fruits.add("Mango");
        Fruits.add("Banana");
        Fruits.add("Grapes");
        Fruits.add("Orange");
        Fruits.add("Fig");
        Fruits.add("Apple");

        // iterating through the ArrayList
        for (String f : Fruits) {
            System.out.println(f);
        }

        // adding an element to the ArrayList
        Fruits.add(3, "Jackfruit");
        System.out.println("After the addition of the new element: ");
        for (String f : Fruits) {
            System.out.println(f);
        }

        // removing the element from the ArrayList
        Fruits.remove(1);
        System.out.println("After the deletion of the element: ");
        for (String f : Fruits) {
            System.out.println(f);
        }

        // updating the element in the ArrayList
        System.out.println("After the updation of the element: " + Fruits.set(2, "Papaya"));
        for (String f : Fruits) {
            System.out.println(f);
        }

        // ArrayList size
        System.out.println("The size of the ArrayList is: " + Fruits.size());

        // sorting the ArrayList
        Collections.sort(Fruits);
        for (String f:Fruits){
            System.out.println(f);
        }
    }
}