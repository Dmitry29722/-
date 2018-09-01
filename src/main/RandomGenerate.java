package main;

import java.util.Random;

public class RandomGenerate {
	private static Random randomTime;
	private static Random randomMountLetters;
	
	public static int getRandomTime() {
		randomTime = new Random();
		return (randomTime.nextInt(3) + 1)*1000;
	}
	
	public static int getRandomQuantityLetters() {
		randomMountLetters = new Random();
		return (randomMountLetters.nextInt(330) + 3);
	}
}
