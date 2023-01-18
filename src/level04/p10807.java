package level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10807 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 
		// 둘째 줄에는 정수가 공백으로 구분되어져있다. 
		// 셋째 줄에는 찾으려고 하는 정수 v가 주어진다.
		// 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		int[] intArr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			intArr[i] = Integer.parseInt(st.nextToken());
		}
		int seachNum = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i=0; i<N; i++) {
			if (intArr[i] == seachNum) {
				count++;
			}
		}
		System.out.println(count);
	}

}
