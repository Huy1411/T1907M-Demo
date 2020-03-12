package Session7;

public class SubThread extends Thread {
    public void run() {
        Thread.currentThread().setName("SubThread");
        System.out.println(Thread.currentThread().getName());
//        for (int i = 10; i  >0; i--) {
//            System.out.println(i + "s");
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//            }
//        }
//        System.out.println("Chuc mung nam moi");

        int second = 60, minute = 10;
        for (second = 60; second >= 0; second--) {
            if (second < 0) {
                second = 59;
                minute--;
                if (minute < 0) {
                    minute = 9;
                }
            }
        }
        System.out.println(minute + "'" + second + "s");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
    }
}
