package Level1;

import java.util.Arrays;

public class solution05 {
	/*
	 * k��° ��
	 * 
	 * �迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.

	       ���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��

       1. array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
       2. 1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
       3. 2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
                �迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
                
       57.1��
	 */
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
		/*
		 * answer = new int[commands.length];
		 * 
		 * for (int i = 0; i < commands.length; i++) { int[] real =
		 * Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
		 * Arrays.sort(real); answer[i] = real[commands[i][2] - 1];
		 * 
		 * }
		 * 
		 * return answer;
		 */
        int start = 0;
        int end = 0;
        int idx = 0;
        
        for(int i = 0; i < commands.length; i++) {
        	for(int j = 0; j < commands.length;) {
        		start = commands[i][j]-1;
        		j++;
        		end = commands[i][j];
        		j++;
        		idx = commands[i][j]-1;
        		j++;
        		int[] tmp = Arrays.copyOfRange(array, start, end);
        		Arrays.sort(tmp);
        		answer[i] = tmp[idx];
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		   System.out.println(Arrays.toString(solution(new int[] {1,5,2,6,3,7,4}, new int[][] {{2,5,3}, {4,4,1}, {1,7,3}})));
	}

}
