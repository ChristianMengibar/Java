package Iberia;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.*;
import java.net.URISyntaxException;

public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);
    private static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {

        //READ AND DISPLAY STRUCTURE OF JSON//
        //---------------------------------------------------------------------
        try {
            File file = new File(Airline.class.getResource("/AirLine.json").toURI());
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder builder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null){

                builder.append(line + "\n");

            }

            String fileContent = builder.toString();

            log.info(fileContent);

            //---------------------------------------------------------------------


            //MAP JSON FILE TO AIRLINE CLASS STRUCTURE AND DISPLAY//
            //---------------------------------------------------------------------

            Airline airline = mapper.readValue(file,Airline.class);
            //Airline airline = mapper.readValue(fileContent,Airline.class);

            log.info(airline.toString());

            //QUERY (CONSULTA)

            log.info(airline.getFlights().get(0).getDestination());



            //WRITE A QUERY ON A NEW FILE

            File file1 = new File("AirLine_2.json");

            mapper.writeValue(file1,airline.getPassengers(23432555));




        } catch (URISyntaxException e) {
            log.error("" + e);
        } catch (FileNotFoundException e) {
            log.error("" + e);
        } catch (IOException e) {
            log.error("" + e);
        }


    }
}
