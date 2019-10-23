package behaviour.weaponBehaviour.behaviourImplementation;

import behaviour.weaponBehaviour.behaviourInterface.WeaponBehaviour;

public class UseBowAndArrow implements WeaponBehaviour {
    @Override
    public String useWeapon() {
        return "Bow and Arrow";
    }
}
