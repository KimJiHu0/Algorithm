package Level1;

public class solution12 {
	/*
	 * [���ڼ��ڼ��ڼ���?]
	 * 
	 * [��������]
	 * ���̰� n�̰� "���ڼ��ڼ��ڼ���.."�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� ��ȯ���ϼ���.
	 * ���� ��� n�� 4�� "���ڼ���", n�� 3�̸� "���ڼ�"�� �����ϸ� �˴ϴ�.
	 * 
	 */
	
	public static String solution(int n) {
        String answer = "";
        
        int end = n;
        
        // ���� ���� ¦���� ��
        if(n % 2 == 0) {
        	for(int i = 0; i < end; i++) {
        		if(n % 2 == 0) {
        			answer += "��";
        		} else {
        			answer += "��";
        		}
        		--n;
        	}
        }
        
        // ���� ���� Ȧ���� ��
        if(n % 2 != 0) {
        	for(int i = 0; i < end; i++) {
        		if(n % 2 == 1) {
        			answer += "��";
        		} else {
        			answer += "��";
        		}
        		--n;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(5));
		System.out.println(solution(6));
	}

}
