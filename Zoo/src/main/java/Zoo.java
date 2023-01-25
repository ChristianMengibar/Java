import exceptions.CageDontExistsException;
import exceptions.FeedingException;

import java.util.Arrays;
import java.util.Objects;

public class Zoo implements IZoo {
    private String name;
    private Animal[] animalList;

    public Zoo(String name, Animal[] animalList) {
        this.name = name;
        this.animalList = animalList;
    }

    @Override
    public int getNumAnimals(int cage) throws CageDontExistsException {
        int contador = 0;
        for (int i = 0; i < animalList.length; i++) {
            if (animalList[i].getCage() == (cage)) { // == comparar numeros.
                contador = contador + 1;
            }
        }
        if (contador == 0) {
            throw new CageDontExistsException(cage);
        }
        return contador;
    }

    @Override
    public int getFeeding(String typeFeeding) throws FeedingException {
        int contador = 0;
        for (int i = 0; i < animalList.length; i++) {
            if (animalList[i].getFeeding().equals(typeFeeding)) { // .equals comparar cosas.
                contador = contador + 1;
            }
        }
        if (typeFeeding != "carnivore" && typeFeeding != "herbivore" && typeFeeding != "omnivore") {
            throw new FeedingException(typeFeeding);
        }
        return contador;
    }

    @Override
    public int getSpeciesCage(String species, int cage) throws CageDontExistsException {
        int contador = 0;
        for (int i = 0; i < animalList.length; i++) {
            if (animalList[i].getSpecies().equals(species) && animalList[i].getCage() == (cage)) {
                contador = contador + 1;
            }
        }
        if (contador == 0) {
            throw new CageDontExistsException(cage);
        }
        return contador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal[] getAnimalList() {
        return animalList;
    }

    public void setAnimalList(Animal[] animalList) {
        this.animalList = animalList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(name, zoo.name) && Arrays.equals(animalList, zoo.animalList);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(animalList);
        return result;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", animalList=" + Arrays.toString(animalList) +
                '}';
    }
}
