package behaviour.weaponBehaviour.behaviourImplementation;

import behaviour.weaponBehaviour.behaviourInterface.WeaponBehaviour;

public class UseSword implements WeaponBehaviour {
    @Override
    public String useWeapon() {
        return "Sword";
    }
}
