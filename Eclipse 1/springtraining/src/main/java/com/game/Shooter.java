package com.game;

public class Shooter implements Gametype {
	public void run() {
		System.out.println("Shooting invoked");
	}
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Down");
	}
	public void left() {
		System.out.println("shoot");
	}
	public void right() {
		System.out.println("Aim");
	}
}
