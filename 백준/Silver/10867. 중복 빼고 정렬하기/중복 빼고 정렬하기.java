import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		int a = sc.nextInt();
		while(a --> 0) {
			set.add(sc.nextInt());
		}
		int[] b = set.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(b);
		for(int c : b) {
			System.out.print(c + " ");
		}
	}

}