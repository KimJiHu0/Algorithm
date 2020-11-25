package Level1;

public class solution14 {
	
	/*
	 * ���ڿ� �ٷ�� �⺻
	 * 
	 * [��������]
	 * ���ڿ� S�� ���̰�  4Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ���ϴ� �Լ�, solution�� �ϼ��ϼ���.
	 * ������� s�� "a234"�� false, "1234"�� true�� �����ϸ� �˴ϴ�.
	 * 
	 * [��������]
	 * s�� ���� 1�̻�, 8������ ���ڿ��Դϴ�.
	 */
	
	public static boolean solution(String s) {
		boolean answer = true;
		
		// 1. 87.5�� 
		// => �׽�Ʈ 5,6�� ����
		try {
			// s�� int Ÿ������ ����ȯ ���ִµ� �и��� ������ ���� ������
			// try catch�� ����ش�.
			Integer.parseInt(s);
			// ���� ����ȯ�� �����ϰ� ������ ���� ������ answer�� true�� �ٲ��ְ�,
			answer = true;
		} catch (NumberFormatException e) {
			// ������ ���ٸ� answer�� false�� ��Ƽ� return�Ѵ�.
			answer = false;
		}
		
		//2. 100��
		
		// regx�� ���Խ�ǥ���� ����� String�̴�.
		// ���ڿ��� ó�� ���۰� ���� �����̰�, ������ ������ ���ٴ� ���� �ǹ��Ѵ�.
		String regx = "^[0-9]*$";
		// ���� s�� ���̰� 4�ų� 6�϶�
		if(s.length() == 4 || s.length() == 6) {
			// �׸��� ���Խ� ǥ������ �´´ٸ�
			if(s.matches(regx)) {
				// answer�� true��, 
				answer = true;
			} else {
				// �׷��� �ʴٸ� answer�� false��,
				answer = false;
			}
		} else {
			// ���ʿ� s�� ���̰� 4�ų� 6���� �ʴ´ٸ� answer�� false�� �ٲ��ش�.
			answer = false;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
	}

}
