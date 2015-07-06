import java.util.*;

class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int a = Integer.parseInt(scanner.nextLine());
		int counter1 = 0;

		for (int k = 0; k < a; k++) {
			if (counter1 < a) {
				String temp = scanner.nextLine();
				String temp1[] = temp.split("");
				int counter = 0;
				int score = 0;
				for (int i = 0; i < temp1.length; i++) {
					if (temp1[i].equals("O")) {
						++counter;
						score += counter;
					} else {
						counter = 0;
					}
				}

				System.out.println(score);
				counter++;
			} else {
				System.exit(0);
			}
		}

	}
}
