package behaviour.weaponBehaviour.behaviourImplementation;

import behaviour.weaponBehaviour.behaviourInterface.WeaponBehaviour;

public class UseAxe implements WeaponBehaviour {

    @Override
    public String useWeapon() {
        return "Axe";
    }
}
