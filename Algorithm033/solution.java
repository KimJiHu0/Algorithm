package Algorithm033;

import java.util.Arrays;

public class solution {
	
	public static void main(String[] args) {
		// �Է� ��
		int[][] arr = new int[][] {{0,0,0,0,0}, {0,0,1,1,0}, {0,0,0,0,1}, {0,0,0,0,0}, {0,0,1,0,0}};
		
		// ������ ���� ��
		int[][] answer = new int[5][5];
		
		// arr�� ���̸�ŭ ���� �ݺ��� ���鼭
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				// arr[i][j]�� 0�̸�
				if(arr[i][j] == 0) {
					// ������ ��� ������ 2�� ���
					answer[i][j] = 2;
				// 0�� �ƴϸ�
				} else {
					// 1�� ����ش�.
					answer[i][j] = 1;
				}
			}
		}
		
		System.out.println(Arrays.deepToString(answer));
	}

}
