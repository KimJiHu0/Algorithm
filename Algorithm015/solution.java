package Algorithm015;

public class solution {
	
	// �Էµ� ������ ������ ����϶�
	
	public static void main(String[] args) {
		
		// �Է¹��� ��
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,2,3,2};

		// arr�� index�� �����ϴ� ���� ��� ���Դ��� Ȯ���ϱ� ���� ����
		int cnt = 0;
		// arr�� index�� �����ϴ� ���� check�� ���Ͽ� cnt�� ++���ֱ� ���� ����
		int check = 0;
		
		// while ���ѹݺ�
		while(true) {
			// arr�� length���� �ݺ����� ������
			for(int i = 0; i < arr.length; i++) {
				// arr�� i������ check�� ���ٸ�
				if(arr[i] == check) {
					// cnt�� �������ְ�,
					cnt++;
				}
			}
			// check�� ��� ���Դ��� ���
			System.out.println(check + " : " + cnt);
			// check�� ++,
			check++;
			// cnt�� 0���� �ʱ�ȭ.
			cnt = 0;
			
			// check�� 9���� ���ؾ��ؼ� 10�̵Ǹ� while�� break
			if(check == 10) {
				break;
			}
		}
		
	}

}
