package org.iesfm.accesoadatos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Ejercicio7 {


    public static void checkPermission(String fileName){
        File file =new File(fileName);

        if (file.canExecute()){
            System.out.println("This file can be executed");
        }else{
            System.out.println("This file cant be executed");
        }

        if (file.canRead()){
            System.out.println("This file  can be read");
        }else{
            System.out.println("This file cant be read");
        }

        if (file.setExecutable(false)){
            System.out.println("done");
        }else{
            System.out.println("failed");
        }
        if (file.setReadable(false)){
            System.out.println("done");
        }else{
            System.out.println("failed");
        }
        if (file.setWritable(false)){
            System.out.println("done");
        }else{
            System.out.println("failed");
        }

    }

    public static void main(String[] args) {

        File file = new File(args[0]);

        checkPermission("C:\\tmp\\d1\\" + file);






    }
}
