package com.game;

public class AppManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wrestling a=new Wrestling();
		Gametype b=new Shooter();
		Gametype g=new GameManager(a);
		GameManager ss=new GameManager(b); 
		g.run();
		//ss.run();
		
		
	}

}
