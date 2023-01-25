package School;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args)  {
        FileUtils fileUtils = new FileUtils();

        try {
            File file = new File(School.class.getResource("/School.json").toURI());
            String fileContent = fileUtils.readFile(file);

            ObjectMapper mapper = new ObjectMapper();
            School school = mapper.readValue(fileContent, School.class);
            log.info(school.toString());
            log.info(school.getGroups().get(0).getStudents().get(0).toString());
            log.info(mapper.writeValueAsString(school));

            File file1 = new File("School2.json");
            mapper.writeValue(file1,school);
        }


        catch (URISyntaxException e) {
            log.error("",e);

        }
        catch (JsonProcessingException e){
            log.error("The json file is not well written", e);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }





    }
