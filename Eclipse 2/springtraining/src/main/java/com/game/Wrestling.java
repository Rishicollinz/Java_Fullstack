package com.game;

public class Wrestling implements Gametype {
	public void run() {
		System.out.println("Wrestling invoked");
	}
	public void up() {
		System.out.println("Grapple");
	}
	public void down() {
		System.out.println("Release");
	}
	public void left() {
		System.out.println("Punch");
	}
	public void right() {
		System.out.println("Kick");
	}
}
