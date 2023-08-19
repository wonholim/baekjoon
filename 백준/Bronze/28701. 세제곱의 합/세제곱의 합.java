import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = ((n * (n + 1)) / 2);
        System.out.println(k);
        System.out.println(k * k);
        System.out.println(k * k);
    }
}