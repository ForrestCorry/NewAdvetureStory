package com.app;

import java.util.Scanner;

import com.parents.*;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean userInputCorrect = false;
		
		do {
			System.out
					.println("Welcome to the Adventure Game\n" + "Would you like to play as a\n " + "1. Human Wizard\n"
							+ "2. Elf Royal\n" + "3. Twi'lek Jedi\n" + "4. Smurf Warrior\n" + "5. Turtle Ninja");
			String userInput = sc.nextLine();
			
			
			switch (userInput) {
			case "1":
				//Call to Human Wizard methods here

				break;
			case "2":
				//Call to ElfLoyal methods

				break;
			case "3":
				//call to Twi'lekJedi methods

				break;
			case "4":
				//call to SmurfWarrior methods

				break;
			case "5":
				//call to TurtleNinja methods

				break;

			default:
				userInputCorrect = true;
				System.out.println("You've chosen a incorrect input\n"
						+ "please choose 1, 2, 3, 4, or 5\n");
				
				break;
			}
		} while (userInputCorrect);
		
	}//main

}//class
