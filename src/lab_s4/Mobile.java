package lab_s4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Mobile<S,T,N> {
    public S brandName;
    public T seri;
    public N year;

    public Mobile() {
    }

    public Mobile(S brandName, T seri, N year) {
        this.brandName = brandName;
        this.seri = seri;
        this.year = year;
    }

    public S getBrandName() {
        return brandName;
    }

    public void setBrandName(S brandName) {
        this.brandName = brandName;
    }

    public T getSeri() {
        return seri;
    }

    public void setSeri(T seri) {
        this.seri = seri;
    }

    public N getYear() {
        return year;
    }

    public void setYear(N year) {
        this.year = year;
    }
    public boolean checkGuarantee(){
        // LocalDate nadeYear = LocalDate.of((Integer),year,1,1); // tao ra 1 object cua localdate lay theo ngay thang trong may
        LocalDate now = LocalDate.now();
        if ((Integer)year < (now.getYear() - 5)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //Java time
        LocalDate lc = LocalDate.now(); //ngay hien tai
//        LocalDate lc2 = LocalDate.of(2019,2,29); //
        LocalDate lc3 = LocalDate.of(2020,2,29); //
        LocalDate lc4 = LocalDate.parse("2019-04-29"); // ra ngay chinh xac bang chuoi chuan iso yyyy-mm-dd
        LocalDate lc5 = lc3.minusYears(1);
        System.out.println(lc5);


        LocalDateTime dt = LocalDateTime.now();// ngay gio hien tai
        LocalDateTime dt2 = LocalDateTime.of(2020,03,02,12,20,45);//ngay gio chinh xac
        LocalDateTime dt3 = LocalDateTime.parse("2020-03-03T10:34:45.406");

        System.out.println(dt);

        System.out.println("Nhap nam kiem tra");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        LocalDate kt = LocalDate.of(x,2,28);
        LocalDate nextday = kt.plusDays(1);
        if(nextday.getDayOfMonth() == 29){
            //nam nhuan
        }

    }
}
