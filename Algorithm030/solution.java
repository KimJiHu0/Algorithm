package Algorithm030;

public class solution {
	
	// ���ϱ� & ���̳ʽ� 
	
	public static void main(String[] args) {
		
		// �Է¹��� ��
		int inputNum = 9;
		
		// 1~9���� �ݺ����� �����ִµ�
		for(int i = 1; i <= inputNum; i++) {
			// i�� 9 ���ϸ�
			if(i < inputNum) {
				// �� �κ� ����
				
				// i�� 2�� ������ �� �������� 0�� �ƴ϶�� / Ȧ�����
				if(i % 2 != 0) {
					// i �ڿ� +�� �ٿ��ְ�, 
					System.out.print(i + " + ");
				// i�� 2�� ������ �� �������� 0�̶�� / ¦�����
				} else {
					// i �ڿ� -�� �ٿ��ش�.
					System.out.print(i + " - ");
				}
			// i�� 9���
			} else {
				// �׳� i�� ������ش�.
				System.out.print(i);
			}
		}
	}

}
