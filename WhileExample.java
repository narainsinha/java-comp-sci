public class WhileExample
{
	
	public static void main (String[] args)
	{
		IBIO.output("Narain Sinha");
		
		int x = IBIO.inputInt("Enter a positive number: ");
		while(x < 1)
		{
			x = IBIO.inputInt("Error - enter a positive number: ");
		}
		
		
	}
}
