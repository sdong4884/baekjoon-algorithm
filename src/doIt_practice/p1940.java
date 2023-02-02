package doIt_practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1940 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 첫째 줄에는 재료의 개수 N(1 ≤ N ≤ 15,000)이 주어진다. 
		// 두 번째 줄에는 갑옷을 만드는데 필요한 수 M(1 ≤ M ≤ 10,000,000) 주어진다.
		// 셋째 줄에는 N개의 재료들이 가진 고유한 번호들이 공백을 사이에 두고 주어진다. 고유한 번호는 100,000보다 작거나 같은 자연수이다.
        System.setIn(new FileInputStream("input.txt"));

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       int M = Integer.parseInt(br.readLine());
       int[] A = new int[N];
       StringTokenizer st = new StringTokenizer(br.readLine());
       for (int i=0; i<N; i++) {
    	   A[i] = Integer.parseInt(st.nextToken());
       }
       Arrays.sort(A);
       // 1 2 3 4 5 7
       int i = 0;
       int j = N - 1;
       int count = 0;
       while (i < j) {
    	   if (A[i] + A[j] > M) {
    		   j--;
    	   } else if (A[i] + A[j] < M) {
    		   i++;
    	   } else {
    		   // A[i] + A[j] == M
    		   count++;
    		   i++;
    		   j--;
    	   }
       }
       System.out.println(count);
	}

}
