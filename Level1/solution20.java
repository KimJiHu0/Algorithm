package Level1;

import java.util.Arrays;

public class solution20 {

	/*
	 * �ڸ��� ���ϱ�
	 * 
	 * [��������]
	 * �ڿ��� N�� �־����� N�� �� �ڸ����� ���� ���ؼ� return�ϴ� �Լ� solution�� �ϼ��ϼ���.
	 * 
	 * [����� ��]
	 * N : 123 / return : 6
	 */
	
	public static int solution(int n) {
		int answer = 0;
		
		// �޾ƿ� ���� n�� String.valueOf�� StringŸ������ ����ȯ�� ���ش�.
		String str = String.valueOf(n);
		// str�� ���̸�ŭ for���� �����ش�.
		for(int i = 0; i < str.length(); i++) {
			// answer�� str�� i������ �ִ� ���� int���·� ����ȯ ���ִµ�, charAt�� char�����̱� ������ +"" �� �ٿ� String Ÿ������ �ٲ��ش�.
			answer += Integer.parseInt(str.charAt(i)+"");
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(123));
		System.out.println(solution(987));
	}
	
}
