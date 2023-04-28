package oops_again;

public class Fan {
	
//state	
       private String maker;
       private double radius;
       private String colour;
       private boolean isOn;
       private byte speed;
       
//constructors-which do not need any change
       public Fan(String maker, double radius, String colour) {
       this.maker = maker;
       this.radius = radius;
       this.colour = colour;
}
//isOn and speed need to be changed
       public void switchOn() {
     	this.isOn = true;
     	setSpeed((byte)3);  //if you want a default speed when fan is on
   		} 
       public void switchOff() {
        this.isOn = false;
        setSpeed((byte)0);
   	}
       
       public void setSpeed(byte speed) {
    	   this.speed = speed;
       }
       
       //print the state using to string()
       public String toString() {
    	  return String.format("maker - %s, radius - %f, colour - %s, isOn - %b, speed - %d",
    			  maker, radius, colour, isOn, speed);
       }



	
}
