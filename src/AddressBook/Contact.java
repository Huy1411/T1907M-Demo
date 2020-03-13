package AddressBook;

public class Contact {
    public String name;
    public String company;
    public String email;
    public String phonenumber;

    public Contact(String name, String company, String email, String phonenumber) {
        this.name = name;
        this.company = company;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String toString () {
        return "Name " + getName() + "- Company : " + getCompany() + "- Email: " + getEmail() + "- PhoneNumber: " + getPhonenumber();
    }

}
