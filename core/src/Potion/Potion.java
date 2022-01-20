package Potion;

import Personnage.BonhommeAllumette;

public abstract class Potion {
    protected String name;
    protected String type;
    protected boolean isAvailable;
    protected BonhommeAllumette utilisator;
    protected String discription;

    public Potion(String name, String type, BonhommeAllumette utilisator,String discription) {
        this.name = name;
        this.type = type;
        this.isAvailable = true;
        this.utilisator = utilisator;
        this.discription = discription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract boolean usePotion();

    public boolean isAvailable() {
        return isAvailable;
    }

    public BonhommeAllumette getUtilisator() {
        return utilisator;
    }

    public String getDiscription() {
        return discription;
    }
}
