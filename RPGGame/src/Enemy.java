public class Enemy extends Character{

    int xpReward;

    Enemy(String name, int currentHP, int maxHP, int attackPower, int defence, int xpReward){
        super(name, currentHP, maxHP, attackPower,defence);
        this.xpReward = xpReward;
    }

    @Override
    void attack(Character target){
        System.out.println(name + " is attacking " + target.name);
        target.takeDamage(attackPower);
    }

    void randomAttack(){

    }
}
