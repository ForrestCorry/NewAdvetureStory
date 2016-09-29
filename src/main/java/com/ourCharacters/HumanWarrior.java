package com.ourCharacters;

import com.app.Weapons.Weapon;
import com.interfaces.WarriorInterface;
import com.parents.CharacterClass;

public class HumanWarrior extends CharacterClass implements WarriorInterface {
	
	

	public HumanWarrior() {
		super();
		
	}

	public HumanWarrior(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		
	}

	@Override
	public void changeHealth() {
		super.setHealth(+ 75);

	}

	@Override
	public void changeMagic() {
		

	}
	@Override
	public void setWeapon(Weapon weapon) {
		
		super.setWeapon(Weapon.SWORD);
	}

}
