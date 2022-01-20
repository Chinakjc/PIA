package Personnage;
import Skill.Skills;
import Weapons.Weapons;
import com.badlogic.gdx.scenes.scene2d.Actor;

import javax.swing.*;

public abstract class BonhommeAllumette extends Actor {
    protected double size;
    protected int sizeUnite;
    protected int position_x;
    protected int position_y;

    protected Attributes attributes;
    protected Skills skills;
    protected Weapons weapons;
    protected int HP;
    protected int DEF;
    protected int ATK;
    protected double criteRate;
    protected double criteDMG;
    protected int MP;


    public BonhommeAllumette(String name,double size, int sizeUnite, int position_x, int position_y,Weapons weapon){
        setSize(size);
        setSizeUnite(sizeUnite);
        setPosition_x(position_x);
        setPosition_y(position_y);

        setAttributes(new Attributes(name));
        setSkills(new Skills());
        setWeapons(weapon);
        setHP(getAttributes().getMaxHP());
        setDEF(getAttributes().getDEF());
        setATK(getAttributes().getATK()+(int)Math.log10(1+attributes.getLevel()));
        setCriteRate(0.5);
        setCriteDMG(1.0);
        setMP(0);

    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getSizeUnite() {
        return sizeUnite;
    }

    public void setSizeUnite(int sizeUnite) {
        this.sizeUnite = sizeUnite;
    }

    public int getPosition_x() {
        return position_x;
    }

    public void setPosition_x(int position_x) {
        this.position_x = position_x;
    }

    public int getPosition_y() {
        return position_y;
    }

    public void setPosition_y(int position_y) {
        this.position_y = position_y;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public double getCriteRate() {
        return criteRate;
    }

    public void setCriteRate(double criteRate) {
        this.criteRate = criteRate;
    }

    public double getCriteDMG() {
        return criteDMG;
    }

    public void setCriteDMG(double criteDMG) {
        this.criteDMG = criteDMG;
    }

    public void setMP(int MP){
        this.MP = MP;
    }

    public void receiveMP(int delta){
        if(delta<0)
            return;
        if(MP+delta>attributes.getMaxHP())
            setMP(attributes.getMaxMP());
        else
            setMP(MP+delta);
    }

    public void receiveHP(int delta){
        if(delta<0)
            return;
        else {
            if(HP+delta>attributes.getMaxHP())
                HP = attributes.getMaxHP();
            else
                HP+= delta;
        }
    }

    public void receiveDEF(int delta){
        DEF+=delta;
        //todo
    }

    public void receiveATK(int delta){
        ATK+=delta;
        //todo
    }

    public void receiveCriteDMG(double delta){
        criteDMG+= delta;
        //todo
    }

    public void reciveCriteRate(double delta){
        criteRate+=delta;
        //todo
    }









}
