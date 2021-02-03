package questions;

/**
 * Created by Hmayak Atayan on  31, Jan, 2021
 */
public class Main {
    public static void main(String[] args) {
        B b = new B() {
            @Override
            public void go() {
                System.out.println("b");
            }
        };
        b.go();
    }

}
