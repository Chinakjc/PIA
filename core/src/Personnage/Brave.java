package Personnage;
import Inventory.*;
import Potion.Potion;
import Weapons.*;

public class Brave extends BonhommeAllumette{
    Inventory<Weapons> weaponsInventory;
    Inventory<Potion> potionInventory;
    Wallet wallet;

    public Brave(String name, double size, int sizeUnite, int position_x, int position_y, Weapons weapon) {
        super(name, size, sizeUnite, position_x, position_y, weapon);
        Inventory<Weapons> weapons = new Inventory<Weapons>();
        weapons.add(weapon);
        this.weaponsInventory = weapons;
        this.potionInventory = new Inventory<Potion>();
        this.wallet = new Wallet();

    }

    public void receiveEXP(int EXP){
        attributes.setExp(attributes.getExp());
    }

    public void receiveGC(int GC){
        wallet.receiveGC(GC);
    }

    public boolean spendGC(int GC){
        return wallet.spend(GC);
    }

    public void addWeapon(Weapons weapon){
        weaponsInventory.add(weapon);
    }

    public void addPotion(Potion potion){
        potionInventory.add(potion);
    }

    public boolean usePotion(int index){
        try {
            Potion potion = potionInventory.get(index);
            potionInventory.remove(index);
            return (potion.usePotion());
        }catch (Exception e){
            return false;
        }
    }


}
