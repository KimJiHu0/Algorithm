package Level1;

public class solution25 {
	
	// �̻��� ���� �����
	
	// ���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�.
	//�� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�.
	//�� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	
	// "try hello world" => "TrY HeLlO WoRlD"
	
	public static String solution1(String s) {
		String answer = "";
        
		// �޾ƿ� s�� ���� char�迭�� ��ȯ�Ѵ�.
        char[] nArr = s.toCharArray();
        
        // �� ���̸�ŭ for���� ���鼭
        for(int i = 0; i < nArr.length; i++) {
        	// ���� i / 2�� �������� 0�̸� => ¦���̸�
        	if(i % 2 == 0) {
        		// answer�� nArr�� i������ �빮�ڷ� �ٲ㼭 �����ش�.
        		answer += String.valueOf(nArr[i]).toUpperCase();
        	// Ȧ���̸�
        	} else {
        		// answer�� �ҹ����� ���·� �����ش�.
        		answer += String.valueOf(nArr[i]);
        	}
        }
		return answer;
		
		// �� �ڵ��� ������
		// �߰��� ���⸦ �� ��쿡 �з��� ��ҹ��ڰ� �ٲ��.
	}
	
	public static String solution(String s) {
        String answer = "";
        
        // str�̶�� �迭�� �޾ƿ� s�� �ѱ��� �ѱ��� �߶�� ���� ����ش�.
        String str[] = s.split("");
        String space = " ";
        int cnt = 0;
        
        // str�� ���̸�ŭ for���� �����ִµ�, 
        for(int i = 0; i < str.length; i++){
        	// ���� str�� i������ �����̶��
            if(str[i].equals(space)){
            	// cnt�� 0���� �ʱ�ȭ�� �����ش�.
               cnt = 0;
            // ������ ���ԵǾ����� �ʴٸ� 
            }else{
            	// cnt / 2�� �������� 0�̶�� => ¦�����
               if(cnt % 2 == 0){
            	   // cnt�� ++���ְ�, 
                  cnt++;
                  // str�� i������ str�� i���� �ָ� �빮�ڷ� �ٲ㼭 ����ش�.
                  str[i] = str[i].toUpperCase();
               // Ȧ�����
               }else{
            	   // cnt�� ++���ְ�, 
                   cnt++;
                   // str�� i������ str�� i���� �ָ� �ҹ��ڷ� �ٲ㼭 ����ش�.
                   str[i] = str[i].toLowerCase();
               }
            }
            // �׸��� answer�̶�� ������ str�� i������ ���� ����ش�.
            answer += str[i];
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(" �� �ڵ� : " + solution1("try hello world"));
		System.out.println(" ������ �ڵ� : " + solution("try hello world"));
	}

}
