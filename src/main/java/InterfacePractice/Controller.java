package InterfacePractice;

public interface Controller {
    Boolean powerFlag = null;

     default void pressPlusButton(){
        System.out.println("plus button pressed");
    }
     default void pressMinusButton() {
         System.out.println("minus button pressed");
     }
     default void pressUpButton() {
         System.out.println("up button pressed");
     }
     default void pressDownButton() {
         System.out.println("down button pressed");
     }
     default void on(){
            System.out.println("on");
     }
     default void off(){
            System.out.println("off");
     }
}
