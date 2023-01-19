package level04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		FileInputStream fis = new FileInputStream("input.txt");
        System.setIn(fis);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 10;
        int num = 42;
        int[] arr = new int[count];
        for(int i=0; i<count; i++) {
        	arr[i] = Integer.parseInt(br.readLine()) % num;
        }
        System.out.println(Arrays.stream(arr).distinct().toArray().length);
	}

}
