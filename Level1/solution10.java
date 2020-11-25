package Level1;

import java.util.Arrays;

public class solution10 {
	/*
	 * [��������]
	 * ���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	 * s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.
	 * 
	 * [����� ��]
	 * s : Zbcdefg / return : gfedcbZ
	 */
	public static String solution(String s) {
		String answer = "";
		
		// �޾ƿ� String�� s�� ""�� �߶� String�迭�� ����ָ�
		// ["Z", "b", "c", "d", "e", "f", "g"] �� ����.
		String[] arr = s.split("");
		
		// �� �ָ� �������ش�. �׷� �������
		// ["g", "f", "e", "d", "c", "b", "Z"] �� ����.
		Arrays.sort(arr);

		// �̸� answer�̶�� StringŸ���� ������ �ϳ��� ����� �� return
		for(int i = arr.length-1; i >= 0; i--) {
			answer += arr[i];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}
}
