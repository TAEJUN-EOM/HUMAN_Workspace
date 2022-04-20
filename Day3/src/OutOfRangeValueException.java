
public class OutOfRangeValueException extends Exception {  
private double  middleAvgTall = 160;
    
    public OutOfRangeValueException(String message){
            super(message);
    }
    public double getMiddleAvgTall(){
           return this.middleAvgTall;
   }

} 
 