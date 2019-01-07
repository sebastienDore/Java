import java.util.Scanner;
import java.util.*;
import java.io.*;

public class RouletteWheel
{
	private int randomNumber;
	private int[] cases;
	private Random rd;

	RouletteWheel()
	{
		rd = new Random();
		cases = new int[37];
		for(int i=0; i<37; i++)
		{
			cases[i] = i%2;
		}
		System.out.println("Welcome to the Roulette Wheel!!!");
	}

	private boolean checkIfWin(int value)
	{
		boolean status = false;
		//40 => Red / 50 => Black
		//System.out.println(randomNumber);
		if(value == 40 && randomNumber %2 ==0)
		{
			if(randomNumber != 0)
			{
				System.out.println("You win !");
				status = true;
			}
		}
		if(value == 40 && randomNumber %2 ==1)
		{
			System.out.println("You loose");
			status = false;
		}
		if(value == 50 && randomNumber%2 == 1)
		{
			System.out.println("You win !");
			status = true;
		}
		if(value == 50 && randomNumber %2 ==0)
		{
			System.out.println("You loose");
			status = false;
		}
		if(value != 40 && value != 50)
		{
			if(value == randomNumber)				
			{
				System.out.println("You win !");
				status = true;
			}
			else
			{
				System.out.println("You loose");
				status = false;
			}
		}
		return status;
	}

	public boolean playRouletteWheel()
	{
		rd = new Random();
		randomNumber = rd.nextInt(37);
		int choice = 0;
		boolean check = false;

		System.out.println("Tell me what you want!");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(), condition = "";
		if(str.equals("r") || str.equalsIgnoreCase("red"))
		{
			condition = "red";
		}
		else if(str.equals("b") || str.equalsIgnoreCase("black"))
		{
			condition = "black";
		}
		else if(str.equalsIgnoreCase("rules"))
		{
			condition = "rules";
		}
		else
		{
			try
			{
				choice = Integer.parseInt(str);
				if(choice <= 36)
				{
					condition = "number";
				}
			}
			catch(Exception e)
			{
				
			}
		}
		switch(condition)
		{
			case "red":
				check = checkIfWin(40);
			break;
			case "black":
				check = checkIfWin(50);
			break;
			case "rules":
				showRules();
			break;
			case "number":
				check = checkIfWin(choice);
			break;
			default:
				System.out.println("Entry not valid.");
			break;
		}
		return check;
	}

	private void  showRules()
	{
		System.out.println(
		"You cant bet on a color like RED and BLACK case.\n" +
		"You can't bet on GREEN.\n" +
		"Number can be choosen, it goes from 0 to 36.\n" +
		"\n" + 
		"Seems like you are not very familiar here..\n" + 
		"You have to tell me what you want to bet.\n" + 
		"You can bet on colors RED and BLACK or choose a number like:\n" + 
		"red or BLACK or b or 32...\n" + 
		"You can't have multiple bet nor comprehensible bet.\n" + 
		"Remember that the roulette wheel have 37 cases.\n" + 
		"If so, I will have to task you again...\n"
		);
	}
}
