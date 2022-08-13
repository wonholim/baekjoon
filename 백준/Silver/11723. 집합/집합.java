import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		boolean[] b = new boolean[20];
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			String c = st.nextToken();
			if(c.equals("add")) {
				int d = Integer.parseInt(st.nextToken());
				b[d - 1] = true;
			}else if(c.equals("check")) {
				int d = Integer.parseInt(st.nextToken());
				if(b[d - 1]) sb.append("1").append("\n");
				else sb.append("0").append("\n");
			}else if(c.equals("remove")) {
				int d = Integer.parseInt(st.nextToken());
				b[d - 1] = false;
			}else if(c.equals("toggle")) {
				int d = Integer.parseInt(st.nextToken());
				if(b[d - 1]) b[d - 1] = false;
				else b[d - 1] = true;
			}else if(c.equals("all")) {
				for(int i = 0; i < 20; i++) b[i] = true;
			}else if(c.equals("empty")) {
				for(int i = 0; i < 20; i++) b[i] = false;
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
