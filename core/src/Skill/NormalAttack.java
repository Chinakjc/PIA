package Skill;

public class NormalAttack extends Skill{

    public NormalAttack(double cd, double DMG, boolean isAvailable,int charge) {
        super(cd, DMG, isAvailable,false,charge);
    }
}
