package org.example;

public class MainApp {
    public static void main(String[] args) {
        Person jerry = new Person("Jerry", 70, 900);
        Person tom = new Person("Tom", 65, 1100);
        Person harry = new Person("Harry", 54, 1200);
        Person alice = new Person("Alice", 87, 1800);

        jerry.startLife();
        tom.startLife();
        harry.startLife();
        alice.startLife();
    }
}
