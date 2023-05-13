
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[64];
		while(k --> 0) {
			String query = br.readLine();
			long num = Long.parseLong(query.substring(1, query.length()));
			int de = cook(num);
			if(query.charAt(0) == '+') {
				arr[de]++;
			}else {
				arr[de]--;
			}
			int[] tmp = arr.clone();
			sb.append(cooking(tmp)).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static long cooking(int[] tmp) {
		// TODO Auto-generated method stub
		long max = 0;
		
		for(int i = 0; i < tmp.length - 2; i++) {
			if(tmp[i] >= 2) {
				tmp[i + 1] += tmp[i] / 2;
			}
		}
		for(int i = 0; i < tmp.length - 1; i++) {
			if(tmp[i] != 0) {
				max = (long) Math.pow(2, i);
			}
		}
		return max;
	}

	private static int cook(long num) {
		// TODO Auto-generated method stub
		int i = 0;
		for(; i < 63; i++) {
			if(Math.pow(2, i) == num) break;
		}
		return i;
	}

}
