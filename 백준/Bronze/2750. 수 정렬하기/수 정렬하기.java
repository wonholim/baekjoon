import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Set<Integer> s = new HashSet<>();
		int a = sc.nextInt();
		while(a --> 0) {
			s.add(sc.nextInt());
		}
		Integer[] arr = s.toArray(new Integer[s.size()]);
		Arrays.sort(arr);
		for(Integer b : arr) {
			System.out.println(b);
		}
	}

}