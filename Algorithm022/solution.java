package Algorithm022;

public class solution {
	
	// �Ӹ����
	
	public static void main(String[] args) {
		
		// �Է¹��� ��
		int[] nArr = new int[] {1,2,3,3,3,2,1};
		
		// ++���� cnt���� ����
		int cnt = 0;
		
		// nArr�� ���� / 2 ��ŭ �ݺ����� �����ݴϴ�.
		for(int i = 0; i < nArr.length/2; i++) {
			// ���� nArr�� ������(�� ó����) nArr�� nArr.length-1 - i(�ǵ�)�� ���ٸ�
			if(nArr[i] == nArr[nArr.length-1 - i]) {
				// cnt�� ++���ݴϴ�.
				// �� ���� i�� 1�Դϴ�.
				// �׷� nArr[1]�� nArr[7-1-1]�� ��, nArr[1] == nArr[5], �� ������ nArr[2] == nArr[4] ... ���ΰ��ϴ�.
				cnt++;
			}
		}
		// ���� cnt�� nArr�� /2 ���� �����ϸ�
		if(cnt == nArr.length/2) {
			// true
			System.out.println(true);
		// �ƴ϶��
		} else {
			// false��
			System.out.println(false);
		}
		
	}

}
