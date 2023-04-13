package corejava1;

// Java Program to print TreeSet in reverse Order
import java.util.TreeSet;
 
public class TreeSetDescending
{
 
    public static void main(String[] args)
    {
        // Declare a tree set
        TreeSet<Object> ints = new TreeSet<Object>();
        ints.add(2);
        ints.add(20);
        ints.add(10);
        ints.add(5);
        ints.add(7);
        ints.add(3);
 
        // Initialize tree set with
        // predefined set in reverse order
        // using descendingSet()
        TreeSet<Object> intsReverse =
            (TreeSet<Object>)ints.descendingSet();
 
        // Print the set
        System.out.println("Without descendingSet(): " +
                                                 ints);
        System.out.println("With descendingSet(): " +
                                           intsReverse);
    }
}

//Output:-
//Without descendingSet(): [2, 3, 5, 7, 10, 20]
//With descendingSet(): [20, 10, 7, 5, 3, 2]

