package kkkkkkkk;
import java.util.Scanner;
public class Puan {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double ort=0;
		System.out.print("Lütfen not ortalamanýzý giriniz:");
		ort=input.nextDouble();
		if (ort>90&&ort<=100)
		
			System.out.print("AA");
			
	    else if (ort>80&&ort<=90)
	    
	    	System.out.print("BA");
	    else if (ort>71 && ort<=80)
	    
	    	System.out.print("BB");
	    else if (ort>60 && ort<=70)
	    
		    System.out.print("CB")	;
	    else if (ort>=50&&ort<=60)
	    	
	    	System.out.print("CC")	;	
	    else 
	    	System.out.print("FF");
	    				
	    				
	    	
		}
	}


