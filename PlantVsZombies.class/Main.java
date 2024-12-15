import java.util.ArrayList;
import java.util.Scanner;
class Garden{
    private String name;
    private int size;

public Garden(String name, int size){
        this.name = name;
        this.size = size;
}

    public String getName(){
        return name;
}

    public int getSize(){
        return size;
}

    public String toString(){
        return "Garden: " + name + ", Size: " + size;
}
}

class Plant extends Garden{
    private int health;

public Plant(String name, int size, int health){
        super(name, size);
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void takeDamage(int damage){
        this.health -= damage;
        System.out.println(getName() + " takes " + damage + " damage. Health is now: " + health);
    }

    public String toString(){
        return super.toString() + ", Health: " + health;
    }
}

class Sunflower extends Plant{
    private int energyProduction;

    public Sunflower(String name, int size, int health, int energyProduction){
        super(name, size, health);
        this.energyProduction = energyProduction;
    }

    public int getEnergyProduction(){
        return energyProduction;
    }

    public void produceEnergy(){
        System.out.println(getName() + " produces " + energyProduction + " energy.");
    }

    public String toString(){
        return super.toString() + ", Energy Production: " + energyProduction;
    }
}

class Peashooter extends Plant{
    private int attackDamage;

    public Peashooter(String name, int size, int health, int attackDamage){
        super(name, size, health);
        this.attackDamage = attackDamage;
    }

    public void shoot(Zombie zombie){
        System.out.println(getName() + " shoots " + zombie.getName() + " for " + attackDamage + " damage!");
        zombie.takeDamage(attackDamage);
    }

    public String toString(){
        return super.toString() + ", Attack Damage: " + attackDamage;
    }
}

class Zombie extends Garden{
    private int health;

    public Zombie(String name, int size, int health){
        super(name, size);
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void takeDamage(int damage){
        this.health -= damage;
        System.out.println(getName() + " takes " + damage + " damage. Health is now: " + health);
    }

    public String toString(){
        return super.toString() + ", Health: " + health;
    }
}

class OrdinaryZombie extends Zombie{
    private int attackPower;

    public OrdinaryZombie(String name, int size, int health, int attackPower){
        super(name, size, health);
        this.attackPower = attackPower;
    }

    public void attack(Plant plant){
        System.out.println(getName() + " attacks " + plant.getName() + " with " + attackPower + " power.");
        plant.takeDamage(attackPower);
    }

    public String toString(){
        return super.toString() + ", Attack Power: " + attackPower;
    }
}

class RoadblockZombie extends Zombie{
    private int defense;
    public RoadblockZombie(String name, int size, int health, int defense){
        super(name, size, health);
        this.defense = defense;
    }

    public void takeDamage(int damage){
        int reducedDamage = damage - defense;
        super.takeDamage(reducedDamage > 0 ? reducedDamage : 0);
        System.out.println(getName() + " has defense of " + defense + ", reducing damage to " + (reducedDamage > 0 ? reducedDamage : 0));
    }

    public String toString(){
        return super.toString() + ", Defense: " + defense;
    }
}

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Sunflowers: ");
        int numSunflowers = scanner.nextInt();
        System.out.print("Enter the number of Peashooters: ");
        int numPeashooters = scanner.nextInt();
        System.out.print("Enter the number of Ordinary Zombies: ");
        int numOrdinaryZombies = scanner.nextInt();
        System.out.print("Enter the number of Roadblock Zombies: ");
        int numRoadblockZombies = scanner.nextInt();
        Garden garden = new Garden("Frontyard", 5);
        
        ArrayList<Garden> gardenElements = new ArrayList<>();

        for (int i = 0; i < numSunflowers; i++){
            gardenElements.add(new Sunflower("Sunflower " + (i + 1), 1, 10, 5));
        }

        for (int i = 0; i < numPeashooters; i++){
            gardenElements.add(new Peashooter("Peashooter " + (i + 1), 1, 15, 3));
        }

        for (int i = 0; i < numOrdinaryZombies; i++){
            gardenElements.add(new OrdinaryZombie("Ordinary Zombie " + (i + 1), 1, 20, 4));
        }

        for (int i = 0; i < numRoadblockZombies; i++){
            gardenElements.add(new RoadblockZombie("Roadblock Zombie " + (i + 1), 1, 25, 2));
        }

        System.out.println("\nGame starts in: " + garden);

        for (Garden element : gardenElements){
            System.out.println(element);
        }

        scanner.close();
    }
}