package ass3;

public class Employee {
    int ID;
    String name;
    int salary;

    public Employee() {
    }

    public Employee(int ID, String name, int salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString () {
        return "ID: " + getID() + "- Name : " + getName() + "- Age: " + getSalary();
    }
}
