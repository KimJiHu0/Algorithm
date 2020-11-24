package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class solution08 {
	
	/*
	 * [��������]
	 * array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭��
	 * ��ȯ�ϴ� �Լ�, solution�� �ۼ��Ͻÿ�
	 * divisor�� ������ �������� element�� �ϳ��� ���ٸ� -1�� ��� ��ȯ�ϼ���.
	 * 
	 * [��������]
	 * arr�� �ھ���� ���� �迭�Դϴ�.
	 * ���� i, j�� ���� i != j�� arr[i]�Դϴ�.
	 * divisor�� �ڿ����Դϴ�.
	 * array�� ���� 1�̻��� �迭�Դϴ�.
	 * 
	 * [����� ��]
	 * arr : [5,9,7,10]
	 * divisor : 5
	 * return : [5, 10]
	 * 
	 * [3,2,6] / 10 / [-1]
	 */
	
	public static int[] solution(int[] arr, int divsior) {
		int[] answer = {};
		
		// list�� �ϳ� �������ش�.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// int�迭 arr�� ���̸�ŭ for���� �����ش�.
		for(int i = 0; i < arr.length; i++) {
			// ���࿡ arr�� i������ �ִ°� divsior�� ���̶� ������ �������� 0�̶��
			if(arr[i] % divsior == 0) {
				// list�� arr�� i������ add���ش�.
				list.add(arr[i]);
			}
		}
		
		// �׷��� �� ���� �Ŀ� list�� ����ִٸ�
		if(list.isEmpty()) {
			// list�� -1�� �־��ش�.
			list.add(-1);
		}
		
		// int�迭�� answer�� ũ�⸦ �������ش�.
		answer = new int[list.size()];
		
		// list�� ũ�⸸ŭ for���� �����ָ�
		for(int i = 0; i < list.size(); i++) {
			// answer�� i������ list�� i������ ���� �־��ش�.
			answer[i] = list.get(i);
		}
		// answer�� �����Ѵ�.
		Arrays.sort(answer);
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {5,9,7,10}, 5)));
		System.out.println(Arrays.toString(solution(new int[] {2,36,1,3}, 1)));
		System.out.println(Arrays.toString(solution(new int[] {3,2,6}, 10)));
	}

}
