import java.util.Scanner;
class Qfour
{
	public static void main (String args[])
	{
		
		Scanner num=new Scanner(System.in);
		int no1,no2;
		System.out.print(" enter the distanc :");
		no1=num.nextInt();
		System.out.print(" Enter the time :");
		no2=num.nextInt();
		double speed=(double) no1/no2;
		
		System.out.print(" Total Speed is  :"+speed);
		
		

	}




}
