package level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2438 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int i=1; i<=N; i++) {
			String star = "";
			for (int j=1; j<=i; j++) {
				star += "*";
			}
			bw.write(star + "\n");
		}
		bw.flush();
		bw.close();
	}

}
