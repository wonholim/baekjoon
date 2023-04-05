

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		    NLCS: North London Collegiate School
			BHA: Branksome Hall Asia
			KIS: Korea International School
			SJA: St. Johnsbury Academy
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String l = br.readLine();
		if(l.equals("NLCS")) sb.append("North London Collegiate School");
		else if(l.equals("BHA")) sb.append("Branksome Hall Asia");
		else if(l.equals("KIS")) sb.append("Korea International School");
		else sb.append("St. Johnsbury Academy");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
