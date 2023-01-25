package Ejercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Ejercicio7 {

    // ***** Methods that check the permissions of files ***** //

    private static Logger log = LoggerFactory.getLogger(Ejercicio7.class);


    public static void checkPermission(String fileName){
        File file =new File(fileName);

        if (file.canExecute()){
            log.info("This file can be executed");
        }else{
            log.info("This file cant be executed");
        }

        if (file.canRead()){
            log.info("This file  can be read");
        }else{
            log.info("This file cant be read");
        }

        if (file.setExecutable(false)){
            log.info("done");
        }else{
            log.info("failed");
        }
        if (file.setReadable(false)){
            log.info("done");
        }else{
            log.info("failed");
        }
        if (file.setWritable(false)){
            log.info("done");
        }else{
            log.info("failed");
        }

    }

    public static void main(String[] args) {

        File file = new File(args[0]);

        checkPermission("C:\\tmp\\d1\\" + file);






    }
}
