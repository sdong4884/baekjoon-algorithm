package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p12891 {

	static int[] checkArr;
	static int[] curArr;
	static int checkSecret;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int result = 0;
		char[] DNA;
		checkArr = new int[4];
		curArr = new int[4];
		checkSecret = 0;
		
		DNA = br.readLine().toCharArray(); // ['C', 'C', 'T', 'G', 'G', 'A', 'T', 'T', 'G']
		st =  new StringTokenizer(br.readLine());
		for (int i=0; i<4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) checkSecret++;
		}
		for (int i=0; i<P; i++) {
			add(DNA[i]);
		}
		if (checkSecret == 4) result++;
		for (int i=P; i<S; i++) {
			int j = i - P;
			add(DNA[i]);
			remove(DNA[j]);
			if (checkSecret == 4) result++;
		}
		
		System.out.println(result);
		br.close();
	}

	private static void remove(char c) {
		switch (c) {
		case 'A':
			if (curArr[0] == checkArr[0]) checkSecret--;
			curArr[0]--;
			break;
		case 'C':
			if (curArr[1] == checkArr[1]) checkSecret--;
			curArr[1]--;
			break;
		case 'G':
			if (curArr[2] == checkArr[2]) checkSecret--;
			curArr[2]--;
			break;
		case 'T':
			if (curArr[3] == checkArr[3]) checkSecret--;
			curArr[3]--;
			break;
		default:
			break;
		}
	}

	private static void add(char c) {
		switch (c) {
		case 'A':
			curArr[0]++;
			if (curArr[0] == checkArr[0]) checkSecret++;
			break;
		case 'C':
			curArr[1]++;
			if (curArr[1] == checkArr[1]) checkSecret++;
			break;
		case 'G':
			curArr[2]++;
			if (curArr[2] == checkArr[2]) checkSecret++;
			break;
		case 'T':
			curArr[3]++;
			if (curArr[3] == checkArr[3]) checkSecret++;
			break;
		default:
			break;
		}
	}

}
