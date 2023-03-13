package corejava1;

 interface MyInterface
 {
   public void MyInterface();
}
class MyClass implements MyInterface
{
	public void MyInterface()
	{
		 System.out.println("Doing something");
	}
}
class MyMain
{
	public static void main(String[] args)
	{
		MyClass c = new MyClass();
		c.MyInterface();
	}
}