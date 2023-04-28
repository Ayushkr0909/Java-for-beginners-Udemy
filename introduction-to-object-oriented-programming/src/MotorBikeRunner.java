
public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(200);
	    MotorBike yamaha = new MotorBike(50);
	    MotorBike honda = new MotorBike();
ducati.start();
yamaha.start();

//ducati.setSpeed(20);
//yamaha.setSpeed(40);

ducati.increaseSpeed(100);
yamaha.increaseSpeed(50);

ducati.decreaseSpeed(50);
yamaha.decreaseSpeed(150);

System.out.println(ducati.getSpeed());
System.out.println(yamaha.getSpeed());
System.out.println(honda.getSpeed());
	}

}
