package com.game;

public class Racing implements Gametype{
	public void run() {
		System.out.println("Racing invoked");
	}
	public void up() {
		System.out.println("Accelerate");
	}
	public void down() {
		System.out.println("Brake");
	}
	public void left() {
		System.out.println("Move left");
	}
	public void right() {
		System.out.println("Move right");
	}
}
