package abstractPractice;

public class Doctor extends Human {

    public Doctor(String name, String id, String gender) {
        super(name, id, gender);
    }

    @Override
    public void showRole() {
        System.out.println("I'm a Doctor, my name is " + this.name);
    }
}
