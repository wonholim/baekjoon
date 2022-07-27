import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int[] a = new int[26];
		while(sc.hasNext()) {
			String[] b = sc.nextLine().split(" ");
			for(int i = 0; i < b.length; i++) {
				for(int j = 0; j < b[i].length(); j++) {
					a[b[i].charAt(j) - 97]++;
				}
			}
		}
		int max = 0;
		for(int k : a) {
			if(k > max) {
				max = k;
			}
		}
		for(int i = 0; i < a.length; i++) {
			if(max == a[i]) {
				sb.append((char)(i + 97));
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();

	}

}
