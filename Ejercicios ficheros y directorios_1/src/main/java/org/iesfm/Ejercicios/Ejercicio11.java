package org.iesfm.accesoadatos;

import java.io.File;
import java.util.Scanner;


public class Ejercicio11 {
    private static Scanner scan = new Scanner(System.in);

    public static void deleteAll(File path) {

        File[] files = path.listFiles();

        for (int i = 0; i < files.length; i++) {

            if (files[i].isDirectory()) {
                deleteAll(files[i]);

                System.out.println("Are you sure you want to delete this directory " + files[i].getName());
                String decision = scan.next();
                if (decision.equalsIgnoreCase("yes")) {
                    files[i].delete();
                } else if (decision.equalsIgnoreCase("no")) {
                    System.out.println(files[i].getName() + " wont be deleted");
                }
            } else if (files[i].isFile()) {
                System.out.println("Are you sure you want to delete this file " + files[i].getName());
                String decision = scan.next();
                if (decision.equalsIgnoreCase("yes")) {
                    files[i].delete();
                } else if (decision.equalsIgnoreCase("no")) {
                    System.out.println(files[i].getName() + " wont be deleted");
                }

            }


        }
    }

    public static void main(String[] args) {

        File file = new File("C:\\tmp");

        deleteAll(file);
    }
}
