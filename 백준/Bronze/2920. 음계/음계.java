import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String as = "1 2 3 4 5 6 7 8";
		String ds = "8 7 6 5 4 3 2 1";
		String a = sc.nextLine();
		if(as.equals(a)) {
			System.out.println("ascending");
		}else if(ds.equals(a)) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}

}