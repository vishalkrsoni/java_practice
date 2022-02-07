package oops_concepts;

import pack1.encapsulation;

class CTO extends Developer {
    public CTO(String name, int age) {
        super(name, age);

    }
}

class Developer extends Person {
    public Developer(String name, int age) {
        super(name, age);// It will call the persons class. so basically whenever we create a developer a
                         // person is created as super is used the call the constructor of its parent
                         // class

    }

    void walk() {
        System.out.println("dev. " + name + " is walking");
    }

}

abstract class Person {
    String name;
    int age;

    void eat() {
        System.out.println(name + " is Eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    void walk() {
        System.out.println(name + " is walking");
    }

    void works() {
        System.out.println(name + " is working");
    }

    static int count;// static bcoz we want to access with help of class/ class_type.

    public Person() {
        count++;
    }

    public Person(String name, int age) {
        // this();
        this.name = name;
        this.age = age;
        // abstract int count;
        count++;
        // System.out.println(name + " is created & count is " + count);
    }

    public static void main(String[] args) {
        // Person P1 = new Person("vishal", 28);
        Developer D1 = new Developer("Rahul", 26);
        CTO C1 = new CTO("Irfan", 27);
        /*
         * P1.name = "vishal"; P1.age = 24; P2.name = "Ravi"; P2.age = 32;
         * System.out.println(P1.name + " " + P2.name); P2.walk(); P1.eat();
         */
        encapsulation obj = new encapsulation();
        obj.doWork();
        // P1.walk();
        D1.sleep();
        // D1.walk();
        C1.eat();
    }

}
