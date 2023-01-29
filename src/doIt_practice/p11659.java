package doIt_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p11659 {

	public static void main(String[] args) throws IOException {
		// 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 
		// 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
		// 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
		FileInputStream fis = new FileInputStream("input.txt");
        System.setIn(fis);
        
        /*
         *	for(숫자 개수만큼 반복) {
         *		합 배열 생성하기 > S[i] = S[i - 1] + A[i]
         *	}
         *	for(질의 개수만큼 반복) {
         *		구간 합 출력하기 > S[j] - S[i - 1]
         *	}
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] sumArr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++) {
        	sumArr[i] = sumArr[i - 1] + Integer.parseInt(st.nextToken());
        }
        for (int j=0; j<M; j++) {
        	st = new StringTokenizer(br.readLine());
        	int start = Integer.parseInt(st.nextToken());
        	int end = Integer.parseInt(st.nextToken());
        	bw.write(String.valueOf(sumArr[end] - sumArr[start - 1]) + "\n");
        }
        bw.flush();
        bw.close();
	}

}
