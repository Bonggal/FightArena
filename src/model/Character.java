package model;

import behaviour.weaponBehaviour.behaviourInterface.WeaponBehaviour;

public abstract class Character {
    protected WeaponBehaviour weapon;

    protected Character(){}

    public void fight() {
        System.out.println("Attack using " + weapon.useWeapon());
    }
}
