import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			if(a == 0) {
				break;
			}
			List<Integer> list = new LinkedList<>();
			int d = 100;
			while(a --> 0) {
				int b = sc.nextInt();
				if(d != b) { 
					list.add(b);
					d = b;
				}
			}
			for(Integer c : list) {
				System.out.print(c + " ");
			}
			System.out.println("$");
		}
	}

}
