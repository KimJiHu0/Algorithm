package Algorithm018;

public class solution {
	
	// �����3
	
	public static void main(String[] args) {
		
		// �Է¹��� ��
		int n = 5;
		
		// ���� �ݺ����� �����ִµ�,
		for(int i = 0; i < n; i++) {
			// 4, 3, 2, 1, 0 ���� j-- ���ش�.
			for(int j = n-1; j >= 0; j--) {
				// i�� j���� ���� ������
				// i�� 0 �̴ϱ� j�� 4,3,2,1 �϶� ������ ��� 0�ϋ����� �� �ϳ� ��´�.
				// i�� 1 �̴ϱ� j�� 4,3,2 �ϋ� ������ ��� 0,1�϶����� �� �ΰ� ��´�.
				// i�� 2 �̴ϱ� j�� 4,3 �϶� ������ ��� 0,1,2�϶����� �� ���� ��´�.
				// ...
				if(i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
