package pack1;

import java.util.*;

public class My_array {
    void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-" + arr[i] + "-");
        }
        System.out.println();
    }

    void rev(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print("-" + arr[i] + "-");
        }
        System.out.println();
    }

    void search(int arr[], int val) {
        boolean flag = false;
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                flag = true;
                position = i + 1;
            }
        }
        if (flag == false) {
            System.out.println(val + " is not present in the Array");
        } else {
            System.out.print("Pos. is:" + position + " & Array_index is:" + (position - 1) + "\n");
        }
    }

    void bubble_sort(int arr[]) {
        int size = arr.length, temp;
        int arr2[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 1; j < size; j++) {
                if (arr2[j - 1] > arr2[j]) {
                    temp = arr2[j - 1];
                    arr2[j - 1] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        display(arr2);
    }

    void selection_sort(int arr[]) {
        int min, temp, size = arr.length;
        int arr1[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr1[j] < arr1[min]) {
                    temp = arr1[j];
                    arr1[j] = arr1[min];
                    arr1[min] = temp;
                }
            }
        }
        display(arr1);
    }

    void rev_sort(int arr[]) {
        int size = arr.length;
        int arr2[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr2[size - i] = arr[i];
        }
        display(arr2);
    }

    void magic(int arr[]) {
        int size = arr.length;
        int arr3[] = new int[size];
        int temp, min, strong = 0, weak = 0, magic;
        for (int i = 0; i < size; i++) {
            arr3[i] = arr[i];
        }
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr3[j] < arr3[min]) {
                    temp = arr3[j];
                    arr3[j] = arr3[min];
                    arr3[min] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr3[i] == arr[i]) {
                strong = strong + arr3[i];
            } else {
                weak = weak + arr3[i];
            }
        }
        magic = strong - weak;
        System.out.println("Magic value is:" + magic);
        System.out.println();
    }

    public static void main(String[] args) {
        int size, val, choice;
        My_array M = new My_array();
        Scanner S = new Scanner(System.in);
        System.out.print("Enter total no. of inputs:");
        size = S.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter inputs:\n");
        for (int i = 0; i < size; i++) {
            arr[i] = S.nextInt();
        }
        while (true) {
            System.out.print(
                    "Enter your choice:\n1.Display Array\n2.Reverse Array\n3.Bubble Sort\n4.Selection sort\n5.Search a input\n6.Magic Number\n7.Exit\n");
            choice = S.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Inserted Array is:");
                M.display(arr);
                break;
            case 2:
                System.out.println("Your array in reverse order is:");
                M.rev(arr);
                break;
            case 3:
                System.out.println("Bubble-Sorted Array is:");
                M.bubble_sort(arr);
                break;
            case 4:
                System.out.println("Selectively-Sorted Array is:");
                M.selection_sort(arr);
                break;
            case 5:
                System.out.println("Your input to search:");
                val = S.nextInt();
                // System.out.println("input ");
                M.search(arr, val);
                break;
            case 7:
                S.close();
                System.out.println("Good-Bye ");
                return;
            case 6:
                M.magic(arr);
                break;
            default:
                System.out.println("Invalid Choice");
            }
            continue;
        }
    }
}