package Ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        TamGiac tg = new TamGiac();
//        tg.nhap3canh;
//        tg.showInfo;


        int a,b,c;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Canh a = ");
            a = sc.nextInt();
            System.out.println("Canh b = ");
            b = sc.nextInt();
            System.out.println("Canh c = ");
            c = sc.nextInt();
        }while (!checkTamGiac(a,b,c));
        TamGiac tg = new TamGiac(a,b,c);
        System.out.println("Chu vi : " + tg.getChuvi());
        System.out.println("Dien tich : " + tg.getDientich());
    }

    public static boolean checkTamGiac(int a,int b, int c) {
        if (a + b > c && a + c > b && c + a > b) {
            return true;
        } else {
            return false;
        }
    }
}
