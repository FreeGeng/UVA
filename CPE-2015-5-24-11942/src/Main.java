import java.util.*;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		Main Main = new Main();
		Main.createArray();
	}

	public void createArray() {
		int lineNum = scanner.nextInt();
		int a[][] = new int[lineNum][10];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				a[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Lumberjacks:");
		for (int i = 0; i < 3; i++) {
			judge(a[i]);
		}
	}

	public void judge(int a[]) {

		if (a[1] > a[0]) {
			boolean result = bigger(a);
			if (result == true) {
				System.out.println("Ordered");
			} else {
				System.out.println("Unordered");
			}

		} else {
			boolean result = smaller(a);
			if (result == true) {
				System.out.println("Ordered");
			} else {
				System.out.println("Unordered");
			}
		}
	}

	public boolean bigger(int a[]) {
		boolean temp = true;
		for (int i = 0; i < 10; i++) {
			if (i <= 8) {
				if (a[i] > a[i + 1]) {
					temp = false;
					break;
				}

			}
		}
		return temp;
	}

	public boolean smaller(int a[]) {
		boolean temp = true;
		for (int i = 0; i < 10; i++) {
			if (i <= 8) {
				if (a[i] < a[i + 1]) {
					temp = false;
					break;
				}

			}
		}
		return temp;
	}

}
