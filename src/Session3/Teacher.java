package Session3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Teacher {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("hello");
        stringArrayList.add("world");
        stringArrayList.add("aa");
        stringArrayList.add("bb");
        stringArrayList.add("cc");
        stringArrayList.add("aa");
        System.out.println("In ra ArrayList");
        for(String s:stringArrayList){
            System.out.println(s);
        }
//        System.out.println("Kich thuoc tap hop : " + stringArrayList.size());
//        stringArrayList.remove("hello");

        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("aa");
        stringHashSet.add("bb");
        stringHashSet.add("cc");
        stringHashSet.add("aa");
        System.out.println("In ra HashSet");
        for(String s:stringHashSet){
            System.out.println(s);
        }

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("le van nam");
        priorityQueue.add("mai van dao");
        priorityQueue.add("do duy hai");
        priorityQueue.add("pham duc chinh");
        priorityQueue.add("hoang trong ha");

        System.out.println("In ra PriortyQueue");
        for(String s:priorityQueue){
            System.out.println(s);
        };

        //Cách lấy ra sử dụng PriorityQueue
        System.out.println("Lay ra su dung PriortyQueue");
        for(;!priorityQueue.isEmpty();){
            System.out.println(priorityQueue.poll());
        }

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("phong_cua_Ha","10m2");
        hashMap.put("phong_cua_Ngoc","20m2");
        hashMap.put("phong_cua_Huy","5m2");

        System.out.println("Phong cua Ha: "+hashMap.get("phong_cua_Ha"));

        HashMap<Integer,String> hashMap1 = new HashMap<>();
        hashMap1.put(0,"xin chao thu 4");
        hashMap1.put(5,"xin chao thu 5");
        hashMap1.put(6,"xin chao thu 3");
        System.out.println(hashMap1.get(5));
    }
    public  String  toString(){
        return "hello world";
    }
}
