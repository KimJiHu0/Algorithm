package Algorithm019;

public class solution {
	
	// �ŵ�����
	
	public static void main(String[] args) {
		
		int num = 10;
		int up = 3;
		
		// 1.
		// Math.pow �޼ҵ带 �̿��Ͽ� �ŵ������� �����ش�.
		System.out.println((int)Math.pow(num, up));
		
		// 2.
		// sum�̶�� ���� ����ִ� ���� �����Ѵ�.
		int sum = 1;
		// up��ŭ �ݺ����� �����ش�. => �ŵ�������ŭ
		for(int i = 0; i < up; i++) {
			// sum�� num�� ��� �����ش�.
			sum *= num;
		}
		System.out.println(num + "��" + up + "�� = " +sum);
		
	}

}
