import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<>();
		m.put("ZERO", 0); m.put("ONE", 1); m.put("TWO", 2); m.put("THREE", 3); m.put("FOUR", 4);
		m.put("FIVE", 5); m.put("SIX", 6); m.put("SEVEN", 7); m.put("EIGHT", 8); m.put("NINE", 9); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a, "+-x/=");
		Queue<Character> q = new ArrayDeque<>();
		ArrayList<String> list = new ArrayList<>();
		while(st.hasMoreTokens()) {
			list.add(st.nextToken());
		}
		for(char d : a.toCharArray()) {
			if(!(d >= 65 && d <= 90)) {
				q.offer(d);
			}
		}
		if(list.size() < q.size()) {
			System.out.println("Madness!");
			return;
		}
		for(int i = 0; i < list.size(); i++) {
			for(char j : list.get(i).toCharArray()) {
				sb2.append(j);
				int k = m.getOrDefault(sb2.toString(), -1);
				if(k == -1) {
					continue;
				}else {
					sb1.append(k);
					sb2.setLength(0);
				}
			}
			if(sb2.toString().length() > 0) {
				System.out.println("Madness!");
				return;
			}
			char g = q.poll();
			sb1.append(g);
			q.offer(g);
		}
		list.clear();
		if(sb1.toString().equals("=")) {
			System.out.println("Madness!");
			return;
		}
		int count = 0;
		for(char l : sb1.toString().toCharArray()) {
			if(l == '=') {
				count++;
			}
		}
		if(count >= 2) {
			System.out.println("Madness!");
			return;
		}
		sb.append(sb1.toString()).append("\n");
		st = new StringTokenizer(sb1.toString(), "+-x/=");
		sb1.setLength(0);
		while(st.hasMoreTokens()) {
			list.add(st.nextToken());
		}
		long sum = 0;
		if(!list.isEmpty()) sum = Long.parseLong(list.get(0));
		for(int i = 1; i < list.size(); i++) {
			char k = q.poll();
			if(k == '+') {
				sum = sum + Long.parseLong(list.get(i));
			}else if(k == '-') {
				sum = sum - Long.parseLong(list.get(i));
			}else if(k == 'x') {
				sum = sum * Long.parseLong(list.get(i));
			}else if(k == '/') {
				sum = sum / Long.parseLong(list.get(i));
			}
		}
		String[] u = Long.toString(sum).split("");
		for(int i = 0; i < u.length; i++) {
			if(u[i].equals("1")) {
				sb1.append("ONE");
			}else if(u[i].equals("2")) {
				sb1.append("TWO");
			}else if(u[i].equals("3")) {
				sb1.append("THREE");
			}else if(u[i].equals("4")) {
				sb1.append("FOUR");
			}else if(u[i].equals("5")) {
				sb1.append("FIVE");
			}else if(u[i].equals("6")) {
				sb1.append("SIX");
			}else if(u[i].equals("7")) {
				sb1.append("SEVEN");
			}else if(u[i].equals("8")) {
				sb1.append("EIGHT");
			}else if(u[i].equals("9")) {
				sb1.append("NINE");
			}else if(u[i].equals("0")) {
				sb1.append("ZERO");
			}else if(u[i].equals("-")) {
				sb1.append("-");
			}   
		}
		sb.append(sb1.toString()).append("\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
