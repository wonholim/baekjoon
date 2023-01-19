

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
		static int n;
		static int m;
		static int[][] c;
		static boolean[][] d;
	    static Queue<int[]> q;
	    static int[] dx = {1, 1, -1, -1, 2, 2, -2, -2};
	    static int[] dy = {2, -2, 2, -2, 1, -1, 1, -1};
	    static int lx = 0;
	    static int ly = 0;
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringBuilder sb = new StringBuilder();
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			c = new int[n][m];
			d = new boolean[n][m];
	        q = new ArrayDeque<>();
	        for(int i = 0; i < n; i++){
	            String k = br.readLine();
	            for(int j = 0; j < m; j++){
	                if(k.charAt(j) == 'z'){
	                    d[i][j] = true;
	                    q.offer(new int[]{i, j, 0});
	                }else if(k.charAt(j) == 'x'){
	                	d[i][j] = true;
	                }else if(k.charAt(j) == 'n'){
	                    lx = i;
	                    ly = j;
	                }
	            }
	        }
	        while(!q.isEmpty()){
	            int[] g = q.poll();
	            for(int k = 0; k < 8; k++){
	                int i = g[0] + dx[k];
	                int j = g[1] + dy[k];
	                if(i >= 0 && j >= 0 && i < n && j < m){
	                    if(!d[i][j]){
	                        d[i][j] = true;
	                        c[i][j] = g[2] + 1;
	                        q.offer(new int[]{i, j, g[2] + 1});
	                    }
	                }
	            }
	        }
	        if(d[lx][ly]) sb.append(c[lx][ly]);
	        else sb.append("NIE");
			bw.write(sb.toString());
			bw.flush();
			bw.close();
			br.close();
	}

}
