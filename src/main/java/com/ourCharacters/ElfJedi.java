package com.ourCharacters;


import com.app.Weapons.Weapon;
import com.interfaces.JediInterface;
import com.parents.Elf;

public class ElfJedi extends Elf implements JediInterface {
	
	

	public ElfJedi() {
		super();
		
	}

	public ElfJedi(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		
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
