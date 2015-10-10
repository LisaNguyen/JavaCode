/*
 * @author: Lisa Nguyen
 * @version: 09 October 2015
 * A program which takes user input and then calculates the number of times the paper 
 * must be folded in order to reach the moon
 */
import java.util.*;

//CALCULATES THE NUMBER OF TIMES YOU MUST FOLD A PIECE OF PAPER TO REACH THE MOON

public class moon {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the thickness of the page in mm");
		double thickness = scan.nextDouble();
		thickness *= 0.001; //CONVERTS THE THICKNESS OF THE PAPER TO WIDTH IN METERS

		long toMoon = 384400; //DISTANCE TO THE MOON IN KILOMETERS
		toMoon *= 1000; //CONVERT THIS TO METERS

		int folds = 0;


		do{
			thickness*=2;
			folds++;
		}while(thickness < toMoon);

		System.out.println("The number of folds is " + folds);
	}
}