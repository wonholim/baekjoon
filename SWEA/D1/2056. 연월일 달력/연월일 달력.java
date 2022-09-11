/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = &apos;b&apos;;
// String var = &quot;ABCDEFG&quot;;
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
       Scanner sc = new Scanner(System.in);
		int q = Integer.parseInt(sc.nextLine());
		for(int test_case = 1; test_case <= q; test_case++) {
	        System.out.print("#" + test_case + " ");
			String a = sc.nextLine();
	        String b = a.substring(0, 4);
	        String c = a.substring(4, 6);
	        String d = a.substring(6, 8);
	        int dal = Integer.parseInt(c);
	        int wal = Integer.parseInt(d);
			if(Integer.parseInt(b) == 0){System.out.println("-1"); continue;}
	        if(dal < 1 || dal > 12) {System.out.println("-1"); continue;}
	        if(wal < 1 || wal > 31) {System.out.println("-1"); continue;}
	        if(dal == 9 || dal == 11 || dal == 4 || dal == 6){
	        	if(wal > 30) {System.out.println("-1"); continue;}
	        }else if(dal == 2){
	        	if(wal > 28) {System.out.println("-1"); continue;}
	        }
	        System.out.println(b + "/" + c + "/" + d); 
	}
    }
}