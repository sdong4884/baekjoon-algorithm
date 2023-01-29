package doIt_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p11660 {

	public static void main(String[] args) throws IOException {
		// N×N개의 수가 N×N 크기의 표에 채워져 있다. (x1, y1)부터 (x2, y2)까지 합을 구하는 프로그램을 작성하시오.
		FileInputStream fis = new FileInputStream("input.txt");
        System.setIn(fis);
        
        /*
         * N(배열 크기), M(질의 수) 저장하기
         * for (N만큼 반복) {
         * 		for(N만큼 반복) {
         * 			원본 배열 저장하기
         * 		}
         * }
         * for (N만큼 반복) {
         * 		for(N만큼 반복) {
         * 			합 배열 저장하기
         * 			-> D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j]
         * 		}
         * }
         * for (M만큼 반복) {
         * 		결과 -> D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1]
         * }
         */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N + 1][N + 1];
        for (int i=1; i<=N; i++) {
        	st = new StringTokenizer(br.readLine());
        	for (int j=1; j<=N; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        int[][] sumArr = new int[N + 1][N + 1];
        for (int i=1; i<=N; i++) {
        	for (int j=1; j<=N; j++) {
        		sumArr[i][j] = sumArr[i][j - 1] + sumArr[i - 1][j] - sumArr[i - 1][j - 1] + arr[i][j];
        	}
        }
        for (int i=0; i<M; i++) {
        	st = new StringTokenizer(br.readLine());
        	int x1 = Integer.parseInt(st.nextToken());
        	int y1 = Integer.parseInt(st.nextToken());
        	int x2 = Integer.parseInt(st.nextToken());
        	int y2 = Integer.parseInt(st.nextToken());
        	String result = String.valueOf(sumArr[x2][y2] - sumArr[x1 - 1][y2] - sumArr[x2][y1 - 1] + sumArr[x1 - 1][y1 - 1]);
        	bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
	}

}
