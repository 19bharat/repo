package com.game.main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.game.exception.ArcheryGameException;
import com.game.service.GameService;
import com.game.service.GameServiceImpl;

public class Main {

	private static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {
		log.log(Level.INFO, "Player Entered");
		Scanner inputPlayer = new Scanner(System.in);
		try {
			int players = inputPlayer.nextInt();
			GameService gameService = new GameServiceImpl();
			for (int player = 1; player <= players; player++) {
				log.log(Level.INFO, "Start the Game for Player " + player);
				gameService.startGameForPlayer(player);
			}
		} catch (Exception e) {
			throw new ArcheryGameException("Problem Occoured while execution");
		} finally {
			inputPlayer.close();
		}

	}

}
