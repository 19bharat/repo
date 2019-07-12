package com.game.main;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.game.util.ArcheryUtil;

public class Main {

	private static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {
		log.log(Level.INFO, "Player Entered");
		log.log(Level.INFO, "Start the Game for Player 1");
		startGameForPlayer(1);
		log.log(Level.INFO, "Start the Game for Player 2");
		startGameForPlayer(2);

	}

	private static void startGameForPlayer(int player) {
		int score = 0;
		for (int chances = 1; chances <= 10; chances++) {
			int firstTry = ArcheryUtil.generateRandomNo();
			System.out.println("Chance No " + chances);
			System.out.println("1st arrow -> " + firstTry);
			score = score + firstTry;
			if (firstTry != 10 ) {
				int secondTry = ArcheryUtil.generateRandomNo(10-firstTry);
				System.out.println("2nd arrow -> " + secondTry);
				score = score + secondTry;
			} else if (firstTry == 10 && chances == 10) {
				int secondTry = ArcheryUtil.generateRandomNo();
				System.out.println("2nd arrow -> " + secondTry);
				score = score + secondTry;
				if (secondTry == 10) {
					int thirdTry = ArcheryUtil.generateRandomNo();
					System.out.println("3rd arrow -> " + thirdTry);
					score = score + thirdTry;
				}
			} else {
				System.out.println("2nd arrow -> No need to shoot(arrow will be returned) ");
			}

		}
		System.out.println("Archer " + player +  " Score is -> " + score);
	}

}
