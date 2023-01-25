package Classes;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.*;
import java.util.Scanner;

public class RegisterUser {

    private static Logger log = LoggerFactory.getLogger(RegisterUser.class);

    static Scanner scan = new Scanner(System.in);

    public static String askName() {

        log.info("Type the name you want to register");

        String userName = scan.next();

        return userName;
    }

    public static File askForFile() {

        log.info("Type the absolute path of the file you want to register on");

        String path = scan.next();

        File file = new File(path);


        if (file.exists()) {

            log.info("The file was found");

        } else {

            log.info("The file wasn't found");
            log.info("Try again");
            askForFile();

        }

        return file;
    }

    public static void userNotFound(File file, String name) throws IOException {

        FileWriter file1 = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(file1);

        log.info("The user has been registered successfully");
        bw.write("\n" + name);
        bw.close();
        file1.close();



    }


    public static void userFound(File file, String name) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(file));


        String line;
        boolean check = false;


        while ((line = br.readLine()) != null) {

            if (line.contains(name)) {

                log.info("The user is already registered");
                check = true;
            }
        }

        if (check == false) {

            userNotFound(file, name);


        }
        br.close();

    }


    public static void main(String[] args) throws IOException {

        String name = askName();

        File file = askForFile();

        userFound(file, name);


    }


}
