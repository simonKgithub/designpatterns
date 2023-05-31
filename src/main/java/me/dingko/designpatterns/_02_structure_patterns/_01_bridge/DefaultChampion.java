package me.dingko.designpatterns._02_structure_patterns._01_bridge;

public class DefaultChampion implements Champion{
    private Skin skin;

    private Skill skill;

    private String name;

    public DefaultChampion(Skin skin, String name, Skill skill) {
        this.skin = skin;
        this.name = name;
        this.skill = skill;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move\n", skin.getName(), this.name);
    }

    @Override
    public void skill() {
        System.out.printf("%s %s %s\n", skin.getName(), this.name, skill.getSkill());
    }
}
