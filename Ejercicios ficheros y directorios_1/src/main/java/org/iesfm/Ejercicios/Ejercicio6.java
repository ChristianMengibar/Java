package org.iesfm.accesoadatos;

import java.io.File;
import java.util.Properties;

public class Ejercicio6 {

    private static void showProperties(String fileName) {

        File file = new File(fileName);

        System.out.println("Name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length());
        if (file.isFile()) {
            System.out.println("Its a file");
        } else if (file.isDirectory()) {
            System.out.println("Its a directory");
        }
        System.out.println("Last modification: " + file.lastModified());
        System.out.println("Writing permission: " + file.canWrite());
        System.out.println("Reading permission: " + file.canWrite());
        System.out.println("Executing permission: " + file.canWrite());

    }

    public static void main(String[] args) {

        File filename = new File(args[0]);

        showProperties("C:\\tmp\\d1\\" + filename);
    }


}
