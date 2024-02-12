import java.util.Scanner;
class Qsix 
{
	public static void main (String args[])
	{
		
		Scanner num=new Scanner(System.in);
		int no1,no2;
		System.out.print(" enter thethe value of A :");
		no1=num.nextInt();
		System.out.print(" Enter the value of B :");
		no2=num.nextInt();
		int  X= 2*(no1+no2)-2*no1*no2;
		
		System.out.print(" final valocity is  :"+ X);
		
		

	}




}
