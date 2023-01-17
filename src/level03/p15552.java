package level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
		// Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
		
		// 첫 줄에 테스트케이스의 개수 T가 주어진다.
		// 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			String inputStr = br.readLine();
			StringTokenizer st = new StringTokenizer(inputStr);
			while (st.hasMoreTokens()) {
				int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
				bw.write(sum + "\n");
			}
		}
		bw.flush();
		bw.close();
	}

}
