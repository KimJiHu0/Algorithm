package Algorithm025;

public class solution {
	
	// ���ϱ� ����Ŭ
	
	public static void main(String[] args) {
		
		
		// ó������ �޾ƿ� ����
		int num = 26;
		// ��� ���Ҵ��� �˷��ֱ� ���� ����
		int cnt = 0;
		
		// 26 => 68 => 84 => 42 => 26
		// 2+6 = 8 ---> 26�� ���ڸ� 6, �հ� 8 ------> 68
		// 6+8 => 14 ---> 68�� ���ڸ� 8, �հ� 14 �� ���ڸ� 4 --------> 84
		// 8+4 => 12 ---> 84�� ���ڸ� 4, �հ� 12�� ���ڸ� 2 ---------> 42
		// 4+2 => 6 ---> 42�� ���ڸ� 2, �հ� 6 --------> 26 (��)
		
		// ���� �ݺ��� �����ϴ�.
		while(true) {
			
			// num�� String���� ��ȯ �� nStr�̶�� ������ ����ϴ�.
			// String nStr = "26";
			String nStr = String.valueOf(num);
			
			// nStr�̶�� ������ nArr�̶�� Character�迭�� ������ݴϴ�.
			char[]nArr = nStr.toCharArray();
			// �� �ڸ� ���� ���� �����ֱ� ���� ����
			int sum = 0;
			
			// nArr�� ����ִ� ������ sum�� ����ݴϴ�.
			for(int i = 0; i < nArr.length; i++) {
				sum += Integer.parseInt(nArr[i]+"");
			}
			
			// ������ �ִ� ���� 9+9�� 18. ��, ���ڸ� ���� String�迭�� ũ�� 2�� �����س��� �����մϴ�.
			String[]nArr1 = new String[2];
			
			// ���� sum�� 10�̻��̶��
			if(sum > 9) {
				// nArr1�� 0������ nArr��1������ ���� �����ϰ�, 
				nArr1[0] = nArr[1]+"";
				
				// StringŸ���� str������ �����Ͽ� sum�� ����ȯ ��,
				String str = String.valueOf(sum);
				// nArr1[1]������ str�� 1������ ���� �־��ݴϴ�.
				// 14���� => 4�� ����.
				nArr1[1] = str.charAt(1)+"";
				
				// �� �� cnt��++���ݴϴ�.
				cnt++;
				// �׸��� sum�� 0���� �ʱ�ȭ���ݴϴ�.
				sum = 0;
				
				// �̷��� �Ǹ�  68���� ����� �ĸ����� �� nArr1�� ��� ����
				// 6+8 sum=14 , 68���� 1������ ���� nArr1[0]�� ��Ƽ� [8, ?] �� �ǰ�,
				// sum���� 1���� ���� nArr1[1]�� ����־� [8, 4]�� �˴ϴ�.
				
			// sum�� 9���϶��
			} else {
				// nArr1[0]�� nArr[1]�� ���� �ְ�,
				nArr1[0] = nArr[1]+"";
				// => [6, ?]
				// nArr��1������ sum�� �������ݴϴ�.
				nArr1[1] = String.valueOf(sum);
				// => [6, 8]
				
				
				// �� �� cnt��++���ְ�,
				cnt++;
				// sum�� �ʱ�ȭ���ݴϴ�.
				sum = 0;
				
				
				// �̷��� �Ǹ�  26���� ����� �ĸ����� �� nArr1�� ��� ����
				// 2+6 sum=8 , 26���� 1������ ���� nArr1[0]�� ��Ƽ� [6, ?] �� �ǰ�,
				// sum�� nArr1[1]�� ����־� [6, 8]�� �˴ϴ�.
			}
			
			// �� ������ num�� �ʱ�ȭ ���� ��,
			num = 0;
			
			// StringŸ���� tmp�� �������ְ�
			String tmp = "";
			// nArr1�� ���̸�ū �ݺ����� ���鼭
			for(int i = 0; i < nArr1.length; i++) {
				// tmp�� ����ݴϴ�.
				tmp += nArr1[i];
				// => 68
			}
			
			// num�� tmp�� Integer.parseInt�� ���� int������ ��ȯ ���ݴϴ�.
			num = Integer.parseInt(tmp);
			
			// ���� ó������ �޾ƿ� ���� �ٽ� �ȴٸ�
			if(num == 26) {
				// �ݺ����� �����մϴ�.
				break;
			}
		}
		// �׸��� cnt�� ����մϴ�.
		System.out.println(cnt);
		
	}

}
