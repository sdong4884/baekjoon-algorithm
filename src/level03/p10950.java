package level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10950 {

	public static void main(String[] args) throws IOException {
		// 각 테스트 케이스마다 A+B를 출력한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			String inputStr = br.readLine();
			StringTokenizer st = new StringTokenizer(inputStr);
			while (st.hasMoreTokens()) {
	            System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
	        }
		}
	}

}
