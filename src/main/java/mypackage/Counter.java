package mypackage;

/**
 * Created by Hmayak Atayan on  25, Feb, 2021
 */
public class Counter {
    public int counter = 0;
    public static int staticCounter = 0;
    public Counter(){
        counter++;
        staticCounter++;
    }

    public static void main(String[] args) {
        Counter tester = new Counter();
        Counter tester1 = new Counter();
        Counter tester2 = new Counter();
        System.out.println("Counter: " + tester2.counter);
        System.out.println("Static Counter: " + Counter.staticCounter);

    }
}
