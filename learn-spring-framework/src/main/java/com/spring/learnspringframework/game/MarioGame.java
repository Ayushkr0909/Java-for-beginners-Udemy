package com.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {


	@Override
	public void up() {
		System.out.println("up");
	}
	@Override
	public void down() {
		System.out.println("down");
	}
	@Override
	public void left() {
		System.out.println("jump");
	}
	@Override
	public void right() {
		System.out.println("accelerate");
	}
}
