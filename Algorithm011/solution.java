package Algorithm011;

public class solution {
	
	// �Էµ� �� N��ŭ N�� ���� ����ϱ�2
	// �Է°� : 4
	// 1 2 3 4
	// 8 7 6 5
	// 9 10 11 12
	// 16 15 14 13
	
	public static void main(String[] args) {
		
		// �Է¹��� ��
		int num = 3;
		// ����� �� ����
		int count = 1;
		
		// int Ÿ���� ���߹迭�� ����
		int[][] arr = new int[num][num];
		
		// arr�� length��ŭ for���� �����ִµ�
		for(int i = 0; i < arr.length; i++) {
			// i�� 2�� ������ �� �������� 0�̶��[ù������, ���������� �״�� ����ϱ�]
			if(i % 2 == 0) {
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = count;
					count++;
				}
			// �װ� �ƴ϶�� ������ �� �Ųٷ� ����ϱ�
			} else {
				for(int j = arr[i].length-1; j >= 0; j--) {
					arr[i][j] = count;
					count++;
				}
			}
		}
		
		// ����ϱ�
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
