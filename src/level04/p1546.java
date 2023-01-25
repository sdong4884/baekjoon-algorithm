package level04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 세준이는 점수를 조작하기 위해 자기 점수 중에 최댓값(M)을 골랐다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		// 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
		FileInputStream fis = new FileInputStream("input.txt");
        System.setIn(fis);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int max = 0;
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 최대 점수 구하기
		for(int i=0; i<num; i++) {
			int cur = Integer.parseInt(st.nextToken());
			if (max < cur) max = cur;
			arr[i] = cur;
		}
		// 새로운 점수 구하기
		double sum = 0;
		for(int i=0; i<num; i++) {
			sum += (double) arr[i] / max * 100;
		}
		double newScore = (double) sum/num;
		System.out.println(newScore);
	}

}
