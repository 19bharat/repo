package com.game.util;

import org.apache.commons.lang3.RandomUtils;

import com.game.constants.PlatformConstants;

public class ArcheryUtil {

	public static int generateRandomNo() {
		return RandomUtils.nextInt(0, PlatformConstants.CHANCES_UPPERBOUND);
	}

	public static int generateRandomNo(int upperBound) {
		return RandomUtils.nextInt(0, upperBound + 1);
	}
}
