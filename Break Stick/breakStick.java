/**
 * @(#)breakStick.java
 *
 *
 * @author 
 * @version 1.00 2015/2/15
 */

import java.util.*;

public class breakStick {
	private double length = 10.0;
	boolean check = false;

    public breakStick() {
    }
    
    public boolean Stick(){
    	int random;
    	Random rand = new Random();//Random number generator
    	double firstBreak = (Math.random()*9.99)+0.01;//Let the first half of the stick equal to a random number between 0.01 and 9.99 to ensure that the stick is breaking
    	double secondBreak = length - firstBreak;//Length of the second half of the stick
    	
    	double array[] = {firstBreak, secondBreak}; 
    	int pos = rand.nextInt(2); //Generates a random number to decide which half to break again
    	
    	//Breaking one of the first two sticks
    	double thirdBreak = (Math.random()*array[pos]-1.02)+1.01;//Generates a random number between 0.01 and the (length of the stick it is breaking minus 0.01 to ensure that the stick is breaking)
    	double fourthBreak = array[pos] - thirdBreak;//The second half of the broken stick
    	
    		if(pos == 0){
    		
    		//Checks if the sticks will form a triangle
			if((array[1] + thirdBreak > fourthBreak)&&(array[1] + fourthBreak > thirdBreak)&&(thirdBreak + fourthBreak > array[1])){
			//System.out.println(firstBreak + " " + thirdBreak + " "+ fourthBreak);
    		check = true;
    		
			}
			
			else{
    		check = false;
			}
    	
    	}
    	
    	else if(pos == 1){
    	
			if((array[0] + thirdBreak > fourthBreak)&&(array[0] + fourthBreak > thirdBreak)&&(thirdBreak + fourthBreak > array[0])){
    		check = true;
    		
			}
			
			else {
    		//System.out.println(array[pos] + " " + thirdBreak + " "+ fourthBreak);
    		check = false;
    	}
    	
    	}
    	return check;
    }
			
    }
    
 