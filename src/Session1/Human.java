package Session1;

public class Human {
    public int age = 10;

    //Hàm khởi tạo
    public Human(){
        System.out.println("Vua tao 1 object Human");
    }
     public Human(String msg){
         System.out.println(msg);
     }
     public Human(int x){
        age = x;
         System.out.println("Vua set age");
     }
     public Human(int y,String x){

     }
     public Human(String y,int x){

     }

    public void getInfo(){
        System.out.println("Age : " + age);
    }
    public  void getInfo(int a) {
        System.out.println("A : " + a);
    }
}
