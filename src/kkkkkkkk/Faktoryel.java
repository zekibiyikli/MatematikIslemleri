package kkkkkkkk;
import java.util.Scanner;
public class Faktoryel {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Faktöryeli hesaplanacak sayýyý giriniz: ");
	double a=input.nextInt();
	double faktoryel=1;
	for (int i=1;i<=a;i++ )
	 faktoryel*=i;
	System.out.print(a+"! = "+faktoryel);
	}

}
