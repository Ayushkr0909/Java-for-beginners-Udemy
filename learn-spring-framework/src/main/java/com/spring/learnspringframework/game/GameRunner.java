package com.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired  //GameRunner class is wired to all the @component classes through constructor
    private GamingConsole game;
    
	public GameRunner(GamingConsole game) {
		this.game=game;
	}
	
	public void runGame() {
	game.up();
	game.down();
	game.left();
	game.right();
	}
}
