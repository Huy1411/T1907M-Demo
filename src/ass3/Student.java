package ass3;

public class Student {
    int ID;
    String name;
    int age;

    public Student(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString () {
        return "ID: " + getID() + "- Name : " + getName() + "- Age: " + getAge();
    }

}
