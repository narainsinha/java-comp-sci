
public class Pr11
{
	
	public static void main (String[] args)
	{
		int n = IBIO.inputInt ("enter a number: ");
		switch(n)
		
		{
			case 1:
			IBIO.output("The number entered was 1");
			break;
			case 2:
			IBIO.output("The number entered was 2");
			break;
			case 3:
			IBIO.output("The number entered was 3");
			break;
			default:
			IBIO.output("cmon, enter a number that is either 1,2,3. the number was not them: ");
		}
	}
}

