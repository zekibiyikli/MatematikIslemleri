package kkkkkkkk;
import java.util.Scanner;
public class kok_bulma {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
   double a,b,c,delta,x1,x2;
   System.out.print("x karenin katsay�s�n� giriniz(a): ");
   a=input.nextDouble();
   System.out.print("x  katsay�s�n� giriniz(b): ");
   b=input.nextDouble();
   System.out.print("sabit degeri giriniz(c):  ");
   c=input.nextDouble();
   
   delta=Math.sqrt(b*b-4*a*c);
   if (delta>=0){
	   x1=(-b+delta)/2*a;
	   x2=(-b-delta)/2*a;
	   System.out.println("birinci k�k= "+x1);
	   System.out.println("ikinci k�k= "+x2);
	   
   }
   else 
	   System.out.print("k�k yoktur. ");

   
	}


}
