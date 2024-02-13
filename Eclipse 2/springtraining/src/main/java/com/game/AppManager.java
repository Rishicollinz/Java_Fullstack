package com.game;


public class AppManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gametype a=new Wrestling();
		Gametype b=new Shooter();
		Gametype c=new Racing();
		GameManager gamer=new GameManager(a);
		GameManager gamer2=new GameManager(b); 
		GameManager gamer3=new GameManager(c);
		gamer.play();
		gamer2.play();
		gamer3.play();
		
	}

}
