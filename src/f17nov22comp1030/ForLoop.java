
package f17nov22comp1030;

/**
 *
 * @author jwright
 */
public class ForLoop {
    public static void main(String[] args)
    {
        //create a header
        System.out.printf("%-6s %-10s %-15s %-15s%n", "Time",
                                                      "Height",
                                                      "m/s at impact",
                                                      "KPH at impact");
        for (int time=1; time<=4 ;time++)
        {
            System.out.printf("%3d  %7.1f %10.1f %15.0f %n", time,
                                                     calcHeight(time),
                                                     calcSpeed(time),
                                                     convertToKPH(calcSpeed(time)));
        }
    }
 /**
     * This method will receive a time in seconds and calculate the height
     * at which the object was dropped.  It assumes the object does not
     * reach a terminal velocity
     */
    public static double calcHeight(double timeFalling)
    {
        //Height= 0.5*acceleration * timeFalling^2
        return 0.5*9.81*Math.pow(timeFalling, 2);
    }
    
    /**
     * This method will calculate the speed at impact when 
     * an object is dropped.  It uses the time falling as
     * an input
     */
    public static double calcSpeed(double timeFalling)
    {
        return 9.81*timeFalling;
    }
    
    /**
     * This method converts m/s into KPH
     */
    public static double convertToKPH(double speedInMPS)
    {
        return speedInMPS * 3.6;
    }
}

