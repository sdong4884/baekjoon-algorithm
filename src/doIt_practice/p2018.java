package doIt_practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2018 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력된 자연수 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 출력하시오
        System.setIn(new FileInputStream("input.txt"));
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int start = 1;
        int end = 1;
        int sum = 1;
        // 1 2 3 4 5 6 7 8 9 10 ... 15
        // sum < N : end++; sum=sum+end;
        // sum > N : sum=sum-start; start++;
        // sum == N : end++; sum=sum+end; count++;
        while (end != N) {
        	if (sum == N) {
        		end++;
        		sum += end;
        		count++;
        	} else if (sum < N) {
        		end++;
        		sum += end;
        	} else {
        		sum -= start;
        		start++;
        	}
        }
        System.out.println(count);
	}

}
