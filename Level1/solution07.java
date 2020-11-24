package Level1;

public class solution07 {
	/*
	 * [��������]
	 * �ڿ��� n�� �Ű������� �־����ϴ�. n�� 3���� �󿡼� �յڷ� ������ ��,
	 * �̸� �ٽ� 10�������� ǥ���� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	 * 
	 * [��������]
	 * n�� 1 �̻� 100,000,000 ������ �ڿ����Դϴ�.
	 * 
	 * [����� ��]
	 * n : 45 / result : 7
	 * n : 125 / result : 229
	 * 
	 * [����]
	 * 10���� : 45 / 3���� : 1200 / ����3���� : 0021 / 10���� : 7
	 */
	
	public static int solution(int n) {
        int answer = 0;
        String str = "";
        
        // 45 / 3 = 15 ... 0
        // 15 / 3 = 5 ... 0
        // 5 / 3 = 1 ... 2
        // => 1200�ε�
        
        // �̸� ����� 0021
        // �̸� 10�������� �ٲ㼭 ǥ���Ѵ�.
        
        // �Է��� �� �� 0���� Ŭ�� whlie���� �����ش�.
        while(n > 0) {
        	// str�̶�� String����  n/3�� �������� �����ش�.
        	str += n%3;
        	// n�� n/3�� ���� ����.�̸� �ݺ�.
        	n /= 3;
        }
        
        
        int j = 0;
        // 1200�� �Ųٷ� ����ϱ� ����
        // => 0021����
        // 1�� 3^0 => 1
        // 2�� 3^1 => 3*2�ؼ� 6.
        // => 6 + 1 => 7
        for(int i = str.length()-1; i >= 0; i--) {
        	answer += (str.charAt(i) - '0') * Math.pow(3, j);
        	j++;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(45));
	}

}
