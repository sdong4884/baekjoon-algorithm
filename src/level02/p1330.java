package level02;

import java.util.Scanner;

public class p1330 {

	public static void main(String[] args) {
		// A가 B보다 큰 경우에는 '>'를 출력한다.
		// A가 B보다 작은 경우에는 '<'를 출력한다.
		// A와 B가 같은 경우에는 '=='를 출력한다.
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		in.close();
	}

}
