
import java.util.Random;

public class highlow{
public static void main(String args[]){
IBIO.output("Kabir Sharma");
Random random = new Random();
do{
int number = random.nextInt(100);
long amount;
amount = IBIO.inputInt("Guess a number between 1 - 100: ");
if( amount > number){
	IBIO.output("this number is higher");
}
if (amount < number) {
	IBIO.output("Your number is lower");
}
if( amount == number) {
	IBIO.output("Your number is lower");
}
IBIO.output("The number was " + number);
}while(number == amount);
}

	}

