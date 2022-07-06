import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int a = 0, b = 0, c = 0;
		if(A % 300 != 0 && A % 60 != 0 && A % 10 != 0) {
			System.out.println(-1);
		}else {
			if(A >= 300) {
				a = A / 300;
				A = A % 300;
					if(A >= 60) {
						b = A / 60;
						A = A % 60;
							if(A >= 10){
								c = A / 10;
								A = A % 10;
							}
					}else{
						c = A / 10;
						A = A % 10;
					}
			}else if(A >= 60) {
				b = A / 60;
				A = A % 60;
					if(A >= 10) {
						c = A / 10;
						A = A % 10;
					}
			}else {
				c = A / 10;
			}
			System.out.println(a + " " + b + " " + c);
		}
	}

}