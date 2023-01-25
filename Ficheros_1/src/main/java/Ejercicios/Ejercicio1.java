package Ejercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

// ***** Shows everything that is in the user directory ***** //

public class Ejercicio1 {

    private static Logger log = LoggerFactory.getLogger(Ejercicio1.class);

    public static void main(String[] args) {
        File path = new File("/home/mchael");
        //File path = new File("C:\\Users\\MichaelObinnaEzehEro");
        //File path = new File("C:\\Users\\UsuarioPC");

        File[] files =  path.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            if (file.isDirectory()){
                log.info("[ Directory ]" + files[i]  );
            }else if (file.isFile()){
                log.info("[    File   ]" + files[i]);
            }

        }

    }







}
