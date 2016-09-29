package com.app;

import java.util.Scanner;

import com.ourCharacters.WarriorSmurf;
import com.parents.*;

public class App {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean userInputCorrect = false;
		
		do {
			System.out
					.println("Welcome to the Adventure Game\n" + "Would you like to play as a\n " + "1. Human Warrior\n"
							+ "2. Royal Elf\n" + "3. Twi'lek Jedi\n" + "4. Smurf Warrior\n" + "5. Ninja Turtle" + "6. Elf Jedi" + "7.Twi'lek Wizard");
			String userInput = sc.nextLine();
			
			
			switch (userInput) {
			case "1":
				//Call to Human Warrior methods here

				break;
			case "2":
				//Call to ElfRoyal methods

				break;
			case "3":
				//call to Twi'lekJedi methods

				break;
			case "4":
				//call to SmurfWarrior methods
				WarriorSmurf ourWarriorSmurf = new WarriorSmurf();
				ourWarriorSmurf = ourWarriorSmurf.makeWarriorSmurf();

				break;
			case "5":
				//call to TurtleNinja methods

				break;
			case "6":
				//call to ElfJedi
				
				break;
			case "7":
				//call to Twi'lek Wizard

			default:
				userInputCorrect = true;
				System.out.println("You've chosen a incorrect input\n"
						+ "please choose 1, 2, 3, 4, 5, 6 or 7\n");
				
				break;
			}
		} while (userInputCorrect);
		
	}//main

}//class
