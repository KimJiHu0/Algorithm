package Algorithm035;

public class solution {
	
	// ���� ���� ���ver
	
	public static void main(String[] args) {
		
		int num = 123;
		
		num(num);
		
	}
	
	public static void num(int num) {
		// num = 123
		System.out.println("���� �� : " + num);
		
		// 123 / 10 == 12 �̶� if���� �ȵ�����
		// 12 / 10 == 1 �̶� if���� �ȵ�����
		// 1 / 10 == 0�̱� ������ if���� ������
		if(num / 10 == 0) {
			System.out.println("num / 10 = 0 " );
			// 3
			System.out.println(num);
			return ;
		}
		System.out.println("num : " + num);
		// 123 / 10 �� ���� �ٽ� �ְ�,
		// 12 / 10 �� ���� �ٽ� �ְ�,
		num(num/10); // => 12�� �ְ�, 1�� �ְ�,
		// 123 % 10  �� ���� 3�� ���.
		// 12 % 10�� ���� 2�� ���
		// 1 % 10�� ���� 1 �� ���
		
		System.out.println("??"+num%10);
		// 12 % 10 �� ���� 2
		// 
	}

}
