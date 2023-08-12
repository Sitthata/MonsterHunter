import java.util.Random;

public class Player extends Character {
    public Player(String name, int health) {
        super(name, health);
        int potion = 5;
    }

    public void heal() {
        int healAmount = new Random().nextInt(10) + 1;
        this.setHealth(this.getHealth() + healAmount);
        //Feedback
        System.out.println(this.getName() + " heals for " + healAmount + " health!");
    }
}
