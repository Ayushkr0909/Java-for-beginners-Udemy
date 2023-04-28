package oops_again;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("usha", 0.5, "maroon");
        fan.setSpeed((byte)5);  //casting integer to byte
        fan.switchOff();
        System.out.println(fan);
	}

}
