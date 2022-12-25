package java_practice;

import java.util.Scanner;

public class Patterns {
    void Tri1(int size) {
        int val = 65;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j <= i) {
                    if (j != 0) {
                        System.out.print("-");
                    }
                    System.out.print((char) val);
                }
                val++;
            }
            System.out.println();
        }
    }

    void Tri2(int size) {
        int val = 65;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                if (j != 0) {
                    System.out.print("-");
                }
                System.out.print((char) val);
            }
            val++;
            System.out.println();
        }
    }

    void Tri3(int size) {
        int val = 65;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) val + " ");
                val++;
            }
            System.out.println();
        }
    }

    void Tri4(int size) {
        int val = 65;
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) val + " ");
                val++;
            }
            System.out.println();
        }
    }

    void Tri5(int size) {
        int val = 65;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) val);
                val++;
            }
            System.out.println();
        }
    }

    void Tri6(int size) {
        int val = 65;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) val);
            }
            System.out.println();
        }
    }

    void Tri7(int size) {
        for (int i = 0; i < size; i++) {
            int val;
            if (i % 2 == 0) {
                val = 1;
            } else {
                val = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    void Tri8(int size) {
        int val = 65;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
                val++;
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) val);
                val++;
            }
            System.out.println();
        }
    }

    void Tri9(int size) {
        int val = 65;
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j <= size - i; j++) {
                System.out.print((char) val);
                val++;
            }
            System.out.println();
        }
    }

    void Tri10(int size) {
        int val = 0;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= size - i; j++) {

                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }

    void Tri11(int size) {
        int val = 65;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= size - i; j++) {
                System.out.print((char) val + " ");
                val++;
            }
            System.out.println();
        }
    }

    void Pyramid(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    void Pyramid_rev(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = (size * 2 - 1); j >= (i * 2) - 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void star(int size) {

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    void star1(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void star2(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void Tri12(int size) {
        int val = 65;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= size - i; j++) {
                System.out.print((char) val);
                val++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size, choice;
        Scanner S = new Scanner(System.in);
        Patterns P = new Patterns();
        System.out.println("Enter size for pattern: ");
        size = S.nextInt();

        while (true) {
            System.out.println("Enter pattern choice:\nFrom 1 to 17: \n18.Want to Exit:\n");
            choice = S.nextInt();
            switch (choice) {
            case 1:
                System.out.println();
                P.Tri1(size);
                System.out.println();
                break;
            case 2:
                System.out.println();
                P.Tri2(size);
                System.out.println();
                break;
            case 3:
                System.out.println();
                P.Tri3(size);
                System.out.println();
                break;
            case 4:
                System.out.println();
                P.Tri4(size);
                System.out.println();
                break;
            case 5:
                System.out.println();
                P.Tri5(size);
                System.out.println();
                break;
            case 6:
                System.out.println();
                P.Tri6(size);
                System.out.println();
                break;
            case 7:
                System.out.println();
                P.Tri7(size);
                System.out.println();
                break;
            case 8:
                System.out.println();
                P.Tri8(size);
                System.out.println();
                break;
            case 9:
                System.out.println();
                P.Tri9(size);
                System.out.println();
                break;
            case 10:
                System.out.println();
                P.Tri10(size);
                System.out.println();
                break;
            case 11:
                System.out.println();
                P.Tri11(size);
                System.out.println();
                break;
            case 12:
                System.out.println();
                P.star(size);
                System.out.println();
                break;
            case 13:
                System.out.println();
                P.star1(size);
                System.out.println();
                break;
            case 14:
                System.out.println();
                P.star2(size);
                System.out.println();
                break;
            case 15:
                System.out.println();
                P.Pyramid(size);
                System.out.println();
                break;
            case 16:
                System.out.println();
                P.Pyramid_rev(size);
                System.out.println();
                break;
            case 17:
                System.out.println();
                P.Tri12(size);
                System.out.println();
                break;
            case 18:
                S.close();
                System.out.println("Good Bye!!");
                return;
            default:
                System.out.println("Invalid Input!");
                System.out.println();
            }
            continue;
        }
    }
}