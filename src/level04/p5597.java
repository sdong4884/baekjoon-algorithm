package level04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p5597 {

	public static void main(String[] args) throws IOException {
		// X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
		// 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
		FileInputStream fis = new FileInputStream("input.txt");
        System.setIn(fis);
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 28;
		String[] successArr = new String[n];
		for(int i=0; i<n; i++) {
			successArr[i] = br.readLine();
		}
		for(int i=1; i<=30; i++) {
			if (!Arrays.asList(successArr).contains(Integer.toString(i))) {
				System.out.println(Integer.toString(i));
			}
		}
	}

}
