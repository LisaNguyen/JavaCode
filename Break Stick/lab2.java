import java.util.*;
public class lab2{
	
	public static void main(String args[]){
		breakStick myStick = new breakStick();
		double count = 0;
		int num = 1000000;
		
		for(int i = 0; i < num; i++){
			
				myStick.Stick();
				
			if(myStick.Stick()==true){
				count++;
			}
			}
			
		System.out.println((count/num)*100+"%");//Prints out the percentage
			
	
			
			//double secondBreak
		}
}