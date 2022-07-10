import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc= new Scanner(System.in);
		for(int i = 2; i <= 100; i++) {
			for(int j = 2; j < i; j++) {
				for(int k = j; k <= i; k++) {
					for(int n = k; n <= i; n++) {
						if(n * n * n + k * k * k + j * j * j == i * i * i) {
							System.out.println("Cube = " + i + ", Triple = (" + j + "," + k + "," + n + ")");
						}
					}
				}
			}
		}
	}
}
