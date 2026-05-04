public class Item {

    private String name;
    private String type;
    private int value;

    Item(String name, String type, int value){
        this.name = name;
        this.type = type;
        this.value = value;
    }

    String getName(){
        return this.name;
    }

    void use(Player player){
        if (type.equals("Potion")){
            player.currentHP += value;
            player.currentHP = Math.min(player.currentHP, player.maxHp);
            System.out.println("Used a potion | HP is now: " + player.currentHP + "/" + player.maxHp);

        }
        else if (type.equals("Weapon")){
            player.attackPower += value;
            System.out.println("Current attack power is: " + player.attackPower);
        }
        else if (type.equals("Shield")){
            player.defence += value;
            System.out.println("Current defence is: " + player.defence);
        }
    }
}
