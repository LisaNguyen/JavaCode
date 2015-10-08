
import java.util.*;

public class Lottery {
	

	private int[] array = new int[6]; //Declare an array of length 6 to store the results of each draw
	private boolean occurrences = false;
	
	//Constructor method
    public void Lottery() {
    }
    
    /**The spin method to get the six numbers of the lotto whenever the draw method is called.
     *Returns no values.
     *Declares an ArrayList of type integer to store the numbers 1 to 45 for the draw.
     *Uses a for loop to run add the values 1 - 45 to the ArrayList.
     *Use the utility class, Collection, to shuffle the elements in the ArrayList, draw.
     *Fill the array with the first 6 numbers from the ArrayList.
     *Use the built in Arrays.sort method to sort the numbers in increasing order.
     **/
     
    public void spin(){
 	ArrayList<Integer> draws = new ArrayList<Integer>(); 
     for(int i = 0; i <= 44; i++){ //Loops through the list and adds the number 1 - 45 to each position of i
       draws.add(i+1);
     }
     Collections.shuffle(draws); //Shuffles the list
     
     for(int j =0; j<array.length; j++){
     	array[j]=draws.get(j); //Prints out the first six numbers
     }
     Arrays.sort(array);
   } 
    
    
    /**
     *Method used to print out the values in the draw.
     *Use a for loop to get the value at each position in the array.
     *Returns no value.
     **/
    public void getNum(){
    	for(int i = 0; i < array.length; i++){
    		System.out.print(array[i]+" ");
    	}
    	System.out.println("");
    }
    
    /**Method used to find the occurrences of consecutive numbers
     *Use a for loop to account for each position in the array
     *Check if the array at position j holds the same value as the element at position j+1, this would tell us if it's consecutive
     *If it's consecutive, let the boolean equal true.
     *Else, return false
     **/
    public boolean conNum(){
    	for(int j =0; j<array.length-1; j++){
    		if(array[j]==(array[j+1]-1)){
    			occurrences = true;
    		}
    		
    		else{
    			occurrences=false;
    		}
    		if(occurrences==true){
    			break;
    		}
     }
     	return occurrences;
    	
    }

    
}
