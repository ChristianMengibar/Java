import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.*;
import java.util.Scanner;


public class WordSearcher {

    //Searches on all the files in the directory for a word that is given

    private static Logger log = LoggerFactory.getLogger(WordSearcher.class);
    static Scanner scan = new Scanner(System.in);

    //Method to get the text we want to search for

    public static String getTextToSearch() {

        log.info("Type the text you want to search for");

        String text = scan.next();

        return text;

    }

    //Method to get the path where the files are
    //The method will ask for the path again if ir receives an incorrect path
    public static File[] getFolderToSearch() {

        log.info("Type the path of the folder you want to search in");

        String filesPath = scan.next();

        File path = new File(filesPath);

        if (path.exists()) {

            log.info("The path was found");

        } else {
            log.info("The path wasn't found");
            log.info("Try again");

            filesPath = scan.next();

            path = new File(filesPath);

        }
        File[] files = path.listFiles();

        return files;


    }



    //This method searches for the word with a Buffered Reader
    //It keeps each line in a String and each word of the Line is kept in an array
    //It checks if each word equals to the word we are searching for
    //This method has one counter and a "Global counter"
    //A global counter that keeps all the times that the word appears in all files
    //A counter for each file
    public static void searchAndCountWord(File[] files, String word) throws IOException {

        int globalCounter = 0;
        for (File file : files) {

            int counter = 0;

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;


            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");

                for (String part : parts) {

                    if (part.equals(word)) {

                        counter++;

                    }

                }

            }
            globalCounter = globalCounter + counter;
            log.info("FILE: "+file.getName() + " The word " + word + " was found " +  counter + " times" );


        }


        log.info("The word " + word + " was found " + globalCounter);

    }

    public static void main(String[] args) throws IOException {

        String text = getTextToSearch();

        File [] file = getFolderToSearch();

        searchAndCountWord(file,text);
    }
}

