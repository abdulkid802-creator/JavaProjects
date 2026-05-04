public class Main {
    public static void main(String[] args){

        Player player = new Player("Abdul");
        Item item = new Item("Health Potion", "Potion", 30);
        Item item1 = new Item("Iron Sword", "Weapon", 10);

        String[] enemyName = {"Kai", "Zara", "Rex", "Brutus", "Shadow", "Viper", "Golem", "Phantom", "Titan", "Ravage"};
        int round = 1;


        player.addItem(item);
        player.addItem(item1);

        while (player.isAlive()){
            System.out.println("-".repeat(10) + " Round " + round + " " +"-".repeat(10));
            Enemy enemy = new Enemy(enemyName[(round - 1) % enemyName.length], round * 80, round * 80,  round * 15,  round * 3, round * 50);
            BattleEngine battleEngine1 = new BattleEngine(player, enemy);
            battleEngine1.start();

            if (player.isAlive() && !battleEngine1.playerRun){
                player.currentHP = player.maxHp;
            }

            else if (battleEngine1.playerRun){
                System.out.println("You ran from " + enemy.name + " GAME OVER!");
                break;
            }
            round += 1;
        }
    }
}
