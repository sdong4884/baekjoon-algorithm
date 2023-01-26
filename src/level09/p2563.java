package level09;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2563 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 
		// 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다. 
		// 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
		FileInputStream fis = new FileInputStream("input.txt");
        System.setIn(fis);

        // ha .. 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        int num = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[100][100];
        for (int i=0; i<num; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());;
        	for (int j=x; j < x+10; j++) {
        		for (int k=y; k < y+10; k++) {
        			if (!arr[j][k]) {
                        arr[j][k] = true;
                        total++;
                    }
        		}
        	}
        }
        System.out.println(total);
	}

}
