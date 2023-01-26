package level06;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 첫째 줄에 숫자의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
		// 입력으로 주어진 숫자 N개의 합을 출력한다.
		FileInputStream fis = new FileInputStream("input.txt");
        System.setIn(fis);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;
        for (int i=0; i<num; i++) {
        	sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(sum);
	}

}
