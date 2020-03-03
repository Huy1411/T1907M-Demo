package Session5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int x = 0;
        int y = 10;
//        try {
        int z = x / y;
        System.out.println(z);
        if (x <= 0) throw new Exception("Loi mat roi, khong chay tiep dc");
        System.out.println("in nguoc lai");
        z = y / x;
        System.out.println(z);

//        } catch (Exception e) {
//            System.out.println("Loi mat r");
//        } finally {
//            System.out.println("Luc nao cung chay qua");
//        }
        try {
            File f = new File("/Users/HuyLo/Desktop/data.txt");
            String st = "";
            if (f.canWrite()) {
                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.writeChars("xin chao, day la dong dau tien");
                dos.close();
                fos.close();
            }
            if (f.canRead()) {
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                st = dis.readLine();
                dis.close();
                fis.close();

            }

        } catch (Exception se) {
            System.out.println("Khong tim thay file hoac khong the su dung");
        }
        ;
    }
}
