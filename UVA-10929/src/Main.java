import java.math.BigInteger;
import java.util.*;

class Main {
	static Scanner scanner = new Scanner(System.in);
	static final BigInteger ZERO = new BigInteger("0");

	public static void main(String args[]) {
		while (scanner.hasNext()) {
			String temp = scanner.nextLine();
			BigInteger inputNum = new BigInteger(temp);

			if (!inputNum.equals(ZERO)) {
				if (judge(inputNum) == true) {
					System.out.println(inputNum + " is a multiple of 11.");
				} else {
					System.out.println(inputNum + " is not a multiple of 11.");
				}
			} else {
				System.exit(0);
			}
		}
	}

	static boolean judge(BigInteger num) {
		BigInteger btwo = new BigInteger("11");
		BigInteger result = num.mod(btwo);
		if (result.equals(ZERO)) {
			return true;
		} else {
			return false;
		}
	}
}
