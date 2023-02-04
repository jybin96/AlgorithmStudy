package week01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 동물원 {
	public static void main(String[] args) throws Exception{

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());

		// 왼쪽, 오른쪽, 없음 3개 
		int[][] dp = new int[N][3];
		
		// 첫칸은 전부 경우의 수 1개
		for(int i = 0 ; i < 3 ; i++) {
			dp[0][i] = 1;
		}
		
		for(int i = 1 ; i < N ; i++) {
			// 오른쪽의 경우 이전에 왼쪽, 없음의 경우 배치 가능
			dp[i][0] = (dp[i-1][1] + dp[i-1][2]) % 9901;

			// 왼쪽의 경우 이전에 오른쪽, 없음의 경우 배치 가능
			dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % 9901;

			// 없음의 경우 모든 경우 배치 가능
			dp[i][2] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2]) % 9901; 
		}

		// 마지막 행 더하기
		int sum = 0;
		for(int i = 0 ; i < 3 ; i++) {
			sum += dp[N-1][i] ;
		}

		System.out.println(sum % 9901);
	}
}
