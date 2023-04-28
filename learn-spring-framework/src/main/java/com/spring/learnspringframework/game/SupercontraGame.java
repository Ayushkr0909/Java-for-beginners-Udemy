package com.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SupercontraGame implements GamingConsole{
	
	public void up() {
		System.out.println("Run");
	}
	public void down() {
		System.out.println("bend");
	}
	public void left() {
		System.out.println("stop");
	}
	public void right() {
		System.out.println("exit");
	}

}
