

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
		int t = Integer.parseInt(st.nextToken());
		int[] c = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048,
				   4096, 8192, 16384, 32768, 65536, 131072, 262144,
				   524288, 1048576, 2097152, 4194304, 8388608, 16777216,
				   33554432, 67108864};
		while(t --> 0) {
			boolean check = false;
			int k = Integer.parseInt(br.readLine());
			for(int i = 0; i < c.length; i++) {
				if(c[i] == k) {
					check = true;
					break;
				}
			}
			if(check) sb.append("GoHanGang\n");
			else sb.append("Gazua\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
