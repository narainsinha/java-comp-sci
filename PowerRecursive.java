
public class PowerRecursive {
    public static double power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1)

        {
            return base;

        } else if (exponent > 1) {
            return base * power(base, exponent - 1);
        }

}
        public static void main(String args[]) {
            System.out.print("Base = ");
            int base = input.nextInt();
            System.out.print("Exponent = ");
            int exponent = input.nextInt();
            if (exponent < 0) {
                System.out.println("\n" + base + " ^ " + exponent + " = " + 1 / (power(base, exponent) * -1));
            }
            if (exponent > 0) {
                System.out.println("\n" + base + " ^ " + exponent + " = " + power(base, exponent));
            }
        }
    }

