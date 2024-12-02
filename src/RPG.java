public class RPG {

    public static void main(String[] args){
        Wizard wizard = new Wizard("Merlin",100, 10,5);
        Warrior warrior = new Warrior("Ragnar",100,7,3);
        Archer archer = new Archer("Tulkaz",100,12,6);

        System.out.println(wizard.getName() + "'s health: " + wizard.getHealth());
        System.out.println(warrior.getName()+"'s health: " + warrior.getHealth());
        System.out.println(archer.getName()+"'s health: " + archer.getHealth());
        System.out.println("Game is starting...");
        attackDisplay(wizard,warrior);
        attackDisplay(archer,wizard);
        attackDisplay(warrior,archer);
    }
    public static void attackDisplay(Character attacker, Character defender){
        attacker.attack(defender);
        System.out.println(attacker.getName() + " attacks " + defender.getName() + ". Health updated: " + defender.getHealth());
    }
}

abstract class Character {
    private final String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attack(Character target);
}

class Wizard extends Character {
    private final int darkMagic;
    private final int wizardArmor;

    public Wizard(String name, int health, int darkMagic, int wizardArmor) {
        super(name, health);
        this.darkMagic = darkMagic;
        this.wizardArmor = wizardArmor;
    }

    public int getDarkMagic() {
        return darkMagic;
    }
    public int getWizardArmor() {
        return wizardArmor;
    }

    public void attack(Character target) {
        if (target instanceof Warrior) {
            target.setHealth(target.getHealth() - (this.darkMagic - ((Warrior) target).getMetalArmor()));
        } else if (target instanceof Archer) {
            target.setHealth(target.getHealth() - (this.darkMagic - ((Archer) target).getTowerArmor()));
        }
    }
}

class Warrior extends Character {
    private final int sword;
    private final int metalArmor;

    public Warrior(String name, int health, int sword, int metalArmor) {
        super(name, health);
        this.sword = sword;
        this.metalArmor = metalArmor;
    }

    public int getSword() {
        return sword;
    }

    public int getMetalArmor() {
        return metalArmor;
    }

    public void attack(Character target) {
        if (target instanceof Wizard) {
            target.setHealth(target.getHealth() - (this.sword - ((Wizard) target).getWizardArmor()));
        } else if (target instanceof Archer) {
            target.setHealth(target.getHealth() - (this.sword - ((Archer) target).getTowerArmor()));
        }
    }
}

class Archer extends Character {
    private final int bow;
    private final int towerArmor;

    public Archer(String name, int health, int bow, int towerArmor) {
        super(name, health);
        this.bow = bow;
        this.towerArmor = towerArmor;
    }

    public int getBow() {
        return bow;
    }

    public int getTowerArmor() {
        return towerArmor;
    }

    public void attack(Character target) {
        if (target instanceof Wizard) {
            target.setHealth(target.getHealth() - (this.bow - ((Wizard) target).getWizardArmor()));
        } else if (target instanceof Warrior) {
            target.setHealth(target.getHealth() - (this.bow - ((Warrior) target).getMetalArmor()));
        }
    }
}
