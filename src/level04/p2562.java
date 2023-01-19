package level04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		// 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = 9;
		int max = 0;
		int position = 0;
		for(int i=0; i<n; i++) {
			int cur = Integer.parseInt(br.readLine());
			if (max < cur) {
				max = cur;
				position = i+1;
			}
		}
		bw.write(Integer.toString(max));
		bw.newLine();
		bw.write(Integer.toString(position));
		bw.flush();
		bw.close();
	}

}
