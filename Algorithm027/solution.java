package Algorithm027;

public class solution {
	
	// �����̸�� ���� ����ϱ�
	
	public static void main(String[] args) {
		
		int n = 5;
		int arr[][] = new int[10][10];
		
		// arr�� index�� �ǹ��ϱ� ���� x,y
		int x = 0;
		int y = 0;
		// �־��� ���� num
		int num = 1;
		
		int f = n;
				
		for (int i = 0; i < 2*n-1; i++) {
			switch (i % 4) {
			case 0: // right way
				for (int k = 0; k < f ;k++) {
					arr[y][x] = num;
					x++;
					num++;
				}
				x--;
				y++;

				f--;
				break;
			case 1: // under way
				for (int k = 0; k < f ;k++) {
					arr[y][x] = num;
					y++;
					num++;
				}
				y--;
				x--;
				break;
			case 2:  // left way
				for (int k = 0; k < f ;k++) {
					arr[y][x] = num;
					x--;
					num++;
				}
				x++;
				y--;
				
				f--;
				break;
			case 3:  // up way
				for (int k = 0; k < f ;k++) {
					arr[y][x] = num;
					y--;
					num++;
				}
				y++;
				x++;
				break;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n ; j++){
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
