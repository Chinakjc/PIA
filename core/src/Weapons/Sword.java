package Weapons;

public class Sword extends Weapons{
    public Sword(String name) {
        super(name);
        setType("Sword");
        setBaseATK(640);
        setAttackSpeed(1.5);
    }
}
