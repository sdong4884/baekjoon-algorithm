package level08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1712 {

	public static void main(String[] args) throws IOException {
		// 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용
		// 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용
		// 노트북 가격 C만원
		// A, B, C가 주어졌을 때, 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다. 손익분기점이 존재하지 않으면 -1을 출력한다.
		FileInputStream fis = new FileInputStream("input.txt");
        System.setIn(fis);
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int fixedCost = Integer.parseInt(st.nextToken());
		int variableCost = Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(st.nextToken());
		
		// 노트북 가격이 가변 비용보다 작거나 같으면 절대 이익이 발생할 수 없음 
		if (variableCost >= price) {
			System.out.println("-1");
		} else {
			System.out.println(fixedCost / (price - variableCost) + 1);
			
			// 뭐야 ... 너무 간단하잖아 ... 아래는 내가 풀려고 했던거. 위엔 인터넷에서 가져온 풀이
			// 근데 내가 풀려고 했던 방식도 테스트 케이스 3번이 통과 안됨. 휴ㅠ
			
			// 판매수익(C * 판매대수)이 생산비용(A + (B * 판매대수))보다 클 때, 이익 발생
//			int count = 1;
//			int salesCost = price * count;
//			int productionCost = fixedCost + (variableCost * count);
//			while(true) {
//				if (salesCost > productionCost) {
//					break;
//				}
//				count++;
//				salesCost = price * count;
//				productionCost = fixedCost + (variableCost * count);
//			}
//			System.out.println(count);
		}
	}

}
