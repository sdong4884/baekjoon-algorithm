package doIt_practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1253 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.
		// 좋은 수의 개수를 첫 번째 줄에 출력한다.
        System.setIn(new FileInputStream("input.txt"));
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count = 0;
        for (int k=0; k<N; k++) {
        	int cur = arr[k];
            int i = 0;
            int j = N - 1;
        	while (i < j) {
        		if (arr[i] + arr[j] == cur) {
	    			if (i != k && j != k) {
	    				count++;
	    				break;
	    			} else if (i == k) {
	    				i++;
	    			} else if (j == k) {
	    				j--;
	    			}
        		} else if (arr[i] + arr[j] < cur) {
        			i++;
        		} else if (arr[i] + arr[j] > cur) {
        			j--;
        		}
        	}
        }
        System.out.println(count);
	}

}
