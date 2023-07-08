import java.util.Random;

public class Enemies {
    private Character[] enemies;

    public Enemies(Character[] enemies) {
        this.enemies = enemies;
    }

    public Character[] getEnemies() {
        return enemies;
    }

    public Character getRandomEnemy() {
        int randomIndex = new Random().nextInt(enemies.length);
        return enemies[randomIndex];
    }


}
