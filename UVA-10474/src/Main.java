import java.util.*;

class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {

		while (scanner.hasNext()) {

			String temp[] = scanner.nextLine().split(" ");
			int a[] = new int[Integer.parseInt(temp[0])];
			int b[] = new int[Integer.parseInt(temp[1])];

			if (Integer.parseInt(temp[0]) != 0
					&& Integer.parseInt(temp[1]) != 0) {
				for (int i = 0; i < Integer.parseInt(temp[0]); i++) {
					a[i] = Integer.parseInt(scanner.nextLine());
				}
				for (int i = 0; i < Integer.parseInt(temp[1]); i++) {
					b[i] = Integer.parseInt(scanner.nextLine());
				}
				Arrays.sort(a);
				for (int i = 0; i < b.length; i++) {
					int L = 0, R = a.length - 1, mid;
					while (L != R) {
						mid = (L + R) / 2;
						if (a[mid] >= b[i])
							R = mid;
						else
							L = mid + 1;
					}
					if (a[L] == b[i]) {
						System.out.println(b[i] + " found at " + (L + 1));
					} else {
						System.out.println(b[i] + " not found");
					}
				}

			} else {
				System.exit(0);
			}
		}
	}
}
