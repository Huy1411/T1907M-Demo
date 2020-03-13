package AddressBook;


import java.util.ArrayList;

public class ContactList extends Contact {
    public ArrayList<Contact> contactlist = new ArrayList<>();
    public static void startContact(){
        System.out.println("AddressBook ...");
    }

    public void addnewContact(Contact contact) {
        contactlist.add(contact);
    }

    public void showContact() {
        for (Contact p : contactlist) {
            System.out.println(p.toString());
        }
    }
    public boolean findContact(String name){
        for(int i=0;i<contactlist.size();i++){
            Contact contact = contactlist.get(i);
            if(contact.getName().equals(name)){
                System.out.println("Name " + getName() + "- Company : " + getCompany() + "- Email: " + getEmail() + "- PhoneNumber: " + getPhonenumber());
                return true;
            }
        }
        System.out.println("Contact not found");
        return false;
    }
}
