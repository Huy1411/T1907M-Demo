package OnTap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class PhoneBook extends Phone {

    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
//        for(int i =0;i < PhoneList.size();i++){
//            PhoneList.get(i);
//        }
        for (PhoneNumber p : PhoneList) { //foreach
            if (p.name.equals(name)) {
                if (p.phone.equals(phone)) {
                    return;
                }
                p.phone += p.phone + ":" + phone;
                return;
            }
        }
        PhoneList.add(new PhoneNumber(name, phone));
    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber p : PhoneList) {
            if (p.name.equals(name)) {
                PhoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {

        for (PhoneNumber p : PhoneList) {
            if (p.name.equals(name)) {
                p.phone = newphone;
                return;
            }
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for (PhoneNumber p : PhoneList) {
            if (p.name.equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void sort() {

    }

//    @Override
//    public void sort() {
//        Collection.sort(PhoneList, new Comparator<PhoneNumber>() {
//            public int compare(PhoneNumber o1, PhoneNumber o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });
//        for (PhoneNumber p : PhoneList) {
//
//            System.out.println((p.name + ":" + p.phone));
//        }
//    }
}
