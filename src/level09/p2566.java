package level09;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2566 {

	public static void main(String[] args) throws IOException {
		// 9×9 격자판에 100보다 작은 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
		FileInputStream fis = new FileInputStream("input.txt");
        System.setIn(fis);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        String position = "1 1";
        for (int i=1; i<=9; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for (int j=1; j<=9; j++) {
        		int cur = Integer.parseInt(st.nextToken());
        		if (max < cur) {
        			max = cur;
        			position = i + " " + j;
        		}
        	}
        }
        System.out.println(max);
        System.out.println(position);
	}

}
