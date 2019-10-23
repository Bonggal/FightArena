package model.character;

import behaviour.weaponBehaviour.behaviourImplementation.UseKnife;
import model.Character;

public class Queen extends Character {
    public Queen(){
        super.weapon = new UseKnife();
    }

    public Queen(String name){
        super.name = "Queen "+ name;
        super.weapon = new UseKnife();
    }

    public void display(){
        System.out.println("I am a Queen");
    }
}
