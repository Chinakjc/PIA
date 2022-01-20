package Personnage;

public class Attributes {
    private String name;
    private int level;
    private int exp;
    private int MaxHP;
    private int MaxMP;
    private int ATK;

    private int DEF;
    private double CritRate;
    private double CritDMG;

    public Attributes(String name) {
        this.setName(name);
        this.setExp(0);
        this.setCritRate(0.5);
        this.setCritDMG(0);
        this.refresh();
    }

    public void refresh(){
        setLevel((int)Math.log(1 + exp*exp));
        setATK(150 + 6*level*(int)Math.log(1+level));
        setMaxHP(500 + 100*level);
        setDEF(150+9*level);
        setMaxMP(90);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setMaxHP(int maxHP) {
        MaxHP = maxHP;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public void setCritRate(double critRate) {
        CritRate = critRate;
    }

    public void setCritDMG(double critDMG) {
        CritDMG = critDMG;
    }

    public void setMaxMP(int maxMP) {
        MaxMP = maxMP;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public int getMaxHP() {
        return MaxHP;
    }

    public int getATK() {
        return ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public double getCritRate() {
        return CritRate;
    }

    public double getCritDMG() {
        return CritDMG;
    }

    public int getMaxMP() {
        return MaxMP;
    }


    public void receiveExp(int delta){
        if(delta>0)
            exp+=delta;
        refresh();
    }


}
