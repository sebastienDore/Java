import java.lang.System.*;
import java.util.*;
import java.util.Scanner;

public class TossCoin
{

	private Random random;
	public TossCoin()
	{
		random = new Random();
	}

	private void CheckIfWin(boolean value, boolean state)
	{
		if(value)
		{
			if (state)
			{
				System.out.println("You win !");
			}
			else
			{
				System.out.println("You loose");
			}
		}
		else
		{
			if(state)
			{
				System.out.println("You win !");
			}
			else
			{
				System.out.println("You loose");
			}
		}
	}

	public void playTossCoin()
	{	
		boolean coinStatus = random.nextBoolean();
		
		System.out.println("Head or Tail ?");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	
		switch(str)
		{
			case "head":
			CheckIfWin(true, coinStatus);
			break;
			case "tail":
			CheckIfWin(false, coinStatus);
			break;
			default:
			System.out.println("Entry not valid");
			break;
		}
	}

}
