package Skill;

public abstract class Skill {
    protected double cd;
    protected double DMG;
    protected boolean isAvailable;
    protected double timer;

    protected int MaxCharge;
    protected int charge;

    protected boolean isAoE;

    public Skill(double cd, double DMG, boolean isAvailable, boolean isAoE, int charge) {
        setCd(cd);
        setDMG(DMG);
        setAvailable(isAvailable);
        setAoE(isAoE);
        this.timer = getCd();
        setMaxCharge(charge);
    }
    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getDMG() {
        return DMG;
    }

    public void setDMG(double DMG) {
        this.DMG = DMG;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public boolean isAoE() {
        return isAoE;
    }

    public void setAoE(boolean aoE) {
        isAoE = aoE;
    }

    public void refresh(double delta){
        if(isAvailable)
            return;
        timer-=delta;
        if(timer<=0){
            if(charge<MaxCharge)
                charge++;
            setAvailable(true);
            timer = cd;
        }
    }
    public boolean launch(){
        if(isAvailable){
            charge--;
            setAvailable(charge>0);
            return true;
        }
        return false;
    }

    public int getMaxCharge() {
        return MaxCharge;
    }

    public void setMaxCharge(int maxCharge) {
        this.MaxCharge = maxCharge;
    }


}
