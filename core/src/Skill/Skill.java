package Skill;

public abstract class Skill {
    protected double cd;//冷却时间
    protected double DMG;//伤害倍率
    protected boolean isAvailable;//技能是否可用
    protected double timer;//冷却计时器

    protected int MaxCharge;//最大连续可用次数
    protected int charge;//计数器

    protected boolean isAoE;//是否是范围攻击

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
