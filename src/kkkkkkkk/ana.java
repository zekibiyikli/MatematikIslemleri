package kkkkkkkk;

import java.util.Scanner;

public class ana {

	public static void main(String[] args) {
		double ortalama;	
		Scanner input=new Scanner(System.in);
			System.out.print("Ortalamayý giriniz: ");
			ortalama=input.nextDouble();
			if(0<=ortalama&&ortalama<=49){
				System.out.print("FF");
			}
			else if((50<=ortalama&&ortalama<=74)){
				System.out.print("BB");
			}
			else if((75<=ortalama&&ortalama<=100)){
				System.out.print("AA");
			}
			else
				System.out.print("hatalý not girdiniz.");

	}

}
