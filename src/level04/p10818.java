package level04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		String min = null;
		String max = null;
		for(int i=0; i<N; i++) {
			String cur = st.nextToken();
			if (i == 0) {
				min = cur;
				max = cur;
			}
			if (Integer.parseInt(min) > Integer.parseInt(cur)) min = cur;
			if (Integer.parseInt(max) < Integer.parseInt(cur)) max = cur;
		}
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
	}

}
