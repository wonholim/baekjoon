import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(true) {
			double d = 0;
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			System.out.println("Triangle #" + (i + 1));
			if(a == -1) {
				d = Math.sqrt((c * c) - (b * b)); 
				if(Double.isNaN(d)  || d == 0 || b + d < c) {
					System.out.println("Impossible.");
				}else {	
					System.out.print("a = ");
					System.out.printf("%.3f\n", d);
				}
			}else if(b == -1) {
				d = Math.sqrt((c * c) - (a * a)); 
				if(Double.isNaN(d)  || d == 0 || a + d < c) {
					System.out.println("Impossible.");
				}else {	
					System.out.print("b = ");
					System.out.printf("%.3f\n", d);
				}
			}else if(c == -1){
				d = Math.sqrt((a * a) + (b * b)); 
				if(Double.isNaN(d) || d == 0 || a + b < d) {
					System.out.println("Impossible.");
				}else {	
					System.out.print("c = ");
					System.out.printf("%.3f\n", d);
				}
			}
			System.out.println();
			i++;
		}
	}

}