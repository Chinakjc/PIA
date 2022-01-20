package Potion;

import Personnage.BonhommeAllumette;

public class HpPotion extends Potion{
    private int cst;
    private double percent;

    public HpPotion(String name, String type, BonhommeAllumette utilisator, String discription,int cst, double percent) {
        super(name, type, utilisator, discription);
        this.cst = cst;
        this.percent = percent;
    }


    @Override
    public boolean usePotion() {
        if(isAvailable){
            isAvailable=false;
            utilisator.receiveHP( cst+(int)(utilisator.getAttributes().getMaxHP()*percent));
            return true;
        }
        return false;
    }
}
