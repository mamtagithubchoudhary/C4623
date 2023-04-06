package collection;
import java.util.*;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> linklist=new LinkedList<String>();
          //Adding object in Linkedlist
		linklist.add("Mango");
		linklist.add("Mango");
		linklist.add("Apple");
		linklist.add("Orange");
		linklist.add("Graphes");
		linklist.add("Apple");
		//Traversing list to iterator
		Iterator itr=linklist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}

//Output:-
//Mango
//Mango
//Apple
//Orange
//Graphes
//Apple