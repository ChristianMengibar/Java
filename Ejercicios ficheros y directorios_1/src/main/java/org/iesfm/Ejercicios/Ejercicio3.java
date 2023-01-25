package org.iesfm.accesoadatos;

import java.io.File;

public class Ejercicio3 {

    public static void showFiles(File path) {

        File[] files = path.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                System.out.println("[ DIRECTORY ]" + files[i]);
                showFiles(files[i]);

            } else {
                System.out.println("[ FILE ]");
                System.out.println(files[i]);


            }

        }
    }


    public static void main (String[]args){

        File path = new File(".");
        showFiles(path);

    }
}



