package oops_again.interfaces;

public class Mario implements GamingConsole{

	@Override
	public void up() {
		System.out.println("jump");
	}

	@Override
	public void down() {
		System.out.println("slide");
		
	}

	@Override
	public void left() {
		System.out.println("move back");
		
	}

	@Override
	public void right() {
		System.out.println("move forward");
		
	}

}
