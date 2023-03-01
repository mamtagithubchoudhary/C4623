package corejava1;

public class StudentData {
	public static void main(String[] args){
     //Create Object of a class
	Student a= new Student();
	//Object is used to access the methods of a class
	a.setId(12);
	a.setName("Mamta");
	a.setAge(24);
	System.out.println("Id:"+a.getId()+"\n"+"Name:"+a.getName()+"\n"+"Age:"+a.getAge());
}
}
