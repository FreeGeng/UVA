//使用charAt;注意char的偏移量為48,所以算出的每個數字要減48

import java.util.*;

class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		while (scanner.hasNext()) {
			String temp = scanner.nextLine();
			if (!temp.equals("0")) {
				long odd = 0;
				long even = 0;
				for (int i = 0; i < temp.length(); i += 2) {
					even += temp.charAt(i) - 48;
				}
				for (int i = 1; i < temp.length(); i += 2) {
					odd += temp.charAt(i) - 48;
				}
				long result1=(even-odd)%11;
				long result2=(odd-even)%11;
				if (even - odd == 0||result1==0||result2==0) {
					System.out.println(temp + " is a multiple of 11.");
				} else {
					System.out.println(temp + " is not a multiple of 11.");
				}
			}
			else{
				System.exit(0);
			}
		}
	}
}
