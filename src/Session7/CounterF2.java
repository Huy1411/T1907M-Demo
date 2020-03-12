package Session7;

public class CounterF2 implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<100;i++){
            System.out.println("F2 - " +i);
            try{
                Thread.sleep(100);
            }catch (Exception e){
            }
        }
        System.out.println("Thread " +Thread.currentThread().getName());
        //change name
        Thread.currentThread().setName("Counter F2");
        System.out.println("After Change Name : "  +Thread.currentThread().getName());
        System.out.println("F2 finish");
    }
}
