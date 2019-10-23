package behaviour.weaponBehaviour.behaviourImplementation;

import behaviour.weaponBehaviour.behaviourInterface.WeaponBehaviour;

public class UseKnife implements WeaponBehaviour {
    @Override
    public String useWeapon() {
        return "Knife";
    }
}
