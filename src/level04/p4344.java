package level04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		// 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(N은 정수)이 주어지고, 이어서 N명의 점수(0≤점수≤100)가 주어진다.
		// 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
		FileInputStream fis = new FileInputStream("input.txt");
        System.setIn(fis);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++) {
            // 평균 구하기
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int studentCount = Integer.parseInt(st.nextToken());
        	int[] scoreArr = new int[studentCount];
    		int sum = 0;
        	double average;
        	for(int j=0; j<studentCount; j++) {
        		int cur = Integer.parseInt(st.nextToken()); 
        		scoreArr[j] = cur;
        		sum += cur;
        	}
        	average = (double) sum / studentCount;
        	// 평균 넘는 학생 수 구하기
        	int aboveAverageCount = 0;
        	for(int k=0; k<studentCount; k++) {
        		if (scoreArr[k] > average) aboveAverageCount++;
        	}
        	// 비율 구하기
        	double result = (double) aboveAverageCount / studentCount * 100;
        	System.out.println(String.format("%.3f", result) + "%");
        }
	}

}
