import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class SaveSystem {

    static void save(Player player, int round){
        try {
            FileWriter writer = new FileWriter("save.txt");
            writer.write(player.name + "\n" + player.level + "\n" + player.exp + "\n" + player.coins + "\n"
                    + player.currentHP + "\n" + player.maxHp + "\n" + player.attackPower + "\n" + player.defence + "\n"
                    + round + "\n");
            writer.close();
            System.out.println("Game saved");
        } catch (IOException e) {
            System.out.println("Could not save game!");
        }
    }
    static int load(Player player){
        try {
            File file = new File("save.txt");
            Scanner reader = new Scanner(file);
            player.name = reader.nextLine();
            player.level = Integer.parseInt(reader.nextLine());
            player.exp = Integer.parseInt(reader.nextLine());
            player.coins = Integer.parseInt(reader.nextLine());
            player.currentHP = Integer.parseInt(reader.nextLine());
            player.maxHp = Integer.parseInt(reader.nextLine());
            player.attackPower = Integer.parseInt(reader.nextLine());
            player.defence = Integer.parseInt(reader.nextLine());
            int round = Integer.parseInt(reader.nextLine());
            reader.close();
            return round;
        } catch (Exception e) {
            System.out.println("No save file found!");
            return 1;
        }
    }
}
