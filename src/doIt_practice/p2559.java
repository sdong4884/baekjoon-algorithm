package doIt_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2559 {

	public static void main(String[] args) throws IOException {
		// 첫째 줄에는 두 개의 정수 N과 K가 한 개의 공백을 사이에 두고 순서대로 주어진다. 
		// 첫 번째 정수 N은 온도를 측정한 전체 날짜의 수이다. N은 2 이상 100,000 이하이다. 
		// 두 번째 정수 K는 합을 구하기 위한 연속적인 날짜의 수이다. K는 1과 N 사이의 정수이다. 
		// 둘째 줄에는 매일 측정한 온도를 나타내는 N개의 정수가 빈칸을 사이에 두고 주어진다. 이 수들은 모두 -100 이상 100 이하이다. 
		// 첫째 줄에는 입력되는 온도의 수열에서 연속적인 K일의 온도의 합이 최대가 되는 값을 출력한다.
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] sumArr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++) {
        	sumArr[i] = sumArr[i - 1] + Integer.parseInt(st.nextToken());
        }
        int max = -10000001;
        for (int i=K; i<=N; i++) {
        	int rangeSum = sumArr[i] - sumArr[i - K]; 
        	if (rangeSum > max) {
        		max = rangeSum;
        	}
        }
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
	}

}
