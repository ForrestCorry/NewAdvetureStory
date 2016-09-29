package com.ourCharacters;

import com.app.Weapons.Weapon;
import com.interfaces.RoyalInterface;
import com.parents.CharacterClass;

public class ElfRoyal extends CharacterClass implements RoyalInterface {
	
	

	public ElfRoyal() {
		super();
		
	}

	public ElfRoyal(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		
	}

	@Override
	public void changeHealth() {
		super.setHealth(- 5);
	}

	@Override
	public void changeMagic() {
		super.setMagic(+10);
	}
	@Override
	public void setWeapon(Weapon weapon) {
		
		super.setWeapon(Weapon.SCROLL);
	}

}
