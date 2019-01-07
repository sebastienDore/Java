import java.util.*;
import java.lang.String;
import java.util.Scanner;

public class RockPaperScissor
{
	private int random;
	private String[] values;

	public RockPaperScissor()
	{
		Random rd = new Random();
		random = rd.nextInt(3);
		values = new String[3];
		values[0] = "Rock";
		values[1] = "Paper";
		values[2] = "Scissor";
	}

	private void CheckIfWin(String value)
	{
		if((values[random]).equalsIgnoreCase(value))
		{
			System.out.println("You win");
		}
		else
		{
			System.out.println("You loose");
		}
	}

	public void playRockPaperScissor()
	{
		System.out.println("Rock, Paper or Scissor ?");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		//CheckIfWin(str);
		switch(str.toLowerCase())
		{
			case "rock" :
			CheckIfWin(str);
			break;
			case "paper" :
			CheckIfWin(str);
			break;
			case "scissor" :
			CheckIfWin(str);
			break;
			default:
			System.out.println("Entry not valid");
			break;
		}
	}
}
