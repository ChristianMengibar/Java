import exceptions.CageDontExistsException;
import exceptions.FeedingException;
import org.junit.Assert;
import org.junit.Test;

public class TestsZoo {
    @Test
    public void getAnimalTest() throws FeedingException { //Quiero que pase el test para comprobar que esta correcto.
        Animal animal1 = new Animal("leopardo", "carnivore", 3);
        Animal animal2 = new Animal("orangutan", "omnivore", 2);
        Animal animal3 = new Animal("mono titi", "carnivore", 5);
        Animal[] animals = {animal1, animal2, animal3};

        Zoo zoo = new Zoo("1DAM", animals);

        int numero1 = zoo.getFeeding("carnivore");
        Assert.assertEquals(numero1, 3);
    }

    @Test
    public void getCageTest() throws FeedingException, CageDontExistsException { //Este quiero que no pase el test y salte el error.
        Animal animal1 = new Animal("diplodocus", "planta", 4);
        Animal animal2 = new Animal("koala", "omnivore", 7);
        Animal[] animals = {animal1, animal2};

        Zoo zoo = new Zoo("2DAM", animals);

        int numero1 = zoo.getSpeciesCage("koala", 8);
        Assert.assertEquals(numero1, 2);
    }

    @Test
    public void getNumAnimalTest() throws FeedingException, CageDontExistsException { //Este quiero que no pase el test y salte el error.
        Animal animal1 = new Animal("pinguino", "omnivore", 0);
        Animal animal2 = new Animal("tucan", "cetaceo", -1);
        Animal[] animals = {animal1, animal2};

        Zoo zoo = new Zoo("1SMR", animals);

        int numero1 = zoo.getNumAnimals(10);
        Assert.assertEquals(numero1, 1);
    }
}
