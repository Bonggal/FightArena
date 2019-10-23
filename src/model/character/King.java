package model.character;

import behaviour.weaponBehaviour.behaviourImplementation.UseBowAndArrow;
import model.Character;

public class King extends Character {
    public King(){
        super.weapon = new UseBowAndArrow();
    }
}
