package Ejercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.security.sasl.SaslClient;
import java.io.*;
import java.util.Scanner;

public class Ejercicio6 {

    //This program receives a number by the user
    //This number is used to create a file with the number as th name of it
    //A method will ask for the number a nd return it
    //Another method will receive the number and create a file with the number as a name (8.txt)
    //Then another method will receive the file and the number and write the numbers from 0 to the
    //given number in the file given.
    //*The necessity of making the int a String

    private static Logger log = LoggerFactory.getLogger(Ejercicio6.class);
    static Scanner scan = new Scanner(System.in);

    public static int askNumber(){
        log.info("Type a number");
        int num = scan.nextInt();
        return num;

    }

    public static File createFile(int number) throws IOException {

        String num = String.valueOf(number);

        File file = new File("C:\\tmp\\" + num + ".txt");

        file.createNewFile();

        return file;

    }

    public static void writeNumbersOnFile(File file,int number) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        for (int i = 0; i <= number; i++) {
            String num = String.valueOf(i);

            bw.write(num);
            bw.write("\n");


        }
        bw.close();


    }

    public static void main(String[] args) throws IOException {

        int number = askNumber();

        File file = createFile(number);

        writeNumbersOnFile(file,number);
    }


}
