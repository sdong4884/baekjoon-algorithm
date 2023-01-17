package level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10952 {

	public static void main(String[] args) throws IOException {
		// 각 테스트 케이스마다 A+B를 출력한다.
		// 입력의 마지막에는 0 두 개가 들어온다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			String inputStr = br.readLine();
			String[] strArr = inputStr.split(" ");
			int A = Integer.parseInt(strArr[0]);
			int B = Integer.parseInt(strArr[1]);
			if (A == 0 && B == 0) {
				break;
			}
			int sum = A + B;
			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
	}

}
