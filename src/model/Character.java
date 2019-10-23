package model;

import behaviour.weaponBehaviour.behaviourImplementation.UseKnife;
import behaviour.weaponBehaviour.behaviourInterface.WeaponBehaviour;

public abstract class Character {
    protected WeaponBehaviour weapon = new UseKnife();
    protected String name = "Someone";

    protected Character() {
    }

    public void fight(Character character) {
        System.out.println(name + " attack " + character.name + " using " + weapon.useWeapon());
    }

    public void setWeapon(WeaponBehaviour weapon) {
        this.weapon = weapon;
    }

    public void display(){
        System.out.println("Hmm");
    }
}
