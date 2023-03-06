package corejava1;

class Employee {
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
   private String department;

    Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class Clerk extends Employee {
    private int hoursWorked;

    Clerk(String name, int id, double salary, int hoursWorked) {
        super(name, id, salary);
        this.hoursWorked = hoursWorked;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
    }
}

 class Mainn {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith", 1001, 50000.0, "Sales");
        Clerk clerk = new Clerk("Jane Doe", 2001, 25000.0, 40);
        manager.displayDetails();
        clerk.displayDetails();
    }
}