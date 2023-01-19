package level04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p10871 {

	public static void main(String[] args) throws IOException {
		// 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
		// 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
		// X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str1 = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str1.nextToken());
		int X = Integer.parseInt(str1.nextToken());

		StringTokenizer str2 = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			String num;
			num = str2.nextToken();
			if (Integer.parseInt(num) < X) {
				bw.write(num + " ");
			}
		}
		bw.flush();
		bw.close();
	}

}
