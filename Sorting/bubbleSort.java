/*
 * @author: Lisa Nguyen
 * @version: 11 October 2015
 * Bubble sort 
 */


public class bubbleSort {
	public static void main(String args[]) {
		int x[] = {2, 45, 1, 9, 23};
		bubbleSort(x); //calls and prints the array sorted in ascending order
	}

	public static void bubbleSort(int a[]) {
		int temp;


		for(int i = a.length - 1; i > 0; i--){

			//Loops through array and checks value at each index
			for(int j = 0; j < i; j++) {
				if(a[j] > a[j+1]) {

					//SWITCHES VALUES IF NEEDED
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

		//ENHANCED LOOP WHICHS PRINTS OUT THE ELEMENTS IN THE ARRAY
		for(int x : a) {
			System.out.print(x + "   ");
		}
	}//END OF METHOD 
}