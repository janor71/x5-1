
/**
 * Project 2--> RegularPolygon
 * 
 * Rebeca Janowicz
 * 2/11/16
 */
public class RegularPolygon
{
    // Instance variables 
   private int n;         // number of sides 
   private double side;  // length of each the side 
   private double x;     // x-coordinate of the polygon's center
   private double y;    // y-coordinate of the polygon's center
   
   
   /** constructor with no arguments */
 public RegularPolygon () {  
    int n = 3;         // number of sides 
    double side = 1;  // length of each the side 
    double x = 0;     // x-coordinate of the polygon's center
    double y = 0 ;
   }
    
 public RegularPolygon (int newN, double newSide) {
    n = newN; 
    side = newSide;
    
  }    
    
 public RegularPolygon(double newX, double newY ) {
     x = newX;
     y = newY;
     
  }
  public int getN () {
  return n;
}
public double getSide() {
return side;
}
public double getX() {
    return x;
  
}
public double getY() {
    return y;
}

public void setN (double newN) {
    if (newN >= 3) {
 
    } else {
        System.out.println(" number of sides is less than 3!");
        }

}

public void setSide (double newSide) {
    if (newSide >= 1) {
 
    } else {
        System.out.println(" number of sides is less than 1!");
        }

}
}
    
