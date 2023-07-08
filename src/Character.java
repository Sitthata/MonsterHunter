import java.util.Random;

public class Character {

    private String name;
    private int health;

    // Constructor
    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }
    // Setter and Getter
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    public void decreaseHealth(int damage) {
        this.health -= damage;
    }
    public void attack(Character target) {
        // random damage for some RNG
        int randomDamage = new Random().nextInt(20) + 1;
        target.decreaseHealth(randomDamage);
        // Feedback
        System.out.println(name + " attacks " + target.getName() + " for " + randomDamage + " damage!");
    }

    public void heal() {
        int healAmount = new Random().nextInt(10) + 1;
        this.health += healAmount;
        //Feedback
        System.out.println(name + " heals for " + healAmount + " health!");
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Health: %d", name, health);
    }
}
