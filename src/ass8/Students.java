package ass8;

public class Students {
    int id;
    String name;
    int age;
    int mark;
    public Students(int id, String name, int age, int mark) {
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String toString() {
        return getId() + "-" + getName() + "-" + getAge() + "-" + getMark();
    }
}
