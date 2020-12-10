package Level2;

import java.util.Arrays;

public class solution04 {
	
	// N���� �ּҰ����
	
	public static int solution(int[] arr) {
		int answer = 0;
		int i = 1;
		int cnt = 0;
		Arrays.sort(arr);
		
		
		// ���ѹݺ� �����ش�.
		while(true) {
			
			// num�̶�� ������ arr�� ������ ���� x 1�� �� ���� �־��ش�.
			// i�� �⺻�� 1�̴ϱ�.
			int num = arr[arr.length-1] * i;
			
			// �迭�� ����ִ� �� �߿��� ���� ������ ���� ���� ������ ���� for�� �����ش�.
			for(int j = 0; j < arr.length-1; j++) {
				// ���࿡ num�� �� ������ arr�� j������ �������� 0�̶��
				if(num % arr[j] == 0) {
					// cnt�� ++���ش�.
					cnt++;
				}
			}
			
			// for���� ���ͼ� ���࿡ cnt�� arr�� ����-1�̶��
			// ��, 2,6,8,14 ��� => ���̴� 4��, -1�� ���̴� 3.
			
			// ���� 1
			// 14 / 2 ������ 0 �̶� cnt++
			// 14 / 6 �������� 0�� �ƴ϶� �н�
			// 14 / 8 �������� 0�� �ƴ϶� �н�
			
			// ���� 2
			// 168 / 2 => ������ 0�̶� cnt++ -> 1
			// 168 / 6 => ������ 0�̶� cnt++ -> 2
			// 168 / 8 => ������ 0�̶� cnt++ -> 3
			
			// cnt�� arr�� ����-1�� �����ϱ� ������
			if(cnt == arr.length-1) {
				// answer�� num�� ����ְ�, while���� break;
				answer = num;
				break;
			// ���� 1ó�� cnt�� 1�̶� arr�� ����-1���̶� �ٸ���
			} else {
				// cnt�� �ʱ�ȭ�����ְ�
				cnt = 0;
				// i�� ++���ش�.
				// �׷� 14 * 1 �� num�̾����� �������� 14*2�� num�̵ǰ� ....������ �������������� �ݺ�
				i++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {2,6,8,14}));
		System.out.println(solution(new int[] {1,2,3}));
	}

}
