package Level1;

public class solution11 {
	/*
	 * ���￡�� �輭�� ã��
	 * [��������]
	 * String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"��
	 * String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
	 * seoul�� "Kim"�� ���� �ѹ��� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�. 
	 * 
	 * [���ѻ���]
	 * seoul�� ���� 1�̻�, 1000������ �迭�Դϴ�.
	 * seoul�� ���Ҵ� ���� 1�̻�, 20������ ���ڿ��Դϴ�.
	 * "Kim"�� �ݵ�� seoul�ȿ� ���ԵǾ� �ֽ��ϴ�.
	 * 
	 * [����� ��]
	 *  seoul : ["Jane", "Kim"] / return "�輭���� 1�� �ִ�."
	 */
	
	public static String solution(String[] seoul) {
        String answer = "";
        
        // �޾ƿ� seoul�迭��ŭ for�� �����ִµ�
        for(int i = 0; i < seoul.length; i++) {
        	// ���� i������ �ִ¾ְ� Kim�̶��
        	if(seoul[i].equals("Kim")) {
        		// answer�� �Ʒ��� String���� �Է��ϰ� return
        		answer = "�輭���� " + i + "�� �ִ�.";
        		break;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"Jane", "Kim"}));
	}

}
