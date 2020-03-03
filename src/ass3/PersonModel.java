package ass3;

import java.util.ArrayList;

public class PersonModel {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Nguyen Xuan A",12));
        students.add(new Student(2,"Nguyen Xuan B",12));
        students.add(new Student(3,"Nguyen Xuan A",12));
        for(Student s:students){
            System.out.println(students +"\n");
        }

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Nguyen Xuan A",14));
        employees.add(new Employee(2,"Nguyen Xuan A",14));
        employees.add(new Employee(3,"Nguyen Xuan A",14));
        System.out.println(employees +"\n");
    }

}
