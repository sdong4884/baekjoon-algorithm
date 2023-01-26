package level06;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
		FileInputStream fis = new FileInputStream("input.txt");
        System.setIn(fis);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i=0; i<num; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int repeat = Integer.parseInt(st.nextToken());
        	String normalStr = st.nextToken();
        	String repeatStr = "";
        	int length = normalStr.length();
        	for (int j=0; j<length; j++) {
        		for (int k=0; k<repeat; k++) {
        			repeatStr += String.valueOf(normalStr.charAt(j));
        		}
        	}
        	System.out.println(repeatStr);
        }
	}

}
