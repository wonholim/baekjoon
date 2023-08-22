import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, String> m = Map.of("M", "MatKor", "W", "WiCys", "C", "CyKor", "A", "AlKor", "$", "$clear");
		System.out.print(m.get(br.readLine()));
	}
}