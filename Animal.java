package corejava1;

class Animal {
 //Method 
	public void display()
	{
	System.out.println("Inside parent class");
	}
	
	}
//child class
class Dog extends Animal
{
  public void sound() 
  {
   System.out.println("Barks...");
  }
}

class Puppy extends Dog
{
 public void run()
 {
	 System.out.println("He run by small step");
 }
}



class Tester{
	
	public static void main(String[] args)
	{
		Puppy a = new Puppy(); //creating object of child class
		a.display();
		a.sound();
		a.run();
	}
}
