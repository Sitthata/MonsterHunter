import java.util.Random;

public class Enemies {
    private Monster[] enemies;

    public Enemies(Monster[] enemies) {
        this.enemies = enemies;
    }

    public Monster[] getEnemies() {
        return enemies;
    }

    public Monster getRandomEnemy() {
        int randomIndex = new Random().nextInt(enemies.length);
        return enemies[randomIndex];
    }


}
