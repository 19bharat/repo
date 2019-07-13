package com.game.service;

import com.game.constants.PlatformConstants;
import com.game.util.ArcheryUtil;

public class GameServiceImpl implements GameService {
	public void startGameForPlayer(int player) {
		int score = 0;
		for (int chances = 1; chances <= PlatformConstants.CHANCES; chances++) {
			score = executePlay(score, chances);
		}
		System.out.println("Archer " + player + " Score is -> " + score);
	}

	private  int executePlay(int score, int chances) {
		int firstTry = ArcheryUtil.generateRandomNo();
		System.out.println("Chance No " + chances);
		System.out.println("1st arrow -> " + firstTry);
		score = score + firstTry;
		if (firstTry != PlatformConstants.CHANCES) {
			int secondTry = ArcheryUtil.generateRandomNo(PlatformConstants.CHANCES - firstTry);
			System.out.println("2nd arrow -> " + secondTry);
			score = score + secondTry;
		} else if (firstTry == PlatformConstants.CHANCES && chances == PlatformConstants.CHANCES) {
			int secondTry = ArcheryUtil.generateRandomNo();
			System.out.println("2nd arrow -> " + secondTry);
			score = score + secondTry;
			if (secondTry == PlatformConstants.CHANCES) {
				int thirdTry = ArcheryUtil.generateRandomNo();
				System.out.println("3rd arrow -> " + thirdTry);
				score = score + thirdTry;
			}
		} else {
			System.out.println("2nd arrow -> No need to shoot(arrow will be returned) ");
		}
		return score;
	}
}
