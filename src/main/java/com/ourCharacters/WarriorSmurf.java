package com.ourCharacters;

import com.app.Weapons.Weapon;
import com.interfaces.NinjaInterface;
import com.parents.CharacterClass;

public class WarriorSmurf extends CharacterClass implements NinjaInterface {
	
	

	public WarriorSmurf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WarriorSmurf(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(+ 75);

	}

	@Override
	public void changeMagic() {
		super.setMagic(+ 0);

	}
	
	@Override
	public void setWeapon(Weapon weapon) {
		
		super.setWeapon(Weapon.MACE);
	}
	
	public WarriorSmurf makeWarriorSmurf(){
		WarriorSmurf ourWarriorSmurf = new WarriorSmurf();
		
		ourWarriorSmurf.changeHealth();
		ourWarriorSmurf.changeMagic();
		ourWarriorSmurf.setName(null);
		ourWarriorSmurf.setWeapon(null);
		
		return ourWarriorSmurf;
	}

}
