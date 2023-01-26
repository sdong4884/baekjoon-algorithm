package level09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p2738 {

	public static void main(String[] args) throws IOException {
		// N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
		FileInputStream fis = new FileInputStream("input.txt");
        System.setIn(fis);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer firstLine = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(firstLine.nextToken());
        int M = Integer.parseInt(firstLine.nextToken());
        int[][] AMatrixArr = new int[N][M];
        int[][] BMatrixArr = new int[N][M];
        for (int i=0; i<N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for (int j=0; j<M; j++) {
        		AMatrixArr[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        for (int i=0; i<N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for (int j=0; j<M; j++) {
        		BMatrixArr[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        for (int i=0; i<N; i++) {
        	for (int j=0; j<M; j++) {
        		bw.write(AMatrixArr[i][j] + BMatrixArr[i][j] + " ");
        	}
        	bw.newLine();
        }
        bw.flush();
        bw.close();
	}

}
