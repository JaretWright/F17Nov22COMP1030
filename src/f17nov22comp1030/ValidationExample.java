package f17nov22comp1030;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class ValidationExample {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int temperature;
        
        do
        {
            System.out.print("Enter the temperature outside in C: ");
            try{
                temperature = keyboard.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Sorry only numbers are allowed.");
                temperature = 1000;  //this will force it to stay in the loop
                keyboard.nextLine(); //this clears the Scanner's buffer
            }
        } while (invalidTemp(temperature));

        if (temperature < 0)
            System.out.println("Let's go skiing");
        else
            System.out.println("We want more snow!");
    }
    
    
    /**
     * The goal of this method is to validate that the temperature is between
     * -90 and +60
     */
    public static boolean invalidTemp(int temp)
    {
        if (temp < -90 || temp > 60)
        {
            System.out.println("Sorry temperatures must be in the range -90 to 60");
            return true;
        }
        else
            return false;
    }
}
