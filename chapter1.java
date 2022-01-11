public class chapter1
{
	
	public static void main (String[] args)
	{
		int n = IBIO.inputInt("How many times? ");
		String nickname = IBIO.input("Nickname: ");
		int i; 
		for(i = 0; i < n; i++) 
		{
			IBIO.out( i + "\t: My name :)\t" + nickname);
			IBIO.output( "\t i<n? " + (i<n) );
		}
		IBIO.output(i + "\t i<n? " + (i < n) );
		
	
		IBIO.output("Original Problem 1.1=======");
		int x = IBIO.inputInt("How many times? ");
		for(int t = 0; t < x; t++) 
		{	IBIO.output("Narain");
		}

	}
}
