package abstractPractice;

public abstract class Human {
    protected String name;
    protected String id;
    protected String gender;

    public Human(String name, String id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public abstract void showRole();

    public void updateInfo(String changeName, String changeGender) {
        this.name = changeName;
        this.gender = changeGender;
    }
}

