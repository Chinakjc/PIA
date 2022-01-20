package Skill;

import java.util.ArrayList;

public class Skills {
    private ArrayList<Skill> skills;

    public Skills(){
        this.skills = new ArrayList<>();
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void addSkill(Skill skill){
        skills.add(skill);
    }
}
