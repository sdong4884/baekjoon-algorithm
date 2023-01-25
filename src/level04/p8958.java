package level04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class p8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
		// "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		// OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
		FileInputStream fis = new FileInputStream("input.txt");
        System.setIn(fis);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
        	String cur = br.readLine();
        	char[] arr = cur.toCharArray();
        	
        	int count = 0;
        	int sum = 0;
        	for(int j=0; j<arr.length; j++) {
        		if (arr[j] == 'O') {
        			count++;
        		} else {
        			count = 0;
        		}
        		sum += count;
        	}
        	System.out.println(sum);
        }
	}

}
