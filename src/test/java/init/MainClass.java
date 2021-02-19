package init;

/**
 * Created by Hmayak Atayan on  10, Feb, 2021
 */
public class MainClass {
    public static void main(String[] args) {


        Man john = new Man();
        john.age = 20;
        john.name = "john";
        System.out.println(john.age);
        System.out.println("john.name = " + john.name);
        System.out.println("john.RULE = " + john.RULE);
        System.out.println("------------------------");
        
        Man alice = new Man();
        alice.name = "Alice";
        alice.age = 30;
        System.out.println("alice.name = " + alice.name);
        System.out.println("alice.age = " + alice.age);
        System.out.println("alice.RULE = " + alice.RULE);

        System.out.println("-------------------------------");
        System.out.println("Man.RULE = " + Man.RULE);
    }
}