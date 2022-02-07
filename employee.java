package oops_concepts;

import java.util.*;

public class employee {
    void insert(int Emp_id[], String Ename[], int Mobile[]) {
        int size;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter No. of records to insert:\n");
        size = S.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Employee_id-" + (i + 1));
            Emp_id[i] = S.nextInt();
            System.out.println("Enter Employee_Name-" + (i + 1));
            Ename[i] = S.next();
            System.out.println("Enter Contact No.-" + (i + 1));
            Mobile[i] = S.nextInt();
            S.close();
        }
    }

    void view(int Emp_id[], String Ename[], int Mobile[]) {
        int size;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter No. of records to display:\n");
        size = S.nextInt();
        System.out.println("Emp_id :  Ename  :  Mobile");

        for (int i = 0; i < size; i++) {
            System.out.print(" " + Emp_id[i]);
            System.out.print("       " + Ename[i]);
            System.out.print("       " + Mobile[i]);
            System.out.println();

        }
        S.close();
    }

    void search(int Emp_id[], String Ename[], int Mobile[]) {
        int size = 6, pref1, empno; // index = 0;
        String name;
        Scanner S = new Scanner(System.in);
        System.out.println("Based on what you want to delete:\n1.Emp_id\n2.Emp_name\n3.Contact No.\n");
        pref1 = S.nextInt();
        S.close();

        switch (pref1) {
        case 1:
            System.out.println("Enter Employee Number:");
            empno = S.nextInt();
            for (int i = 0; i < size; i++) {
                if (Emp_id[i] == empno) {
                    System.out.println(Emp_id[i] + " " + Ename + " " + Mobile[i]);
                }
            }
            break;
        case 2:
            System.out.println("Enter Employee Name:");
            name = S.next();
            for (int i = 0; i < size; i++) {
                if (Ename[i] == name) {
                    System.out.println(Emp_id[i] + " " + Ename[i] + " " + Mobile[i]);
                }
            }
            break;
        case 3:
            S.close();
            return;
        }
    }

    void delete(int Emp_id[], String Ename[], int Mobile[]) {
        int size = 6, pref, empno, mob, index = 0;
        String name;
        Scanner S = new Scanner(System.in);
        System.out.println("Based on what you want to delete:\n1.Emp_id\n2.Emp_name\n3.Contact No.\n");
        pref = S.nextInt();
        S.close();
        int temp1[] = new int[size];
        String temp2[] = new String[size];
        int temp3[] = new int[size];
        switch (pref) {
        case 1:
            System.out.println("Enter Employee Number:");
            empno = S.nextInt();
            for (int i = 0; i < size; i++) {

                if (Emp_id[i] == empno) {
                    index = i;
                }
                continue;
            }
            for (int i = 0; i < size; i++) {
                if (i < index) {
                    temp1[i] = Emp_id[i];
                    temp2[i] = Ename[i];
                    temp3[i] = Mobile[i];
                }
                if (i == index) {
                    continue;
                } else {
                    for (int j = index; j < size - 1; j++) {
                        temp1[j] = Emp_id[j + 1];
                        temp2[j] = Ename[j + 1];
                        temp3[j] = Mobile[j + 1];
                    }
                }
            }
            for (int i = 0; i < temp1.length; i++) {
                Emp_id[i] = temp1[i];
                Ename[i] = temp2[i];
                Mobile[i] = temp3[i];
            }
            break;
        case 2:
            System.out.println("Enter Employee Name:");
            name = S.next();
            for (int i = 0; i < size; i++) {
                if (Ename[i] == name) {
                    index = i;
                }
                continue;
            }
            for (int i = 0; i < size; i++) {
                if (i < index) {
                    temp1[i] = Emp_id[i];
                    temp2[i] = Ename[i];
                    temp3[i] = Mobile[i];
                }
                if (i == index) {
                    continue;
                } else {
                    for (int j = index; j < size - 1; j++) {
                        temp1[j] = Emp_id[j + 1];
                        temp2[j] = Ename[j + 1];
                        temp3[j] = Mobile[j + 1];
                    }
                }
            }
            for (int i = 0; i < temp1.length; i++) {
                Emp_id[i] = temp1[i];
                Ename[i] = temp2[i];
                Mobile[i] = temp3[i];
            }
            break;
        case 3:
            System.out.println("Enter Contact Number:");
            mob = S.nextInt();
            for (int i = 0; i < size; i++) {
                if (Mobile[i] == mob) {
                    index = i;
                }
            }
            for (int i = 0; i < size; i++) {
                if (i < index) {
                    temp1[i] = Emp_id[i];
                    temp2[i] = Ename[i];
                    temp3[i] = Mobile[i];
                }
                if (i == index) {
                    continue;
                } else {
                    for (int j = index; j < size - 1; j++) {
                        temp1[j] = Emp_id[j + 1];
                        temp2[j] = Ename[j + 1];
                        temp3[j] = Mobile[j + 1];
                    }
                }
            }
            for (int i = 0; i < temp1.length; i++) {
                Emp_id[i] = temp1[i];
                Ename[i] = temp2[i];
                Mobile[i] = temp3[i];
            }
            break;
        case 4:
            S.close();
            return;
        default:
            System.out.println("invalid");
        }
    }

    public static void main(String[] args) {
        int choice;
        employee e = new employee();
        Scanner S = new Scanner(System.in);
        int Emp_id[] = new int[100];
        String Ename[] = new String[100];
        int Mobile[] = new int[100];

        while (true) {
            System.out.println("Enter your choice:\n1.Insert Data\n2.View Data\n3.Delete\n4.search\n5.Exit");
            choice = S.nextInt();
            S.close();
            switch (choice) {
            case 1:
                int size;
                Scanner S1 = new Scanner(System.in);
                System.out.println("Enter No. of records to insert:\n");
                size = S1.nextInt();
                for (int i = 0; i < size; i++) {
                    System.out.println("Enter Employee_id-" + (i + 1));
                    Emp_id[i] = S.nextInt();
                    System.out.println("Enter Employee_Name-" + (i + 1));
                    Ename[i] = S.next();
                    System.out.println("Enter Contact No.-" + (i + 1));
                    Mobile[i] = S.nextInt();
                    S.close();
                    System.out.println();
                }
                break;
            case 2:
                e.view(Emp_id, Ename, Mobile);
                break;
            case 3:
                e.delete(Emp_id, Ename, Mobile);
                break;
            case 4:
                e.search(Emp_id, Ename, Mobile);
                break;
            case 5:
                S.close();
                return;
            default:
                System.out.println("Invalid Input");
            }
            continue;
        }
    }
}
