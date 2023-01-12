package level01;

import java.util.Scanner;

public class p1008 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// java에서 int는 정수. 정수끼리 나누면 정수가 되기 때문에 1/3을 할 경우 0.333333이 아닌 0이 나온다.
		// 따라서 나눗셈을 해서 소수점까지의 결과를 원할 경우, 실수를 나타내는 double을 사용해서 입력을 받는 방법이 있다!
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		System.out.println(a / b);
		input.close();
	}

}
