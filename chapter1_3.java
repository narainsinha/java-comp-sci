public class chapter1_3

{

	
	public static void main (String[] args)
	{
		IBIO.output("\nFrom 1:");
		for(int x = 1; x <= 10; x=x+1)
		{
			IBIO.output(x + " " + x*x + " " + x*x*x);
		}
		
		IBIO.output("\nFrom 0:");
		for(int x = 0; x < 10; x++)
		{
			IBIO.output(x + "\t" + x*x + "\t" + x*x*x);
		}
	}
}
