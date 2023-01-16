package level02;

import java.util.Scanner;

public class p14681 {

	public static void main(String[] args) {
		// 첫 줄에는 정수 x (−1000 ≤ x ≤ 1000; x ≠ 0), 다음 줄에는 정수 y(−1000 ≤ y ≤ 1000; y ≠ 0)가 주어진다.
		// 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
		// 1(+, +), 2(-, +), 3(-, -), 4(+, -)
		
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int result;
		if (x > 0) {
			result = y > 0 ? 1 : 4;
		} else {
			result = y > 0 ? 2 : 3;
		}
		System.out.println(result);
		in.close();
	}

}
