package Level1;

import java.util.Arrays;

public class solution33 {
	
	// �ִ������� �ּҰ���� ���ϱ�
	
	/*
	 * �� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������.
	 * �迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�.
	 * ���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.
	 */
	
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		
		int big = m;
		int small = n;
		
		// �ִ����� ���ϱ�
		// 1���� �μ� �� ��������ŭ �ݺ����� �����µ�
		for(int i = 1; i <= small; i++) {
			// ���� ū��/i�� �������� ������/i�� �������� 0�� �� 
			if(big % i == 0 && small % i == 0) {
				// answer[0]�� i�� �־��ش�.
				// 3�� 12�� ó���� 1�� �������� �� asnwer[0]�� ������ �� �Ŀ� i�� 3�� �� �ٽ� answer[0]�� ���� ������ 3�� ����.
				answer[0] = i;
			}
		}
		
		// �ּҰ���� ���ϱ�
		// �ּҰ������ ���ϴ� ������ (ū�� x ������) / �ִ����� �̴�.
		answer[1] = (big * small) / answer[0];
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3,12)));
		System.out.println(Arrays.toString(solution(2,5)));
		System.out.println(Arrays.toString(solution(3,8)));
	}

}
