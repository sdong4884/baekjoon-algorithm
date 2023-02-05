package doIt_practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p11724 {

	static ArrayList<Integer>[] A;
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        
        /* 슈도코드 작성하기 
         * static ArrayList<Integer>[] A
         * static boolean visited[]
         * 
         * n(노드 개수) 
         * m(엣지 개수)
         * A(그래프 데이터 저장 인접 리스트) = new ArrayList[n + 1]
         * visited(방문 배열) = new boolean[n + 1]
         * for (n의 개수만큼 반복) {
         * 		// A 인접 리스트의 각 ArrayList 초기화하기
         * }
         * for (m의 개수만큼 반복) {
         * 		// A 인접 리스트에 그래프 데이터 저장하기 
         * }
         * for (n의 개수만큼 반복) {
         * 		if (방문하지 않은 노드가 있다면) {
         * 			연결 요소 개수++
         * 			DFS 실행하기 
         * 		}
         * }
         * DFS {
         * 		if (현재 노드 == 방문 노드) return;
         * 		visited 배열에 현재 노드 방문 기록;
         * 		현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행하기 (재귀함수 형태);
         * }
         */
        
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int n = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());
       A = new ArrayList[n + 1];
       visited = new boolean[n + 1];
       for (int i=0; i<=n; i++) {
    	   A[i] = new ArrayList<Integer>();
       }
       for (int i=0; i<m; i++) {
    	   st = new StringTokenizer(br.readLine());
    	   int s = Integer.parseInt(st.nextToken());
    	   int e = Integer.parseInt(st.nextToken());
    	   A[s].add(e);
    	   A[e].add(s);
       }
       int count = 0;
       for (int i=1; i<=n; i++) {
    	   if (!visited[i]) {
    		   count++;
    		   DFS(i);
    	   }
       }
       System.out.println(count);
	}

	private static void DFS(int v) {
		if (visited[v]) {
			return;
		}
		visited[v] = true;
		for (int i : A[v]) {
			if (!visited[i]) {
				DFS(i);
			}
		}
	}

}
