public class Player extends Character{

    Inventory inventory = new Inventory();

    int level = 1;
    int exp = 0;

    Player(String name ){
        super(name, 100, 100, 20,5);
    }

    @Override
    void attack(Character target){
        System.out.println(name + " is attacking " + target.name);
        target.takeDamage(attackPower);
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
