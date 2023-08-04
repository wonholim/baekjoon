
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	static Map<String, Integer> m = new HashMap<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		m.put("Poblano", 1500);
		m.put("Mirasol", 6000);
		m.put("Serrano", 15500);
		m.put("Cayenne", 40000);
		m.put("Thai", 75000);
		m.put("Habanero", 125000);
		long sum = 0;
		while (n --> 0) sum += m.get(br.readLine());
		System.out.println(sum);
	}

}
