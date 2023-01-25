package org.iesfm.accesoadatos;

import java.io.File;


public class Ejercicio1 {

    public static void main(String[] args) {
        File path = new File("/home/mchael");
        //File path = new File("C:\\Users\\MichaelObinnaEzehEro");
        //File path = new File("C:\\Users\\UsuarioPC");

        File[] files =  path.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            if (file.isDirectory()){
                System.out.println("[ Directory ]" + files[i]  );
            }else if (file.isFile()){
                System.out.println("[    File   ]" + files[i]);
            }

        }

    }







}
