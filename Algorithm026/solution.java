package Algorithm026;

public class solution {
	
	// ���
	
	// ����� ���� �Ųٷ� �д´�. 734�� 893�� �Ųٷ� �о �� ū���� ����ϼ���
	
	public static void main(String[] args) {
		
		int num1 = 734;
		int num2 = 893;
		
		// num1�� �Ųٷ� ����ϱ�
		
		// num1�� String���� �������ش�.
		String inputNum1 = String.valueOf(num1);
		// ����� ���� String���� answer1 ����
		String answer1 = "";
		// �ݺ����� �����ִµ�, inputNum1���� 0���� �Ųٷ� answer1�� �����ش�.
		for(int i = inputNum1.length()-1; i >= 0; i--) {
			answer1 += inputNum1.charAt(i);
		}
		
		// num2�� String���� �������ش�.
		String inputNum2 = String.valueOf(num2);
		// ����� ���� String���� answer2 ����
		String answer2 = "";
		// �ݺ����� �����ִµ� inputNum2���� 0���� answer2�� �����ش�.
		for(int i = inputNum2.length()-1; i >= 0; i--) {
			answer2 += inputNum2.charAt(i);
		}
		
		// String���� answer1�� answer2�� ���� Integer�� ����ȯ �� answer1�� �� ũ�ٸ�
		if(Integer.parseInt(answer1) > Integer.parseInt(answer2)) {
			// answer1 ���
			System.out.println(answer1);
		// �ƴ϶��
		} else {
			// answer2 ���
			System.out.println(answer2);
		}
		
		System.out.println("=================");
		
		
		
	}

}
