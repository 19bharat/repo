package com.game.util;

import org.apache.commons.lang3.RandomUtils;

public class ArcheryUtil {

	public static int generateRandomNo() {
		return RandomUtils.nextInt(0, 11);
	}

	public static int generateRandomNo(int upperBound) {
		return RandomUtils.nextInt(0, upperBound + 1);
	}
}
