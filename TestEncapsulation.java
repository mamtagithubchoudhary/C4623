package corejava1;

public class TestEncapsulation {

	public static void main(String[] args) {
		//Creating object of class EncapsulationExample
		EncapsulationExample a = new EncapsulationExample();
		//Object is used to access the methods of a class
		a.setId(1234);
		a.setName("Mamta Choudhary");
		System.out.println("Id:" + a.getId() +"\n"+ "Name:"+ a.getName());

	}

}
