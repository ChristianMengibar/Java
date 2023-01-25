import exceptions.CageDontExistsException;
import exceptions.FeedingException;

public interface IZoo {
    int getNumAnimals(int cage) throws CageDontExistsException;

    int getFeeding(String typeFeeding) throws FeedingException;

    int getSpeciesCage(String species, int cage) throws CageDontExistsException;
}
