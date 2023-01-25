package org.iesfm.accesoadatos;

import java.io.File;

public class Ejercicio9 {

    public static void showFilesInDirectory(File path){


        File[]files = path.listFiles();

        for (int i = 0; i < files.length; i++) {

            if (files[i].isDirectory()){
                System.out.println(files[i]);
                showFilesInDirectory(files[i]);
            }else{
                System.out.println(files[i]);
            }

        }

        }


    public static void main(String[] args) {

        File file = new File("C:\\home");

        showFilesInDirectory(file);
    }
}
