package session3;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int _continue=0;
		double _x;
		double _y;
		do
		{
			System.out.println("Press 1 for Addition \nPress 2 for Subtraction \nPress 3 for Multipication \nPress 4 for Subtraction");
			int _option=sc.nextInt();
			System.out.println("Enter the First number");
			_x=sc.nextDouble();
			System.out.println("Enter the Second number");
			_y=sc.nextDouble();
			switch(_option)
			{
				case 1: System.out.println(Add(_x,_y));
				break;
				case 2: System.out.println(Sub(_x,_y));
				break;
				case 3: System.out.println(Mul(_x,_y));
				break;
				case 4: System.out.println(Div(_x,_y));
				break;
				default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Press 1 for next exceution");
			_continue=sc.nextInt();
		}while (_continue==1);
		sc.close();
	}
	static double Add(double x, double y)
	{
		return x+y;
	}
	static double Sub(double x, double y)
	{
		return x-y;
	}
	static double Mul(double x, double y)
	{
		return x*y;
	}
	static double Div(double x, double y)
	{
		return x/y;
	}
}
