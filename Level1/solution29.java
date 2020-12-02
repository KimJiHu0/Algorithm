package Level1;

import java.util.Arrays;

public class solution30 {

	// x��ŭ ������ �ִ� n���� ����

	/*
	 * [ �������� ]
	 * �Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. ����
	 * ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	 * 
	 * [ �������� ] 
	 * x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
	 * n�� 1000 ������ �ڿ����Դϴ�.
	 * 
	 * [ ����� �� ]
	 * x  n  answer
	 * 2  5  [2,4,6,8,10]
	 * 4  3  [4,8,12]
	 * -4 2  [-4, -8]
	 */
	
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		
		int cnt = 2;
		
		for(int i = 0; i < n; i++) {
			answer[0] = x;
			if(i > 0) {
				answer[i] = answer[0] * cnt;
				cnt++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(2, 5)));
		System.out.println(Arrays.toString(solution(4, 3)));
		System.out.println(Arrays.toString(solution(-4, 2)));
	}

}
