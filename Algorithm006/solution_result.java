package Algorithm006;

public class solution_result {
	
	public static void main(String[] args) {
		
		// �ִ����� ���ϱ� => ��
		
		// �� ���� ����
		int num1 = 12;
		int num2 = 18;
		
		// ū ���� ���� ���� �����ϱ� ���� ����
		int small = 0;
		int big = 0;
		
		// num1�� num2���� ũ�ٸ�
		if(num1 > num2) {
			// ū ���� big���� num1
			big = num1;
			// ���� ���� small���� num2
			small = num2;
		// ���� ���ǹ��� �ݴ���
		} else {
			// big���� num2
			big = num2;
			// small���� num1
			small = num1;
		}
		
		// �ִ�����
		int gcd = 1;
		
		// big�� small�� i�� ������ �� ������ �������ٸ� gcd�� �־��ֱ� ����.
		for(int i = 1; i <= small; i++) {
			// big�� small�� ��� i�� ������ �� ������ �������ٸ�
			if(big % i == 0 && small % i == 0) {
				gcd = i;
			}
		}
		
		System.out.println(gcd);
	}

}
