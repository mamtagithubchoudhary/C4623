package corejava1;

public class Animalex {
  public void makesound()
  {
	  System.out.println("The Animal makes a sound");
  }
  
}
class Dog22 extends Animalex
{
	 public void makesound()
	  {
		  System.out.println("Bark............");
	  }
	  
}
class Cat22 extends Animalex
{
	 public void makesound()
	  {
		  System.out.println("Meow.......");
	  }
	  	
}
 class Small
{
   public static void main(String[] args)
   {
	   
	   Animalex e=new Animalex();
	   Dog22 d=new Dog22();
	   Cat22 c=new Cat22();
	   e.makesound();
	   d.makesound();
	   c.makesound();
	   //creating another object class Animal2 that refer to the object of type Dog2
	   Animalex aa=new Dog22();
	   aa.makesound();
	   
   }
}