package org.iesfm.accesoadatos;

import java.io.File;

public class Ejercicio10 {

    public static void showFilesInDirectory(File path) {


        File[] files = path.listFiles();

        for (int i = 0; i < files.length; i++) {

            if (files[i].isDirectory()) {
                System.out.println("[ DIRECTORY ]" + files[i]);
                showFilesInDirectory(files[i]);
            } else {
                System.out.println("[ FILE ]");
                System.out.println(files[i].getName());
            }

        }

    }

    public static void main(String[] args) {

        File file = new File("C:\\home");

        showFilesInDirectory(file);
    }
}
