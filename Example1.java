public class Example1
{
	 public static void main(String[] args)
		{
    int num = IBIO.inputInt("enter number of lines ");
    String aa = stars(num);
    for (int i = 0; i < num; i++)
        IBIO.output(aa);
	}
	static String stars(int howmany)
	{
    String s = "";
    for (int i = 0; i < howmany; i++)
        s = s + "*";
    return s;
	}

}



