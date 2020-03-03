package Session1_Demo;

import Session1.Car;

public class Toyota extends Car {
    protected int price;

    public Toyota(int year, String typeCar, String brand, int price) {
        super(year, typeCar, brand);
        this.price = price;
    }

    public Toyota() {

    }

    public void showInfo() {
        super.getInfo();
        this.setYear(2003);
        System.out.println("Year : " + year);
        System.out.println("Type : " + typeCar);
        System.out.println("Brand : " + brand);
    }

    public void getInfo(){
        System.out.println("Toyota 2019");
    }
}
