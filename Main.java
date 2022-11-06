

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
     int total=0;
	 Scanner input = new Scanner(System.in);
     System.out.print("Bir sayı giriniz:");
     int number = input.nextInt();
    
     for(int i=1;i<number;i++) {
    
         if (number%i==0) {
        	 int divider=i;
          
           total+=divider;
         }  
     }
        if(total==number) {
        	 System.out.println(number+" Mükemmel bir sayıdır.");
         }
         else {
        	 System.out.println(number+" Mükemmel bir sayı değildir.");
         }
	 } 
	 
}

