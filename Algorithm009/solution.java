package Algorithm009;

public class solution {
	
	// �Էµ� ���� �� �ڸ��� ���� ���Ͻÿ�.
	
	// ����� �ǰ� �������� ����.
	
	// intŸ���� ������ ��� ���� �ڸ����� �ϳ��� �̾Ƴ��� ���ؼ���
	// String���·� �ٲپ charAt�� �̿��ص� �Ǹ�,
	// String[] �� �ص� �ǰ�, int[]�� �ص��ȴ�.
	
	public static void main(String[] args) {
		
		// String ������ �̿��� ù��° ���
		int num = 1232;
		
		String nStr = String.valueOf(num);
		
		int answer = 0;
		for(int i = 0; i < nStr.length(); i++) {
			answer += Integer.parseInt(nStr.charAt(i)+"");
		}
		System.out.println(answer);
		System.out.println("=================================");
		
		// 2��° ���
		
		int inputNum = 1232;
		int accSum = 0;
		
		while(inputNum > 0) {
			// accSum�� inputNum / 10�� �������� ���ϰ�,
			accSum += inputNum % 10;
			// inputNum���� inputNum / 10 �� ���� ����ش�. �̸� �ݺ�
			inputNum /= 10;
		}
		System.out.println(accSum);
		
		
	}

}
