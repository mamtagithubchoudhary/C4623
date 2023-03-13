package corejava1;

interface Animalls 
{
   public void sound();
}
 class Monkey implements Animalls // Creating class Monkey
 {
	 public void sound() {
		 System.out.println("Monkey .......");
	 }
 }
 class Main
 {
	 public static void main(String[] args)
	 {
		 Monkey m = new Monkey();
		 m.sound();
	 }
 }