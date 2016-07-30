import java.util.*;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String atgs[]) {
		Main Main = new Main();
		Main.start();
	}

	public void start() {
		int total = scanner.nextInt();
		int a[] = new int[total];
		for (int i = 0; i < total; i++) {
			a[i] = scanner.nextInt();
		}
		startJudge(a);
	}

	public void startJudge(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int temp[] = new int[1000];
			int tempIndex = -1;
			int result[] = judgeIndex(a[i], temp, tempIndex);

			int length = 0;
			for (int j = 0; j < 1000; j++) {
				if (result[j] != 0) {
					length++;
				} else {
					break;
				}
			}
			String finalFib = "";
			int Fib[] = createFib();
			int result1[] = new int[length];
			for (int j = 0; j < length; j++) {
				result1[j] = result[j];
			}
			Arrays.sort(result1);

			int finalLength = 0;
			for (int j = 0; j < 1000; j++) {
				if (result1[length - 1] == Fib[j]) {
					finalLength = j + 1;
					break;
				}
			}

			for (int j = 0; j < finalLength; j++) {
				boolean need = false;
				for (int k = 0; k < length; k++) {
					if (Fib[j] == result1[k]) {
						need = true;
						break;
					}
				}

				if (need == true) {
					finalFib += "1";
					need = false;
				} else {
					finalFib += "0";
				}
			}
			StringBuffer sb = new StringBuffer(finalFib);
			sb = sb.reverse();
			System.out.println(a[i] + " = " + sb.toString() + "  (fib)");
		}
	}

	public int[] createFib() {
		int fib[] = new int[1000];
		fib[0] = 1;
		fib[1] = 2;
		for (int i = 2; i < 1000; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib;
	}

	public int[] judgeIndex(int a, int[] temp, int tempIndex) {
		int MaxIndex = 0;
		tempIndex++;
		int[] fib = createFib();
		for (int i = 0; i <= 1000; i++) {
			if (fib[i] > a) {
				MaxIndex = i;
				temp[tempIndex] = fib[MaxIndex - 1];
				a -= fib[MaxIndex - 1];
				judgeIndex(a, temp, tempIndex);
				break;
			} else if (fib[i] == a) {
				MaxIndex = i;
				temp[tempIndex] = fib[MaxIndex];
				a -= fib[MaxIndex];
				break;
			}
		}
		return temp;
	}

}
