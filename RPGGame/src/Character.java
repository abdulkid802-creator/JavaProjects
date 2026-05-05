public abstract class Character {

    protected String name;
    protected int currentHP;
    protected int maxHp;
    protected int attackPower;
    protected int defence;

    Character(String name, int currentHP, int maxHP, int attackPower, int defence){
        this.name = name;
        this.currentHP = currentHP;
        this.maxHp = maxHP;
        this.attackPower = attackPower;
        this.defence = defence;
    }

    void takeDamage(int damage){
        damage = Math.max(0, damage - defence);
        currentHP = Math.max(0, currentHP - damage);
        System.out.println(name + " took " + damage + " damage");
        System.out.println();
    }

    boolean isAlive(){
        return currentHP > 0;
    }

    abstract boolean attack(Character target);
}
