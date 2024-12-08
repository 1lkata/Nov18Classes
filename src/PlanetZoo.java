import java.util.ArrayList;
import java.util.List;

public class PlanetZoo {
    public static void main(String[] args) {

        Habitat arctic = new Habitat("Arctic", 100, 6);
        Habitat tropic = new Habitat("Tropic", 200, 28);
        Habitat forest = new Habitat("Forest", 150, 21);

        Animal polarBear = new Animal("Samuil", "Polar Bear", 7, arctic);
        Animal tiger = new Animal("Django", "Tiger", 5, tropic);
        Animal panda = new Animal("Po", "Panda", 3, forest);

        Zoo zoo = new Zoo();

        zoo.addAnimal(polarBear);
        zoo.addAnimal(tiger);
        zoo.addAnimal(panda);

        Staff john = new Staff("John", "Zookeeper", null);
        john.assignStaff(arctic);
        System.out.println(john.getName() + " is assigned to " + john.getAssignedHabitat().getType());

        Staff alice = new Staff("Alice", "Specialist", null);
        alice.assignStaff(tropic);
        System.out.println(alice.getName() + " is assigned to " + alice.getAssignedHabitat().getType());
    }
}

class Animal {
    private String name;
    private String species;
    private int age;
    private final Habitat habitat;  // Composition: Animal has a reference to Habitat and can't exist without it.

    public Animal(String name, String species, int age, Habitat habitat) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public Habitat getHabitat() {
        return habitat;
    }
}

class Habitat {
    private String type;
    private double size;
    private double temperature;

    public Habitat(String type, double size, double temperature) {
        this.type = type;
        this.size = size;
        this.temperature = temperature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}

class Staff {
    private String name;
    private String role;
    private Habitat assignedHabitat;  // Association: Staff is associated with Habitat.

    public Staff(String name, String role, Habitat assignedHabitat) {
        this.name = name;
        this.role = role;
        this.assignedHabitat = assignedHabitat;
    }

    public void assignStaff(Habitat habitat) {
        this.assignedHabitat = habitat;
    }


    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public Habitat getAssignedHabitat() {
        return assignedHabitat;
    }

    public void setAssignedHabitat(Habitat assignedHabitat) {
        this.assignedHabitat = assignedHabitat;
    }
}
