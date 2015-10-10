import java.util.Scanner;

public class checkPrimes {

    public static void main(String args[]){
        
        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter a prime to find");

        int num=scan.nextInt();

        int length=(int)(2*num*Math.log(num));
        
        boolean[] myArray = new boolean[length];
        long start = System.currentTimeMillis();
        

        //SETS ALL OF THE POSITIONS IN THE ARRAY TO TRUE
        for(int i=2; i<myArray.length; i++)
        {
         myArray[i]=true;
        }

        //CHECKS FOR PRIMES
        for(int i=2;i<myArray.length;i++)
        {
            for (int j = 2;; j++) {
            {   
                //FINDS MULTIPLES OF i
                int mul=i*j;

                //IF THE MULTIPLE IS GREATER THAN THE LENGTH OF THE ARRAY - IGNORE AND BREAK
                if(mul>myArray.length)
                {
                break;
                }

                //IF MULTIPLE IS LESS THAN LENGTH OF ARRAY - SET THIS TO FALSE
                if(mul<myArray.length)
                {
                    myArray[mul]=false;
                }
            }
            
        }
        }

        //WILL COUNT THE NUMBER OF PRIMES - VALUE OF THE ARRAY SET TO TRUE
        int counter=0;


        for(int k=2;k<myArray.length;k++)
        {
         
         if(myArray[k]==true)
         {
             counter++;

             //CHECKS IF THE USER INPUT IS EQUAL TO THE COUNTER VALUE TO FIND THE PRIME AT NTH POSITION IN THE ARRAY
             if(num==counter)
             {
                 System.out.println(k);
                 long elapsed = System.currentTimeMillis()-start;
                 System.out.println("The time taken is "+elapsed);
                 break;
             }

         }
        
        }
        
    }
}