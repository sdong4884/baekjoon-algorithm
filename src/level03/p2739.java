package level03;

import java.util.Scanner;

public class p2739 {

	public static void main(String[] args) {
		// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i=1; i<=9; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
		in.close();
	}

}
