import java.util.*;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int counter=1;
		while (scanner.hasNext()) {
			
			int total = 0;
			int result=0;
			int a = Integer.parseInt(scanner.nextLine());
			if (a != 0) {
				int set[] = new int[a];
				String temp1[]=scanner.nextLine().split(" ");
				for (int i = 0; i < set.length; i++) {
					set[i] = Integer.parseInt(temp1[i]);
					total += set[i];
				}
				int temp = total / a;
				for(int j =0;j<set.length;j++){
					if(set[j]>temp){
					  int b = set[j]-temp;
					  result+=b;
					}
				}
				System.out.println("Set #"+counter);
				System.out.println("The minimum number of moves is "+result+".");
				counter++;
			} else {
				System.exit(0);
			}
		}
	}

}
