package com.spring.learnspringframework.game;

public interface GamingConsole {

	void up();

	void down();

	void left();

	void right();

}
/*on creating gaming console interface,no need to change from marioGame to SupercontraGame in the constructor of GameRunner class*/
/*This reduces more code changes and hence interfaces increase loose coupling*/