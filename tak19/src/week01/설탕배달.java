package week01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ������� {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while(true) {
			//5kg ���ٸ��� �� �� �� ���� �̰� �ּ���!
			if( n % 5 == 0) {
				cnt += (n / 5);
				System.out.println(cnt);
				return;
			}
			else {
				//5�� �� �������� 3Ű�� �ϳ� ����� ����
				n -= 3;
				cnt++; 
			}
			if( n < 0 ) {
				System.out.println(-1);
				return;
			}
		}
		
		
		
		
	}
}
