public class chapter1_2

{ 
	
	public static void main (String[] args)
	{	
		int steps  = IBIO.inputInt("Steps: ");
		int start  = IBIO.inputInt("Start: ");
		int inc    = IBIO.inputInt("Increment: ");
		int number = start;
		for(int i  = steps; i > 0; i--) 
		{
			IBIO.out(number + " ");
			number = number + inc;
		}
		
		IBIO.output("");
		number = start; 
		for(int i = 0; i < steps; i++) 
		{
			IBIO.out(number + " ");
			number = number + inc;
		}
		IBIO.output("");
		
		
		
		// answer: 
		//Steps: 2
//Start: 3
//Increment: 4
//3 7
//3 7


	}
}
