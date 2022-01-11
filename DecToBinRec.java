import java.util.*;

public class DecToBinRec 
{
    public static void decToBin(int n) {
        if (n == 0) 
        {
            return; 
        }
        decToBin(n/2);
        System.out.print( " " + (n % 2));

    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer (base 10): ");
        int b10 = input.nextInt();
        if(b10 < 0)
        System.out.print(" the number entered is negative, it will be positive: ");
        while(b10 < 0)
			{b10 = b10 * -1;}
        System.out.println();
        System.out.print(b10 + " base 10 = ");
        decToBin(b10);
        System.out.println(" " + ("base 2.\n"));
    }
}
