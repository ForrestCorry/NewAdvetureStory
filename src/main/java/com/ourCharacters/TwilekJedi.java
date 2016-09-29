package com.ourCharacters;

import com.app.Weapons.Weapon;
import com.interfaces.JediInterface;
import com.parents.CharacterClass;

public class TwilekJedi extends CharacterClass implements JediInterface {
	
	

	public TwilekJedi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TwilekJedi(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(+ 50);

	}

	@Override
	public void changeMagic() {
		super.setMagic(+ 100);

	}
	@Override
	public void setWeapon(Weapon weapon) {
		
		super.setWeapon(Weapon.LIGHTSABER);
	}

}
