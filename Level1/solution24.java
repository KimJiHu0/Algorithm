package Level1;

import java.util.Arrays;

public class solution24 {
	
	// �ڿ��� ������ �迭�� �����
	
	// �ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ����� �����ϼ���.
	
	public static int[] solution(long n) {
        
		// �޾ƿ� n���� String���� ��ȯ ��
        String nStr = String.valueOf(n);
        
        // nArr�̶�� �迭�� �ϳ��� ����ش�.
        String[] nArr = nStr.split("");
        //[1,2,3,4,5]
        
        // answer�̶�� int�迭�� ũ�⸦ �����Ͽ� �����ϰ�
        int[] answer = new int[nArr.length];
        // result��� ������ �����Ѵ�.
        int result = 0;
        
        // for������ nArr�� �ں��� �� ó������ for���� ������
        for(int i = nArr.length-1; i >= 0; i--) {
        	// answer�� result������ nArr�� �ں��� ó�������� index�� int���·� ����ȯ �� �־��ش�.
        	answer[result] = Integer.parseInt(nArr[i]);
        	result++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(12345)));
	}

}
