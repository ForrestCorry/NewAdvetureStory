package com.ourCharacters;

import com.app.Weapons.Weapon;
import com.interfaces.NinjaInterface;
import com.parents.CharacterClass;

public class NinjaTurtle extends CharacterClass implements NinjaInterface {
	
	

	public NinjaTurtle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NinjaTurtle(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(+ 20);

	}

	@Override
	public void changeMagic() {
		super.setMagic(- 5);

	}
	@Override
	public void setWeapon(Weapon weapon) {
		
		super.setWeapon(Weapon.SAI);
	}

}
