import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		LinkedHashSet<String> lh = new LinkedHashSet<>();
		lh.add("c="); lh.add("c-"); lh.add("dz="); lh.add("d-"); lh.add("lj"); lh.add("nj"); lh.add("s="); lh.add("z=");
		String line = br.readLine();
		for(String k : lh) {
			if(line.contains(k)){
				line = line.replaceAll(k, "1");
			}
		}
		sb.append(line.length());
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
