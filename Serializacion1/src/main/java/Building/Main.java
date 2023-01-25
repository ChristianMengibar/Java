package Building;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.*;
import java.net.URISyntaxException;


public class Main {
    private static Logger log = LoggerFactory.getLogger(Building.class);
    private static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {

        try {
            File file = new File(Building.class.getResource("/Building.json").toURI());
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder builder = new StringBuilder();

            String line;

            while ((line = reader.readLine()) != null) {

                builder.append(line + "\n");

            }
            String fileContent = builder.toString();

            log.info(fileContent);

            Building building = mapper.readValue(fileContent, Building.class);

            log.info(building.toString());

            log.info(building.getApartments().get(1).getOwners().toString());

            File file1 = new File("apartamentos-1.json");

            mapper.writeValue(file1,building.getApartments(1));




        } catch (URISyntaxException e) {
            log.error("" + e);
        } catch (FileNotFoundException e) {
            log.error("" + e);
        } catch (IOException e) {
            log.error("" + e);
        }

    }
}
