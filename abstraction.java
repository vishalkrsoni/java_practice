package oops_concepts;

abstract class Car {
    int price;

    abstract void start();
}

class Audi extends Car {
    void start() {
        System.out.println("Audi Car started");
    }
}

class BMW extends Car {
    void start() {
        System.out.println("BMW Car started");
    }
}

class Tesla extends Car {
    void start() {
        System.out.println("Tesla Car started");
    }
}

public class abstraction {
    public static void main(String[] args) {

    }
}
