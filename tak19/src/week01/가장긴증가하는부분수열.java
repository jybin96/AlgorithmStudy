package week01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����������ϴºκм��� {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] dp = new int[n+1];
        int[] arr = new int[n+1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        //������ �Է¹���
        for(int i = 1 ; i < n+1 ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //�� �ڸ� ���� �ڱ� �ڽŸ� ������ �����ϴ� ���� 1�� �ʱ�ȭ
        for(int i = 1 ; i < n+1 ; i++){
            dp[i] = 1;
        }
        int re = 1; //��� �����Ҳ���
        
        for(int i=2; i < n+1; i++){
            for(int j=1; j < i; j++){
                //������ �տ� ���ڰ� �۴ٸ�
                if( arr[i]  > arr[j] ){
                	dp[i] = Math.max(dp[j] + 1,dp[i]); //������ ��ȣ�� ���� ���� �ο�
                }
            }
            re = Math.max(re, dp[i]);
        }  
        System.out.println(re);

    }
}