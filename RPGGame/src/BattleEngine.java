import java.util.Random;
import java.util.Scanner;

public class BattleEngine {

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();


    Player player;
    Enemy enemy;
    public boolean playerRun = false;


    BattleEngine(Player player, Enemy enemy){
        this.player = player;
        this.enemy = enemy;

    }


    void start(){
        while (player.isAlive() && enemy.isAlive() && !playerRun) {

            playerTurn();

            if (player.cooldown > 0){
                player.cooldown -= 1;
            }

            enemyTurn();
        }

        if (playerRun){

        }

        else if (player.isAlive() && !enemy.isAlive()){
            player.gainExp(enemy.xpReward);
            System.out.println("The player " + player.name + " won against " + enemy.name + " you gain " + enemy.xpReward + " exp");
            System.out.println();
            int drop = rand.nextInt(5);

            if (drop == 0){
                System.out.println(enemy.name + " dropped a Health Potion" );
                player.addItem(new Item("Health Potion", "Potion", 30));
            }
            else if (drop == 1){
                System.out.println(enemy.name + " dropped a sword");
                player.addItem(new Item("Iron Sword", "Weapon", 5));
            }
            else if (drop == 2){
                System.out.println(enemy.name + " dropped a shield");
                player.addItem(new Item("Shield", "Shield", 3));
            }
            else if (drop == 3){
                System.out.println(enemy.name + " dropped a Elixir");
                player.addItem(new Item("Elixir", "Potion", 60));
            }
            else {
                System.out.println("No item dropped");
            }
        }

        else if (enemy.isAlive() && !player.isAlive()){
            System.out.println("You lost to: " + enemy.name);
            player.currentHP = 0;
        }

        else {
            System.out.println("It's a draw");
            player.currentHP = 0;
        }

    }

    void playerTurn(){

        int choice;

        System.out.println(player.name + ": " + player.currentHP + "/" +player.maxHp + " Level " + player.level + " | " + enemy.name + ": " + enemy.currentHP + "/" +enemy.maxHp);

        System.out.println("1. Attack");
        System.out.println("2. Use Items");
        System.out.println("3. Special Ability");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        System.out.println();
        switch (choice){
            case 1 -> {
                boolean hit = player.attack(enemy);
                if (!hit){
                    System.out.println("Counter-attack!");
                    enemy.attack(player);
                }
            }
            case 2 -> {
                if (player.inventory.items.isEmpty()){
                    System.out.println("You have no items right now!");
                }
                else {
                    player.inventory.showInventory();
                    System.out.print("Choose an item: ");
                    int itemChoice = scanner.nextInt();
                    itemChoice -= 1;

                    if (itemChoice >= 0 && itemChoice < player.inventory.items.size()){
                        Item item = player.inventory.items.get(itemChoice);
                        player.useItem(item);
                    }
                    else {
                        System.out.println("Invalid choice");
                    }
                }
            }
            case 3 -> {
                player.specialAbility("Power strike", enemy);
            }
            case 4 -> {
                playerRun = true;
                System.out.println("You ran away");
            }

        }
    }

    void enemyTurn(){
        if (!playerRun && enemy.isAlive()){
            enemy.attack(player);
        }
    }


}
