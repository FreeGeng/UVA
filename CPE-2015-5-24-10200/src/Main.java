import java.util.*;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		Main main = new Main();
		main.start();
	}

	public void start() {
		List<Integer> list = new ArrayList<Integer>();
		while (scanner.hasNextLine()) {
			String temp[] = scanner.nextLine().split(" ");
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			if (a==0&&b==0) {
				break;
			}
			else{
			list.add(a);
			list.add(b);
			System.out.println(list);
			}
		}
		
		list.iterator();

	}
}
