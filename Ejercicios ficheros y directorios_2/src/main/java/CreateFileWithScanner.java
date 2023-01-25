import java.io.*;
import java.util.Scanner;

public class CreateFileWithScanner {
    static Scanner scan = new Scanner(System.in);

    public static void createFileScanner() throws IOException {

        System.out.println("Type the path you would like to place your file in");

        String path = scan.next();
        String name;
        File thePath = new File(path);

        boolean check = false;


        do {


            if (thePath.exists()) {

                check = true;

            } else {

                System.out.println("The path you specified doesnt exist, try again");
                path = scan.next();


            }

        } while (check = false);


        System.out.println("Please type your name ");
        name = scan.next();


        File file = new File(thePath + "\\" + name + ".txt");

        file.createNewFile();


    }








    public static void main(String[] args) throws IOException {

        createFileScanner();

    }
}


