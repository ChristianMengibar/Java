import java.io.*;
import java.util.Scanner;

public class ReadFile {

    public static void readFile1(String path) throws FileNotFoundException {

        File file = new File(path);

        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        System.out.println("\n");
    }


    public static void readFile2(String path) throws IOException {
        File file = new File(path);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;

        while (( line = br.readLine()) != null){
            System.out.println(line);

        }


    }

        public static void main (String[]args) throws IOException {

            readFile1("C:\\tmp\\hola.txt");
            readFile2("C:\\tmp\\hola.txt");
        }
        }


