import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        for (int i = 1; i < 100; i++) {
            System.out.printf("%d != %s%n", i, calcFactorial(i));
            // Thread.sleep(300);
        }
    }

    static String calcFactorial(int n) {
        return factorial(BigInteger.valueOf(n)).toString();
    }

    static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
