package collection;

import java.util.*;

public class StsckExample {

	public static void main(String[] args) {
		Stack<String> stc=new Stack<String>();
		//Adding object in arrayList
		stc.push("Hello");
		stc.push("world");
		stc.push(".");
		stc.push("worls");
		stc.pop();
		
		//traversing list through iterator
		Iterator itr=stc.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
