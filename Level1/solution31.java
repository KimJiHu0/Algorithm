package Level1;

import java.util.Arrays;

public class solution32 {
	
	// ����� ����
	
	/*
	 * ����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, ���� ���� ���� ���� ���� ����� �˴ϴ�.
	 * 2���� ��� arr1�� arr2�� �Է¹޾�, ��� ������ ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
	 * 
	 * ��� arr1, arr2�� ��� ���� ���̴� 500�� ���� �ʽ��ϴ�.
	 * 
	 *      arr1             arr2             return
	 * [[1,2], [2,3]]   [[3,4], [5,6]]   [[4,6], [7,9]]
	 *   [[1], [2]]       [[3], [4]]       [[4], [6]]
	 */
	
	public static int[][] solution(int[][] arr1, int[][]arr2){
		// �迭�� x�� y�� �־��ֱ� ���ؼ� [arr1�Ǳ���][arr1��0������ ����] �� �ۼ�
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		// arr1�� ���̸�ŭ �ݺ���
		for(int i = 0; i < arr1.length; i++) {
			// arr1[i]������ ���̸�ŭ �ݺ���
			for(int j = 0; j < arr1[i].length; j++) {
				// answer[i][j]�� arr1[i][j] ���� arr2[i][j]���� ���� ���� ����
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(solution(new int[][] {{1,2},{2,3}}, new int[][] {{3,4},{5,6}})));
		System.out.println(Arrays.deepToString(solution(new int[][] {{1},{2}}, new int[][] {{3},{4}})));
	}

}
