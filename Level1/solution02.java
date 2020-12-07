package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class solution02 {

	/*
	 * ���� ���� �� �����ϱ�
	 * 
	 * [��������]
	 * ������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. ��,
	 * �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ����
	 * �ϰ�, [10]�� [-1]�� ���� �մϴ�.
	 * 
	 * [��������]
	 * arr�� ���� 1 �̻��� �迭�Դϴ�. �ε��� i,j�� ���� i != j�̸� arr[i] != arr[j]�Դϴ�.
	 * 
	 * [����� ��]
	 * arr : [4,3,2,1] return [4,3,2] arr : [10] return : [-1]
	 */

	public static int[] solution(int[] arr) {
		int[] answer = {};

		// list�� ����.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// arr�� length��ŭ �ݺ��� ���鼭, 
		for(int i = 0; i < arr.length; i++) {
			// list�� arr�� i������ ���� add���ش�.
			list.add(arr[i]);
		}
		
		// �ϴ� min�̶�� ������ arr�� 0������ ���� �����Ѵ�.
		int min = arr[0];
		
		// list�� size�� 1�̶��
		if(list.size() == 1) {
			// answer�� -1�� ���� ä�� return
			return answer = new int[] {-1};
		// �׷��� �ʴٸ�
		} else {
			// list�� size��ŭ �ݺ����� �����ָ鼭
			for(int i = 0; i < list.size(); i++) {
				// Math�Լ��μ�, ������ ����, ������ ���� �����ִ� ���̰�, ���Ͽ� ���� ���� min�̶�� ������ �ٽ� ��´�.
				min = Math.min(list.get(i), min);
			}
			
			// list�� size��ŭ �ݺ����� �����ָ鼭
			for(int i = 0; i < list.size(); i++) {
				// list�� i������ min(�ּҰ�)�� ���ٸ�
				if(list.get(i) == min) {
					// list�� i������ remove�Ѵ�.
					list.remove(i);
				}
			}
			// answer�� ũ�⸦ �����Ѵ�. (list�� size��ŭ)
			answer = new int[list.size()];
			// list�� size��ŭ �ݺ����� ������
			for(int i = 0; i < list.size(); i++) {
				// answer�� i������ list�� i������ �����Ѵ�.
				answer[i] = list.get(i);
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(new int[] { 4, 3, 2, 1 })));
		System.out.println(Arrays.toString(solution(new int[] { 3, 4, 1, 2 })));
		System.out.println(Arrays.toString(solution(new int[] { 4, 3, 2, 1, 1 })));
		System.out.println(Arrays.toString(solution(new int[] { 9, 8, 7, 6, 5 })));
		System.out.println(Arrays.toString(solution(new int[] { 10 })));

	}

}
