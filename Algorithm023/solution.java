package Algorithm023;

public class solution {
	
	// ���ڿ� ����� ����ϱ�
	
	public static void main(String[] args) {
		// �޾ƿ� ��
		String str = "ADEFH";
		
		// �Ųٷ� ����ϱ�
		// str�� ����-1���� 0���� ������ָ� �˴ϴ�.
		for(int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i) + "");
		}
	}

}
