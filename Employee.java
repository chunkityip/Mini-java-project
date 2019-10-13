import java.util.*;

public class Employee {
    String name;
    int idNumber;
    String department;
    String position;

    Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getid() {
        return idNumber;
    }

    public void setid(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getdeparetment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    public String getposition() {
        return position;
    }

    public void setposition(String position) {
        this.position = position;
    }

    public String toString() {
        return name + "  " + idNumber + "  " + department + "  " + position;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Enginner");

        System.out.println("Name\tID Number\tDepartment\tPosition");
        System.out.println("----------------------------------------------------------");
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());

    }
}
