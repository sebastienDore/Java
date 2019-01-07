import java.util.Scanner;
import java.util.*;

class test
{
	public static void main(String[] args)
	{
		System.out.println("Head or Tail?");

		TossCoin tc = new TossCoin();

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		switch(str)
		{
			case "head":
			if(tc.playTossCoin())
			{	
				System.out.println("You win!");
			}
			else
			{
				System.out.println("You loose");
			}
			break;
			case "tail":
			if(tc.playTossCoin())
			{
				System.out.println("You win");
			}
			else
			{
				System.out.println("You loose");
			}
			break;	
		}
	}
}
