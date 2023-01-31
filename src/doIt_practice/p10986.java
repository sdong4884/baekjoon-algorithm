package doIt_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p10986 {

	public static void main(String[] args) throws IOException {
		// 첫째 줄에 N과 M이 주어진다. 둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다.
		// 첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.
        System.setIn(new FileInputStream("input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		// 1.누적합을 구하고 2.누적합을 M으로 나누고 3.그 배열에서 0의 개수 카운트 4.같은 숫자 카운트 5.콤비네이션 계산
		long count = 0;
		long[] arr = new long[N + 1];
		long[] cnt = new long[M];
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=N; i++) {
			arr[i] = (arr[i - 1] + Integer.parseInt(st.nextToken())) % M;
			if (arr[i] == 0) count++;
			cnt[(int) arr[i]]++;
		}
		for (int i=0; i<M; i++) {
			count += (cnt[i] * (cnt[i] - 1)) / 2;
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}

}
