package pack1;

import java.util.*;

class abcd {
    void print1() {
        System.out.println("case2");
    }

    void print2() {
        System.out.println("case3");
    }

    void print3() {
        System.out.println("case4");
    }

    void print4() {
        System.out.println("case5");
    }

    public static void main(String[] args) {
        int choice;
        abcd a = new abcd();
        Scanner S = new Scanner(System.in);
        while (true) {
            System.out.println("1.print1\n2.print2\n3.exit");
            choice = S.nextInt();

            switch (choice) {
            case 1:
                a.print1();
                break;
            case 2:
                a.print2();
                break;
            case 3:
                S.close();
                return;
            default:
                System.out.println("invalid input");
            }
            continue;
        }
    }
}