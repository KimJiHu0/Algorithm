package Algorithm031;

import java.util.Scanner;

public class solution_result {
	
	public static void main(String[] args) {
		
		// ���� �Է¹ޱ� ���� int������ �����Ѵ�.
		int input;
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		// ����� ���� answer ������ �����մϴ�.
		int answer = 0;
		
		// answer �� fact(input)�� ���� ����ݴϴ�.
		answer = fact(input);
		
		// �׸��� answer�� ����մϴ�.
		System.out.println(answer);
	}
	
	public static int fact(int n) {

		// ���� 3�� ������ �Ǹ� n : 3
		
		// 3�� 1�� �ƴ϶�
		if(n == 1) {
			return 1;
		}
		return n * fact(n-1);
		// 3 * fact(3-1)
		//		2 * fact(2-1)
		// n�� 1�� �Ǿ 1�� ��ȯ�Ѵ�. 1
		
		// 3 * 2
		//		2 * 1
		// ���������� �ö󰡸� 3 * 2 * 1 �� �Ǿ 6�� ��ȯ�Ѵ�.
	}

}
