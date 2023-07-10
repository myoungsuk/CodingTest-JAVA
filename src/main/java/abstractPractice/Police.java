package abstractPractice;

public class Police extends Human{

    public Police(String name, String id, String gender) {
        super(name, id, gender);
    }
    @Override
    public void showRole() {
        System.out.println("경찰입니다." + this.name);
    }
}

