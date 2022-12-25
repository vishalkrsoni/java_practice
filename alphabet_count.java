package java_practice;

import java.util.*;

class alphabet_count {

    void char_count(String value) {
        String temp = "";
        int count = 1;
        for (int i = 1; i <= value.length() - 1; i++) {
            if (value.charAt(i - 1) == value.charAt(i)) {
                count++;
            } else if (value.charAt(i - 1) != value.charAt(i)) {
                temp = temp + "-" + count + value.charAt(i - 1);
                count = 1;
            } else {
                temp = temp + count + value.charAt(i - 1);
            }
        }
        temp = temp + "-" + count + value.charAt(value.length() - 1);
        System.out.println("Desired output is: " + temp);
    }

    public static void main(String[] args) {

        alphabet_count a = new alphabet_count();
        Scanner S = new Scanner(System.in);
        System.out.println("Ensert a string:");
        String value = S.next();
        S.close();
        a.char_count(value);

    }
}