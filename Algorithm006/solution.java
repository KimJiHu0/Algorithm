package Algorithm006;

import java.util.Arrays;

public class solution {
	
	// �ִ����� ���ϱ� => ���� ���� Ǭ �ڵ�
	// ����Ž��
	
	public static void main(String[] args) {
		
		// nArr�� 2���� ���� �����մϴ�. ������ ��� �����ϴ�.
		int[] nArr = new int[] {18,9};

		// nArr�� ������������ �����մϴ�.
		Arrays.sort(nArr);
		
		// answer�� ���� �ǹ��ϴ� �����Դϴ�.
		int answer = 0;
		// num�� nArr�� ������ ������ ���Դϴ�.
		int num = 1;
		// count�� nArr�� num���� ������ �� �� �� ������ ���� �����ϱ� ���� �����߽��ϴ�.
		int count = 0;
		
		// ���� �ݺ��� ���ϴ�.
		while(true) {
			// nArr�� ���鸸ŭ �ݺ����� ���鼭
			for(int i = 0; i < nArr.length; i++) {
				// nArr�� i���� / num�� 0�� ��쿡��
				if(nArr[i] % num == 0) {
					// count�� ++���ݴϴ�.
					count++;
				}
			}
			
			// �ݺ����� ������ ���� if���� ���ϰ� �˴ϴ�.
			// count�� 2�̶�� [nArr�� �� �� ��� num���� ������ �� ������ �������ٸ�]
			if(count == 2) {
				// ���� ������� answer��� ������ num�� �����մϴ�.
				answer = num;
				// �׸��� num�� ++���� ��,
				num++;
				// count�� 0���� �ʱ�ȭ ��ŵ�ϴ�.
				count = 0;
			}
			
			// count�� 1 �Ǵ� 0�̶�� [nArr�� �� �� �ϳ��� ������ �������ų�, �� �� �������� ���� ���]
			else if(count == 1 || count == 0) {
				// num�� ++���ְ�
				num++;
				// count�� 0���� �ʱ�ȭ �ϴ� ������ �����ϴ�.
				count = 0;
			}
			
			// ���� if~else if���� ������ �� if������ ���ϰ� �Ǵµ�, num�� ��� ++���ִٰ�
			// nArr���� ���� ū ���� nArr�� 1������ ���� num�� ���� �����ϴٸ�
			if(num == nArr[1]) {
				// while���� �����ݴϴ�.
				break;
			}
		}
		System.out.println(answer);
	}

}
