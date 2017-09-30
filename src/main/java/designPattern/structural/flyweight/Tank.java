package designPattern.structural.flyweight;

public class Tank{

    private int blood;
    private int attack;
    private int armor;
    public Tank(int blood, int attack, int armor){
        super();
        this.blood = blood;
        this.attack = attack;
        this.armor = armor;
    }
    public int getBlood(){
        return blood;
    }
    public int getAttack(){
        return attack;
    }
    public int getArmor(){
        return armor;
    }
}
