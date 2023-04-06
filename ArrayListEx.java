package collection;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.*;//import java utility class

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> arraylist=new ArrayList<String>();
          //Adding object in Arraylist
		arraylist.add("Mango");
		arraylist.add("Mango");
		arraylist.add("Apple");
		arraylist.add("Orange");
		arraylist.add("Graphes");
		arraylist.add("Apple");
		//Traversing list to iterator
		Iterator itr=arraylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
