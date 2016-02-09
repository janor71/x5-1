
/**
 * Project 1
 * Program to create a Stock 
 * 
 * class Stock 
 * 
 * Student Rebeca Janowicz
 * date 2/8/16
 */
public class Stock {
     // Main method 
       public static void main (String[] args) {
    
       /**Creating a stock with current and previous values and 
        get the change in percent*/
        
       MyStock myStock = new MyStock(); 
       
       /** Set both prices = or greater than 0*/
        //double previousClosingPrice = 0;
        //double currentPrice = 0;
       
       if (previousClosingPrice >= 0) { 
           System.out.println("previous price is" + 
           myStock.setPreviousClosingPrice(MyStock.previousClosingPrice));
            } else {
                previousClosingPrice = false;
    
            }   
                
       if(currentPrice >= 0) {
           System.out.println("current price is" + myStock.setCurrentPrice(MyStock.CurrentPrice));
           } else { 
            currentPrice = false;
           }
          
       /** Get Stock's percentage of change.  */   
        Symtem.out.println(" The Change Percentage is" +
        myStock.previousClossingPrice + "is" +  "and " +  
        myStock.currentPrice + "is" +
        myStock.getChangePercentage());
    }
  }
  
class MyStock { 
   private double previousClosingPrice = 34.5;
   private double currentPrice = 34.35;
   

   public MyStock () {
    }
    
    public MyStock(double newPreviousClossingPrice, double newCurrentPrice) {
      previousClossingPrice = newPreviousClossingPrice;
      currentPrice = newCurrentPrice;
    }
    
   public void setPreviousClossingPrice(double previousClossingPrice) {
     this.previousClossingPrice = previousClosingPrice;
   }
    
   public void setCurrentPrice(double CurrentPrice) {  
       this.currentPrice = currentPrice;  
   }
       
    //METHOD
    /**Obtain Change Percentage*/
    
  public double getChangePercent() {
      return (previousClossingPrice - currentPrice) / previousClossingPrice;
    }
}
    
    
    
 
