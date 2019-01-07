import static java.lang.System.*;
import java.util.*;

public class TossCoin
{

private Random random;
public TossCoin()
{
	random = new Random();
}

public boolean playTossCoin()
{	
	return random.nextBoolean();
}

}
