package com.game;

public class GameManager implements Gametype{
	Gametype gt;
	public GameManager(Gametype w){
		gt=w;
	}
	gt.run();
	gt.left();
	gt.right();
	gt.up();
	gt.down();
	
}
