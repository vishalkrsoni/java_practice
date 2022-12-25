package java_practice;

import java.io.File;
import java.io.IOException;

public class create_file {
    public static void main(String[] args) {
        try {
            File file_obj = new File("new.txt");
            if (file_obj.createNewFile()) {
                System.out.println("created:" + file_obj.getName());
            } else {
                System.out.println("File " + file_obj.getName() + " Already exists");
            }
        } catch (IOException e) {
            System.out.println("Error occured.");
            e.printStackTrace();
        }
    }
}
