package Algorithm012;

public class solution_result {

	public static void main(String[] args) {
		
		int n = 4;
		int count = 1;
		int[][] arr = new int[n][n];
		
		// ���߹ݺ��� �����ָ�
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				// arr��[i][j]�� �ƴ�
				// ���η� ���� �Է�������ϱ� ������ arr�� [j][i]������ count�� �־��ش�.
				// arr[0][0] = 1
				// arr[1][0] = 2
				// arr[2][0] = 3
				// arr[3][0] = 4
				// �� �� ���� for���� ����� �ٱ��� for���� �����ָ�, i�� ++�Ǿ
				// arr[0][1] = 5
				// arr[1][1] = 6
				// ...
				// ������ �Ͽ� ���η� �鸲
				arr[j][i] = count;
				count++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
