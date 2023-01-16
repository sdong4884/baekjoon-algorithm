package level02;

import java.util.Scanner;

public class p2480 {

	public static void main(String[] args) {
		// 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
		// 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
        // 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
		// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
		
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int result;
		
		if (num1 == num2 && num2 == num3) {
			result = 10000 + num1 * 1000;
		} else if (num1 == num2 || num1 == num3) {
			result = 1000 + num1 * 100;
		} else if (num2 == num3) {
			result = 1000 + num2 * 100;
		} else {
			result = Math.max(num1, Math.max(num2, num3)) * 100;
		}
		System.out.println(result);
		
		in.close();
	}
	
}
