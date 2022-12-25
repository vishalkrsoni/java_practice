package java_practice;

class Laptop {
    int ram;
    private int price;

    public void setPrice(int price) {
        boolean isAdmin = true;
        if (!isAdmin) {
            System.out.println("Sorry! You can't change price.");
        } else {
            this.price = price;
        }
    }

    public int getPrice() {
        return price;
    }

}

public class encapsulation {

    public static void main(String[] args) {
        Laptop L1 = new Laptop();
        L1.setPrice(200);
        System.out.println(L1.getPrice());
        // l1.set_price(price);

    }

}
