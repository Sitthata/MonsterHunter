import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        // Initialize all the variables
        Scanner sc = new Scanner(System.in);
        Player player = new Player("Hunter", 100);
        Enemies enemies = new Enemies(new Monster[]{
                new Monster("Rathalos", 50),
                new Monster("Vaal hazak", 40),
                new Monster("Diablos", 30),
                new Monster("Orogaron", 20),
                new Monster("Jagras", 10)
        });

        // Random 1 opponent to fight
        Monster opponent = enemies.getRandomEnemy();

        // Welcome game display
        System.out.println("Welcome to Monster hunter");
        System.out.println("You are a hunter and your next mission is to defeat " + opponent.getName());
        System.out.println(opponent);

        // Start game loop
        while(player.isAlive() && opponent.isAlive()) {
            // User's choice
            System.out.println("Press 1 to attack or 2 to heal");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    player.attack(opponent);
                    break;
                case 2:
                    player.heal();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            // Opponent's turn
            if(opponent.isAlive()) {
                opponent.attack(player);
            }
            // Display health for every turn
            System.out.println("Your health: " + player.getHealth());
            System.out.println(opponent.getName() + "'s health: " + Math.max(opponent.getHealth(), 0));

        }

        // End Game Feedback
        if(!player.isAlive()) {
            System.out.println("You died! to a " + opponent.getName() + "!");
        } else {
            System.out.println("You finally defeated " + opponent.getName() + "," + " Let's return to camp!");
        }
    }

}
