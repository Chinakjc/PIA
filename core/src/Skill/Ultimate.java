package Skill;

public class Ultimate extends Skill{
    protected int mpRequired;
    private int MP;
    public Ultimate(double cd, double DMG, boolean isAvailable, boolean isAoE, int mpRequired) {
        super(cd, DMG, false, true,1);
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    @Override
    public void refresh(double delta){
        if(isAvailable)
            return;
        timer-=delta;
        if((MP>=mpRequired)&&(timer<0)){
            setAvailable(true);
            timer=cd;
        }
    }

    @Override
    public boolean launch(){
        if(super.launch()){
            setMP(MP-mpRequired);
            return true;
        }
        return false;
    }
}
