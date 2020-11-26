package Level1;

public class solution18 {
	
	/*
	 * ���ڿ� �� p�� y�� ����
	 * 
	 * [��������]
	 * �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� p�� ������ y�� ������ ���� ������ True, �ٸ��� false�� return�ϴ� �Լ�, solution�� �ϼ��Ͻÿ�.
	 * p, y��� �ϳ��� ���� ���� �׻� true�� return�մϴ�.
	 * ��, ������ ���� �� �빮�ڿ� �����ڴ� �������� �ʽ��ϴ�.
	 * 
	 * [����� ��]
	 * pPoooyY : true
	 * Pyy : false
	 */
	
	static boolean solution(String s) {
        boolean answer = true;

        // p�� cnt�� y�� cnt�� �÷��� int Ÿ���� ������ ����.
        int pcnt = 0;
        int ycnt = 0;
        // char array�� arr�������ָ�, ũ��� s�� ���̸�ŭ.
        char[] arr = new char[s.length()];
        // �빮�ڿ� �ҹ��ڰ� ��������� �޾ƿ� s�� ���� str�̶�� ������ ��� �ҹ��ڷ� ���� �� ����ش�.
        String str = s.toLowerCase();
        
        // str�� ���̸�ŭ for���� ������
        for(int i = 0; i < str.length(); i++) {
        	// char�迭�� i������ str�� i�������ִ� ���� ����ش�.
        	arr[i] = str.charAt(i);
        }
        // �׸��� arr�� ũ�⸸ŭ for���� ������
        for(int i = 0; i < arr.length; i++) {
        	// arr�� i������ p���
        	if(arr[i] == 'p') {
        		// pcnt�� ++, 
        		pcnt++;
        	// arr�� i������ y���
        	} else if(arr[i] == 'y') {
        		// ycnt�� ++���ش�.
        		ycnt++;
        	}
        }
        // ���� pcnt�� ycnt�� ���ٸ�, 
        if(pcnt == ycnt) {
        	// answer�� true�� , 
        	answer = true;
        // �׷��� �ʴٸ�
        } else {
        	// answer�� false�� �ٲ� ��,
        	answer = false;
        }
        // return���ش�.
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
	}

}
