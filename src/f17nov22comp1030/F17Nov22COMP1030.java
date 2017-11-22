package f17nov22comp1030;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class F17Nov22COMP1030 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //this is used to read from the keyboard
        System.out.print("How long was the brick falling (in seconds): "); //printing to the screen
        double timeFalling = keyboard.nextDouble(); // reading the user input
        
        System.out.printf("The bridge is %.1fm high%n", calcHeight(timeFalling));
        System.out.printf("The brick will be travelling at %.2f m/s at impact%n", 
                                                            calcSpeed(timeFalling));
        System.out.printf("Which is %.0f KPH%n", convertToKPH(calcSpeed(timeFalling)));
        
    }
    
    /**
     * This method will receive a time in seconds and calculate the height
     * at which the object was dropped.  It assumes the object does not
     * reach a terminal velocity
     */
    public static double calcHeight(double timeFalling)
    {
        //Height= acceleration * timeFalling^2
        return 9.81*Math.pow(timeFalling, 2);
    }
    
    /**
     * This method will calculate the speed at impact when 
     * an object is dropped.  It uses the time falling as
     * an input
     */
    public static double calcSpeed(double timeFalling)
    {
        //velocity = squareroot of (2 * distance * acceleration)
        double height = calcHeight(timeFalling);
        return Math.sqrt(2*height*9.81);
    }
    
    /**
     * This method converts m/s into KPH
     */
    public static double convertToKPH(double speedInMPS)
    {
        return speedInMPS * 3.6;
    }
}
