package Session1;

import Session1_Demo.Toyota;

public class Main {
    public static void main(String[] args) {
        Human h = new Human(15);
        System.out.println("Tuoi : " + h.age);
        h.getInfo();

        Human ah = new Human();
        ah.getInfo(5);

        Toyota ty = new Toyota();
        ty.getInfo();

        Car c = new Car();
        c.setYear(1999);
        System.out.println("Year : " + c.getYear());
        System.out.println("Type : " + c.getTypeCar());
        Car c2 = new Car();
        c2.setYear(2000);
        System.out.println("Brand : " + c.brand);

    }
}
