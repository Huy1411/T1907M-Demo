package Ex1;

import java.util.Scanner;

public class TamGiac {
    public int a, b, c;

    public TamGiac() {

    }

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getChuvi() {
        int cv = a + b + c;
        return cv;
    }

    public double getDientich() {
        double dt;
        double p = (double)(a + b + c) / 2;
        dt = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return dt;
    }

//    public void nhap3canh(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Canh a = ");
//        a = sc.nextInt();
//        System.out.println("Canh b = ");
//        b = sc.nextInt();
//        System.out.println("Canh c = ");
//        c = sc.nextInt();
//    }
//    public void showInfo() {
//        do {
//            System.out.println("Moi nhap lai");
//            nhap3canh();
//        } while (!kiemTra());
//            System.out.println("Chu vi tam giac = " + getChuvi());
//            System.out.println("Dien tich tam giac = " + getDientich());
//        }
//    public boolean kiemTra() {
//        if (a + b > c && a + c > b && c + a > b) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }


}
