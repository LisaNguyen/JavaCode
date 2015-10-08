import java.util.*;

public class MonteCarlo{

    public static void main(String args[]) {
    	
    	Lottery myDraw[] = new Lottery[1];//Holds an array of length one 
    	int checkNums = 0;//Will be used to keep track of consecutive numbers
    	int probability;
    	
    
    	for(int i = 0; i< myDraw.length; i++){ //Creates a lottery object
    		myDraw[i] = new Lottery();
    	}
 
    	//Loops 1 million times to generate 1 million random combination of 6 number results
    		for(int a = 1; a <= 1000000; a++){
  
    		for(int j = 0; j < 1; j++){
    			myDraw[j].spin();
    			
    			if(myDraw[j].conNum()==true){ //Checks if the number is consecutive
    				checkNums++;//Increments the variable if at least one pair is consecutive
    				break;//Break to ensure that any other consecutive pair are not accounted for
    			}
    		}
    	}
			System.out.println(100 -((double) checkNums/10000.0));//Prints out result

    	
    }
    	
 }
