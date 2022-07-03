import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 0 ;
		int[] arr = new int[9];
		int i = 0;
		while(sc.hasNext()) {
			int a = sc.nextInt();
			arr[i] = a;
			if(a > max) {
			max = a;
			}
			i++;
		}
		System.out.println(max);
		for(int j = 0; j < i; j++) {
			if(max == arr[j]) {
				System.out.println(j+1);
				break;
			}
		}
	}

}