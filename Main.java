import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
     int total=0;
     //asks the user for a value
	 Scanner input = new Scanner(System.in);
     System.out.print("Bir sayı giriniz:");
     int number = input.nextInt();
    //the sum of the numbers dividing up to itself without a remainder
     for(int i=1;i<number;i++) {
    
         if (number%i==0) {
        	 int divider=i;
          
           total+=divider;
         }  
     }
     //it is a perfect number if the sum is equal to itself
        if(total==number) {
        	 System.out.println(number+" Mükemmel bir sayıdır.");
         }
         else {
        	 System.out.println(number+" Mükemmel bir sayı değildir.");
         }
	 } 
	 
}



