import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sugar = sc.nextInt();
		int sum = 0;
		do {
			if(sugar % 5 == 0) {
				sum = sum + (sugar/ 5);
				break;
			}else {
				sugar = sugar - 3;
				sum++;
			}
		}while(sugar > 0);
		if(sugar < 0) {
			System.out.println(-1);
		}else {
		System.out.println(sum);
		}
		sc.close();
	}

}