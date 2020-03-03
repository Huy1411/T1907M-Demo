package Session2;

public class AptechStudent extends Student implements StudentInterface,HumanInterface {
    @Override
    public void showInfo() {
        System.out.println("hello student");
    }

    public void study() {
    }

    @Override
    public void playGame() {
    }

    @Override
    public void sleep() {
    }

    public void running() {
    }

    public int getAge() {
        return 0;
    }
    public void eating(){

    }
}
