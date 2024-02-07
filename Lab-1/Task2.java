
import java.util.Scanner;
class Qtwo
{
	public static void main (String args[])
	{
		
		Scanner num=new Scanner(System.in);
		int no1;
		System.out.print(" Enter the number :");
		no1=num.nextInt();
		int temp = no1;
        int d = 10000;
		for(int i=0;i<no1;i++)
		{
			int digit;
			digit=temp/d;
			System.out.println(digit);
            temp %= d;
            d /= 10;
		}

	}




}
