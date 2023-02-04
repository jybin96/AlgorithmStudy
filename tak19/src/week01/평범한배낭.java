package week01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����ѹ賶 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //�� ����
		int limit = Integer.parseInt(st.nextToken()); //��������

		int[][] list = new int[n+1][2];

		for(int i = 1 ; i <= n ; i++) {
			st = new StringTokenizer(br.readLine());
			list[i][0] = Integer.parseInt(st.nextToken()); //����
			list[i][1] = Integer.parseInt(st.nextToken()); //��ġ
		}

		int[][] dp = new int[n+1][limit+1];
		for(int i = 1 ; i <= n ; i++) { //�� ���� ��ŭ �ݺ�
			int w = list[i][0]; //���� �� ����
			int v = list[i][1]; //���� ���� ��ġ
			for(int j = 1 ; j <= limit ; j++) { //��� �� �ִ� ���� 
				if( j >= w ) {
					//�ִ밪 ã�� ����... �ڱ� ����x�� ���� ���ҿ��� or �ڱ� �����ϰ� ���� ���Կ� �ش��ϴ� ��ġ ������ 
					dp[i][j] = Math.max(dp[i-1][j], list[i][1] + dp[i-1][ j - list[i][0] ] );
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}

		}
		System.out.println(dp[n][limit]);
	}

}
