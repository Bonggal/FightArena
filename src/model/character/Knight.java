package model.character;

import behaviour.weaponBehaviour.behaviourImplementation.UseSword;
import model.Character;

public class Knight extends Character {

    public Knight(){
        weapon = new UseSword();
    }

}
