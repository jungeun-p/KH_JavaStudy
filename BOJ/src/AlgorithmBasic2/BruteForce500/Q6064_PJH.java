package AlgorithmBasic2.BruteForce500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6064_PJH {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String[] tmp = br.readLine().split(" ");
			int M = Integer.parseInt(tmp[0]);
			int N = Integer.parseInt(tmp[1]);
			int x = Integer.parseInt(tmp[2]);
			int y = Integer.parseInt(tmp[3]);
			int count = x;
			int cal = x;
			while (count <= M*N) {
				if(cal%N != y%N) {
					count+=M;
					cal = (cal+M) % N;
				} else {
					System.out.println(count);
					break;
				}
			} // while
			if(count > M*N) System.out.println(-1);
		} // for i
	}
	
	/*
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String[] tmp = br.readLine().split(" ");
			int M = Integer.parseInt(tmp[0]);
			int N = Integer.parseInt(tmp[1]);
			int x = Integer.parseInt(tmp[2]);
			int y = Integer.parseInt(tmp[3]);
			int[] cal = { 1, 1 };
			int count = 0;
			while (true) {
				if (cal[0] != x || cal[1] != y) {
					if (cal[0] != M) {
						cal[0]++;
					} else {
						cal[0] = 1;
					}
					if (cal[1] != N) {
						cal[1]++;
					} else {
						cal[1] = 1;
					}
					count++;
				} else if (cal[0] == x && cal[1] == y) {
					count++;
					System.out.println(count);
					break;
				}
				if (cal[0] == M && cal[1] == N) {
					System.out.println(-1);
					break;
				}
			} // while
		} // for i
	}
	 */
}
