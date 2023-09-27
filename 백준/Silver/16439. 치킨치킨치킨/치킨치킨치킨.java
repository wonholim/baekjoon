import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                c[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int ans = 0;
        for (int x = 0; x < m; x++) {
            for (int y = x; y < m; y++) {
                for (int z = y; z < m; z++) {
                    int tmp = 0;
                    for (int i = 0; i < n; i++) {
                        tmp += Math.max(c[i][x], Math.max(c[i][y], c[i][z]));
                    }
                    ans = Math.max(ans, tmp);
                }
            }
        }
        System.out.println(ans);
    }
}
