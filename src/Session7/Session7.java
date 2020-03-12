package Session7;

public class Session7 {
    public static void main(String[] args) {

        //extend Thread
//        CounterF1 cf1 = new CounterF1();
//        cf1.setPriority(8);
//        cf1.start();
//
//        MyThread mt1 = new MyThread();
//        mt1.setPriority(Thread.MAX_PRIORITY);
//        mt1.start();

        SubThread st1 = new SubThread();
        st1.start();

        //implements Runnable
//        CounterF2 cf2 = new CounterF2();
//        Thread th= new Thread(cf2);
//        th.start();


//        int x = 10;
        //Lop an danh
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread tao tu lop an danh "+x);
//            }
//        };
//        new Thread(r1).start();


        //Lamda expression // Neu co 1 interface ma trong interface chi co 1 ham -> functional interface
//        Runnable r2 =  ()->{
//            System.out.println("Thread tao tu lop an danh ");
//        };
//        new Thread(r2).start();
//        for(int i= 0; i<100;i++){
//            System.out.println("main - " +i);
//            try{
//                Thread.sleep(150);
//            }catch (Exception e){
//            }
//        }
//        System.out.println("Thread : " +Thread.currentThread().getName());
//        System.out.println("Main finish");
//
    }
}
