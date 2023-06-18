
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Map<String, String> m = Map.of("SONGDO", "HIGHSCHOOL", "CODE", "MASTER", "2023", "0611", "ALGORITHM", "CONTEST");
		sb.append(m.get(br.readLine()));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
