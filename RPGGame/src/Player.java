import java.util.Random;

public class Player extends Character{

    Inventory inventory = new Inventory();

    Random rand = new Random();

    int level = 1;
    int exp = 0;
    int cooldown = 0;

    Player(String name ){
        super(name, 100, 100, 20,5);
    }

    @Override
    boolean attack(Character target){
        System.out.println(name + " is attacking " + target.name);
        int roll = rand.nextInt(6);

        if (roll == 0){
            System.out.println("Critical hit!");
            target.takeDamage(attackPower * 2);
            return true;
        }
        else if (roll == 1){
            System.out.println("You missed your attack! ");
            return false;
        }
        else {
            target.takeDamage(attackPower);
        }
        return true;
    }

    void specialAbility(String ability, Character target){
        if (cooldown == 0){
            System.out.println("Power Strike");
            target.takeDamage(attackPower * 3);
            cooldown += 2;
        }
        else {
            System.out.println("Skill on cooldown " + cooldown + " turn remaining");
        }
    }

    void gainExp(int amount){
        exp += amount;
        System.out.println("You gain " + amount + " of exp | Total exp is: " + exp);
        levelUp();
    }

    void levelUp(){
        if (exp >= level * 50){
            level += 1;
            attackPower += 20;
            defence += 6;
            maxHp += 35;
            currentHP = maxHp;
            System.out.println("⭐️ Level UP you are now lvl " + level);
            System.out.println();
        }

    }

    void addItem(Item item){
        inventory.addItem(item);
    }

    void useItem(Item item){
        item.use(this);
        inventory.removeItem(item);
    }

}
