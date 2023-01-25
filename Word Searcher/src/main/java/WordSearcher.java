

import java.io.*;
import java.util.Scanner;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class WordSearcher {

    //Searches only in one file

    static Scanner scan = new Scanner(System.in);
    private static Logger log = LoggerFactory.getLogger(WordSearcher.class);


    // ----------------------- Search for the path where the file is ----------------------- //


    public static File findPath() throws InterruptedException {

        log.info("Type the path where your file is located");
        String path = scan.next();
        File folder = new File(path);


        while (!folder.exists()) {
            log.info("The path you introduced doesn't exist.");
            log.info("Please try again");
            findPath();

        }


        log.info("The path introduced was found");

        System.out.println("\n");
        System.out.println("\n");


        return folder;
    }


    // ----------------------- Search for the file in the folder ----------------------- //


    public static File fileToSearchFor() throws InterruptedException {

        File folder = findPath();
        boolean check = false;
        File[] files = folder.listFiles();

        String fileName = null;

        while (check == false) {

            log.info("Type the name of the file you would like to search on");
            fileName = scan.next();

            for (File file : files) {

                if (file.getName().equals(fileName)) {
                    check = true;

                    log.info("The file was found");

                }
            }
            if (check == false) {

                log.info("The file wasn't found");
                log.info("Type the name of the file you would like to search on");
                fileName = scan.next();


            }

            System.out.println("\n");
            System.out.println("\n");


        }


        File foundFile = new File(folder + "\\" + fileName);
        return foundFile;
    }


    // ----------------------- Word to search for in the folder ----------------------- //


    public static void searchForTheWord() throws IOException, InterruptedException {


        File file = fileToSearchFor();

        log.info("Type the word you would like to look for in " + file.getName());
        String word = scan.next();

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;

        int counter = 0;
        while ((line = br.readLine()) != null) {

            String[] parts = line.split(" ");

            for (String part : parts) {
                if (part.equals(word)) {

                    counter++;

                }

            }

        }


        if (counter > 0) {

            log.info("The word " + word + " was found " + counter + " times");

        } else {

            log.info("The word " + word + " wasn't found ");

        }
    }


}


