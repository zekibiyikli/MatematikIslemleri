package kkkkkkkk;
import java.util.Scanner;
public class kok_bulma {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
   double a,b,c,delta,x1,x2;
   System.out.print("x karenin katsayýsýný giriniz(a): ");
   a=input.nextDouble();
   System.out.print("x  katsayýsýný giriniz(b): ");
   b=input.nextDouble();
   System.out.print("sabit degeri giriniz(c):  ");
   c=input.nextDouble();
   
   delta=Math.sqrt(b*b-4*a*c);
   if (delta>=0){
	   x1=(-b+delta)/2*a;
	   x2=(-b-delta)/2*a;
	   System.out.println("birinci kök= "+x1);
	   System.out.println("ikinci kök= "+x2);
	   
   }
   else 
	   System.out.print("kök yoktur. ");

   
	}


}
