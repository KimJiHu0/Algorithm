package Level2;

import java.util.Arrays;

public class solution08 {
	
	// �ּڰ� �����
	
	public static int solution(int[] A, int[] B) {
		int answer = 0;
		
		// �޾ƿ� A�� B�� ���� sort�� �������ش�.
		
		Arrays.sort(A); // [1,2,4]
		Arrays.sort(B); // [4,4,5]
		
		// idx��� ������ B�� index�� �����ֱ� ���� �����̴�.
		int idx = B.length-1;
		
		// A�� ���̸�ŭ �ݺ����� �����µ�,
		for(int i = 0; i < A.length; i++) {
			// answer���ٰ� A�� i���� * B�� idx���� ���� �����ش�.
			answer += A[i] * B[idx];
			// �� �� idx�� --�� ���ش�.
			idx--;
		}
		
		// ���� �ּ��� ���� ���ϱ� ���ؼ��� A�迭���� ���� ���� ���� B�迭���� ���� ū ���� �����־� answer�� �����ָ� �ȴ�.
		// sort�� ���������̱� ������ A�迭������ ���������� ++�ؼ� index�� �����ϴ� ���� ã�ƿ��� �ǰ�,
		// B�迭������ ���������� --�ؼ� index�� �����ϴ� ���� ã�ƿ��� �ȴ�.
		return answer;
	}
	
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {1,4,2}, new int[] {5,4,4}));
		System.out.println(solution(new int[] {1,2}, new int[] {3,4}));
		
	}

}
