package com.ourCharacters;

import com.interfaces.WizardInterface;
import com.parents.CharacterClass;

public class TwilekWizard extends CharacterClass implements WizardInterface {

	@Override
	public void changeHealth() {
		super.setHealth(+ 0);

	}

	@Override
	public void changeMagic() {
		super.setMagic(+ 200);

	}

}
