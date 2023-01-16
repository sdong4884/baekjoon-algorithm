package level02;

import java.util.Scanner;

public class p2884 {

	public static void main(String[] args) {
		// "45분 일찍 알람 설정하기"
		// 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.

		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		
		int gap = M - 45;
		if (gap >= 0) {
			System.out.print(H + " " + gap);
		} else {
			System.out.print(((H + 23) % 24) + " " + (60 + gap));
		}
		
		in.close();
	}

}
