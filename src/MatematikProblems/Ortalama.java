package kkkkkkkk;
import java.util.Scanner;
public class Ortalama {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int v,f;
	double ortalama=0;
	System.out.print("Vize notunuzu giriniz: ");
	v=input.nextInt();
	System.out.print("Final notunuzu giriniz:");
	f=input.nextInt();
	ortalama=((v*0.4)+(f*0.6));
	
	if (v>0&&v<100&&f>0&&f<100)
		System.out.print("ortalama "+ortalama);
	else
	System.out.print("hatalý not girdiniz.");
	}

}
