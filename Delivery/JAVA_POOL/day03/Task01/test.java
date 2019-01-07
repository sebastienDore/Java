import java.util.Scanner;
import java.util.*;

class test
{
	public static void main(String[] args)
	{
		//TossCoin tc = new TossCoin();
		//tc.playTossCoin();
		//RockPaperScissor rp = new RockPaperScissor();
		//rp.playRockPaperScissor();
		RouletteWheel rw = new RouletteWheel();
		boolean check = false;
		do
		{
		
			check = rw.playRouletteWheel();
		}while(check != true);
	}
}
