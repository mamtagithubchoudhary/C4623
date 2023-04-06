package collection;

import java.util.*;
import java.util.Iterator;

public class VectorEX {
	public static void main(String[] args) {
		//Create an empty Vector with an initial capacity of 5        
        Vector<String> vc = new Vector<>(4);  
        //Add elements in the vector by using add() method  
        vc.add("A");  
        vc.add("B");  
        vc.add("C");  
        vc.add("D");  
        vc.add("E");  
        //Print all the elements of a Vector  
        System.out.println("--Elements of Vector are--");             
        for (String str : vc) {           
           System.out.println("Alphabet= " +str);  
        }  

}
}

//Output
//--Elements of Vector are--
//Alphabet= A
//Alphabet= B
//Alphabet= C
//Alphabet= D
//Alphabet= E
