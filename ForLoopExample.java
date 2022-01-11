public class ForLoopExample
{
	
	public static void main (String[] args)
	{
		int k = 2;
		IBIO.out("Counting up: ");
		for(int i = 1; i <= 10; i++) // for loop the number of iterations to be done is already known and is used to obtain a certain result whereas in while loop the command runs until a certain condition is reached and the statement is proved to be false.
		{
			IBIO.out(i + " ");
		}
		IBIO.output("\nEND"); 
		
		IBIO.out("Counting down: ");
		for(int i = 10; i > 0; i--) // repeats 10 times, i counts
		{
			IBIO.out(i + " ");
		}
		IBIO.output("\nEND");
		
		IBIO.out("Counting up in steps of 3: ");
		for(int i = 0; i < 20; i = i + 3)
		{
			IBIO.out(i + " ");
		}
		IBIO.output("\nEND");
		
		IBIO.out("Counting up in steps of 3: ");
		for(int i = 20; i > 0; i = i - 3)
		{
			IBIO.out(i + " ");
		}
		IBIO.output("\nEND");
		
		IBIO.out("Counting as indices: ");
		for(int i = 2; i <= 65536; i = i * k)
		{
			IBIO.out(i + " ");
		}
		IBIO.output("\nEND");
	}
}
