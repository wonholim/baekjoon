import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] b = new int[a];
		for(int i = 0; i < a; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(b);
		for(int i = 0; i < a; i++) {
			if(i + 1 != b[i]) {
				bw.write(Integer.toString(b[i]));
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
