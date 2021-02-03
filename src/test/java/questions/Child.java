package questions;

/**
 * Created by Hmayak Atayan on  29, Jan, 2021
 */
public class Child extends Parent {
    private String name;
    private String lastName;
    private int id;


    public void walk() {
        System.out.println("child walking");
    }

    public Child(String name, String lastName, int id) {
      super(name);
        System.out.println("someText");
        this.name = name;
    }
}
