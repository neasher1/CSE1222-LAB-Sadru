class Employee {
    private String name;
    private double salary;
  
    public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
    }
  
    public String toString() {
      return "Name: " + name + " Salary: $" + salary;
    }
  }
  
  class Manager extends Employee {
    private String department;
  
    public Manager(String name, double salary, String department) {
      super(name, salary);
      this.department = department;
    }
  
    public String toString() {
      return super.toString() + " Department: " + department;
    }
  }
  
  class Executive extends Manager {
    public Executive(String name, double salary, String department) {
      super(name, salary, department);
    }
  
    public String toString() {
      return "Executive: " + super.toString();
    }
  }
  
  public class Problem1 {
    public static void main(String[] args) {
      Employee e = new Employee("John Doe", 50000);
      System.out.println(e.toString());
  
      Manager m = new Manager("Jane Doe", 60000, "Marketing");
      System.out.println(m.toString());
  
      Executive ex = new Executive("Jim Doe", 70000, "Sales");
      System.out.println(ex.toString());
    }
  }
  