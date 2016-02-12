
/**
 * Project 2--> MyFan
 * 
 * Rebeca Janowicz
 * 2/11/16
 */

// Main method 
public class TestMyFan {
public static void main (String [ ] args) {
    MyFan myFan = new MyFan();
    
    myFan.setDy(MyFan.fast); // setter method for the speed of the fan
    myFan.setRadius(6); // we are changing the radius of the fan to 6
    myFan.setOn(true);  // the fan will have a on botton 
    System.out.println(myFan.toString());
}
   
}    
// Decelaring variables in the class
 class MyFan {

    public static int slow = 1;
    public static int medium = 3;
    public static int fast = 3;
    
    private int dy = slow;    // speed of the fan will start slow
    private boolean on = false;  // at first, the fan will be off.
    private double  radius = 5;  // the fan has a radius of 5
    private String color =  "blue";  // the color of the fan is blue
    
    public MyFan () {
        
    }
    // getting the speed of the fan 
    public int getDy() {
        return dy;
        
    }
    // set a new 
    public void setDy(int dy) {
      this.dy = dy;
        
    }
    
    public boolean isOn () {
        return on;
    }
    public void setOn (boolean on) {
        this.on = on;
    }
    public double getRadius () {
        return radius;
    }
    public void setRadius( double radius) {
        this.radius = radius;
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color =  color;
    }
    public String toString () {
        return "dy " + dy + "\n"
         + "color " + color  +"\n" 
         + "radius" + radius + "\n"
         + ((on) ? "MyFan is on" : "MyFan is off");
        }
}

    /*-----------------------------------------------------------------------
A fan was created with initial speed of 1 and maximun speed of 3.
the dy = speed
------------------------------------------------------------------------

PROJECT TITLE: My Fan
PURPOSE OF PROJECT: create a Fan 
VERSION or DATE: 2/11/16
HOW TO START THIS PROJECT: 
AUTHORS: Rebeca Janowicz
USER INSTRUCTIONS:
    
    
    
    */
    
    


    
