package level03;

import java.util.Scanner;

public class p8393 {

	public static void main(String[] args) {
		// 1부터 n까지 합을 출력한다.
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int result = 0;
		for (int i=1; i<=num; i++) {
			result += i;
		}
		System.out.println(result);
		in.close();
	}

}
