package Algorithm013;

public class solution {

	// �Էµ� �� N��ŭ N�� ���� ����ϱ�4
	
	// 1 2 3 4
	// 2 4 6 8
	// 3 6 9 12
	// 4 8 12 16
	
	public static void main(String[] args) {
		
		// �Է¹��� ��
		int n = 5;
		// �Է� ���� ����ŭ ���߹迭 ����
		int[][] arr = new int[n][n];
		
		// �迭�� �־��� �� ����
		int num = 1;
		// plus���� �� ����
		int plus = 1;
		
		// arr�� i, j ��ŭ �ݺ��� �����ָ鼭
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				// ���η� ���� ���ؼ� arr�� [j][i]������ num�� �������ְ�,
				arr[j][i] = num;
				// num = num + plus
				// num = 1 + 1;
				// ��, ó������ +1�� �ؼ� ���η� ����
				num += plus;
			}
			// �ι�° ���δ� +2 �� ���ֱ� ���ؼ� plus�� ++.
			// ����° ���δ� +3 ��, 
			// �׹�° ���ο��� +4��
			plus++;
			// num�� �ι�° ���ο� 2���� �����ϱ� ������ i�� ���� 0�̰� 0 + 2, ������ 1 + 2 �ؼ� ������ ��������
			// 3����, �׹�° �������� 4���� �����ϱ� ���ؼ� ����
			num = i + 2;
		}
		
		// ����ϱ�
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
