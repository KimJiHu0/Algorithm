package Algorithm036;

import java.util.Scanner;

public class solution_result {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		decToBin(input);
	}
	
	// 17
	// 8 ... 1
	// 4 ... 0
	// 2 ... 0
	// 1 ... 0
	// 0 ... 1
	
	// 10001
	
	// [ Ż������ ]��� 2�� �����ٰ� ���� 0�̵Ǹ� Ż���ϸ� �ȴ�.
	
	public static void decToBin(int N) {
		
		// ó�� ���� �� 17
		// �ι�°�� 8
		// ��������4
		// �׹�����2
		// ������ 1
		
		// Ż������
		if(N == 1) {
			// ���������� N�� ���������Ѵ�.
			// ���������� N�� ������༭
			System.out.print(N);
			// ����Լ� ����
			return;
		}
		// 17/2�� ����Լ��� ���� ȣ���ϰ�,
		// 8/2�� ����Լ��� ���� ȣ���ϰ�,
		// 4/2�� ����Լ��� ���� ȣ���ϰ�
		// 2/2�� ����Լ��� ���� ȣ���ϰ�
		decToBin(N/2);
		
		// 17%2�� ���� ȣ���Ѵ�. => 1
		// 8%2�� ���� ȣ���Ѵ�. => 0
		// 4%2�� ���� ȣ���Ѵ�. => 0
		// 2%2�� ���� ȣ���Ѵ�. => 0
		System.out.print(N%2);
		
		// �� 10001�ε� �Ųٷ� ���������� ����Ѵ�.
	}

}
