import java.util.Arrays;
import java.util.List;

class Animal extends Character {
    private String species;

    public Animal(String name, String species) throws InvalidAnimalSpeciesException {
        super(name);
        if (!isValidSpecies(species)) {
            throw new InvalidAnimalSpeciesException(species);
        }
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    private boolean isValidSpecies(String species) {
        List<String> knownSpecies = Arrays.asList("Голубые гномики", "Смешарики", "Котопсы");
        return knownSpecies.contains(species);
    }


    @Override
    public void interact() {
        super.interact();
        System.out.println(getName() + " - представитель вида: " + species);
    }

    // Реализация метода speak() из интерфейса Speakable
    @Override
    public void speak() {
        System.out.println(getName() + " издает звуки.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
