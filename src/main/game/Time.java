package main.game;

public class Time {

	public static float startTime = System.nanoTime();

	public static float getTime() {
		return (float) ((System.nanoTime() - startTime)* 10E-9);
	}
}
