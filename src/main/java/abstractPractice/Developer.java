package abstractPractice;

public class Developer extends Human {

    public Developer(String name, String id, String gender) {
        super(name, id, gender);
    }

    @Override
    public void showRole() {
        System.out.println("I'm a Developer, my name is " + this.name);
    }
}
