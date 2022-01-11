public class compsciQ2test
{

	public static void main (String[]args)
{
	IBIO.output("Narain Sinha ");
	int base = IBIO.inputInt("Enter a base: ");
	
	while(base == 0)
		{
			System.exit(0);
		}
		
	while(base > 10)
		{
				base = IBIO.inputInt("Enter number <= 10. Enter the base: ");
		}
	
	int exponent = IBIO.inputInt("Enter an exponent: ");

	while(exponent > 10)
		{
				exponent = IBIO.inputInt("Enter number <= 10. Enter the base: ");
		}
		
		IBIO.output("Answer = " + base  * pow(base, exponent - 1));
}
public static double power (int base, int exponent)
	{
		if( exponent < 0 )
		{	return 1.0 / pow(base, -exponent);
		} else
		{	return base * power(base, exponent);
		}
	}
	public static double pow (int b, int e)
	{
	if (e == 0)			
		{	return 1;} 
		else{
			 if (e == 1)
		return b; }	
	 if( e < 0 ){
			 
			return 1.0 / pow(b, -e);
		} 
		else
		{	return b * pow(b, e - 1); 
		}
	
	
	
	
	}
}
	

