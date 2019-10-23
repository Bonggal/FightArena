package model.character;

import behaviour.weaponBehaviour.behaviourImplementation.UseKnife;
import model.Character;

public class Queen extends Character {
    public Queen(){
        super.weapon = new UseKnife();
    }
}
