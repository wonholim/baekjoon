
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
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		for(int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if(c == '1') {
				sb.append("   1\n"
						+ "   1\n"
						+ "   1\n"
						+ "   1\n"
						+ "   1\n");
			}else if(c == '2') {
				sb.append("2222\n"
						+ "   2\n"
						+ "2222\n"
						+ "2\n"
						+ "2222\n");
			}else if(c == '3') {
				sb.append("3333\n"
						+ "   3\n"
						+ "3333\n"
						+ "   3\n"
						+ "3333\n");
			}else if(c == '4') {
				sb.append("4  4\n"
						+ "4  4\n"
						+ "4444\n"
						+ "   4\n"
						+ "   4\n");
			}else if(c == '5') {
				sb.append("5555\n"
						+ "5\n"
						+ "5555\n"
						+ "   5\n"
						+ "5555\n");
			}else if(c == '6') {
				sb.append("6666\n"
						+ "6\n"
						+ "6666\n"
						+ "6  6\n"
						+ "6666\n");
			}else if(c == '7') {
				sb.append("7777\n"
						+ "   7\n"
						+ "   7\n"
						+ "   7\n"
						+ "   7\n");
			}else if(c == '8') {
				sb.append("8888\n"
						+ "8  8\n"
						+ "8888\n"
						+ "8  8\n"
						+ "8888\n");
			}else if(c == '9') {
				sb.append("9999\n"
						+ "9  9\n"
						+ "9999\n"
						+ "   9\n"
						+ "   9\n");
			}else if(c == '0') {
				sb.append("0000\n"
						+ "0  0\n"
						+ "0  0\n"
						+ "0  0\n"
						+ "0000\n");
			}
			if(i + 1 != line.length()) sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
