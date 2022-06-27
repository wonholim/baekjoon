import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] spt = str.split(" ");
		if(spt.length != 0) {
			if(spt[0] == "") {
				if(spt[spt.length -1] == "") {
					System.out.println(spt.length - 2);
				}else {
				System.out.println(spt.length - 1);
				}
			}else{
				if(spt[spt.length - 1] == "") {
					System.out.println(spt.length - 1);
				}else {
					System.out.println(spt.length);
				}
			}
		}else {
			System.out.println("0");
		}
	}

}