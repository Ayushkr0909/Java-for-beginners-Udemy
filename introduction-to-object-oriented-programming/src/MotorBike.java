
public class MotorBike {
	//state of objects
	private int speed; //member variable

	//default constructor for objects without argument initialization
MotorBike(){
	this(60);
	}
	
	//constructor
MotorBike(int speed){
	this.speed = speed;
	}
		
	//method
void start() {
	System.out.println("bike started");
}
public int getSpeed() {  //getter
	return speed;
}

public void setSpeed(int speed) {  //setter
	if(speed >= 0)
	this.speed = speed;
}
public void increaseSpeed(int howMuch) { //increase speed
	setSpeed(this.speed + howMuch);
}
public void decreaseSpeed(int howMuch) { //decrease speed
	setSpeed(this.speed - howMuch);
}
}