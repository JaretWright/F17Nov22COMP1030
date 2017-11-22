
package f17nov22comp1030;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class DisplayStars {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int totalRows = keyboard.nextInt();
        
        for (int row=1; row<=totalRows; row++)
        {
            for (int col=1; col<=row; col++)
            {
                System.out.print("*");    
            }
            System.out.println();
        }
    }
}
