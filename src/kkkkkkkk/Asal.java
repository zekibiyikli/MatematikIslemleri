package kkkkkkkk;
import java.util.Scanner;
public class Asal {

	public static void main(String[] args) {
	Scanner k=new Scanner(System.in);
	int a,dur,c;
	System.out.print("L�tfen bir say� giriniz:");
	a=k.nextInt();
	dur=0;
	for (c=2;c<a;c++)
	{
		if (a%c==0)
		{
	dur=1;	
	break;
		}
	}
	if (dur==0)
	
		System.out.print(a+" Say�s� asald�r.");
		else
			System.out.print(a+" Say�s� asal de�ildir.");
	}
}
