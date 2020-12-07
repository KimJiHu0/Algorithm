package Level1;

import java.util.Arrays;

public class solution37 {

	// ���ǰ��
	
	// �׽�Ʈ���̽�8�� ����

	/*
	 * �����ڴ� ������ ������ ����� �ظ��Դϴ�.
	 * ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�.
	 * �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.
	 * 
	 * 1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	 * 2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	 * 3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	 * 
	 * 1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭��
	 * ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	 * 
	 * [1,2,3,4,5] return [1]
	 * [1,3,2,4,2] return [1,2,3]
	 */
	
	public static int[] solution(int[] answers) {
		
		int[] answer = {};
		
		// ������1�� ��� ����
        int[] idx1 = {1, 2, 3, 4, 5};
        // ������1�� cnt
        int cnt1 = 0;
        // ������1�� ���� ����
        int answer1 = 0;
        
        // ������2�� ��� ����
        int[] idx2 = {2, 1, 2, 3, 2, 4, 2, 5};
        // ������2�� cnt
        int cnt2 = 0;
        // ������2�� ���� ���� ����
        int answer2 = 0;
        
        // ������3�� ��� ����
        int[] idx3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        // ������3�� cnt
        int cnt3 = 0;
        // ������3�� ���� ���� ����
        int answer3 = 0;
        
        
        for(int i = 0; i < answers.length; i++) {
        	// ������ 1�� ����� ����ϴ� ���ǹ�
        	if(idx1[cnt1] == answers[i]) {
        		answer1++;
        	}
        	cnt1++;
        	if(cnt1 == idx1.length) {
        		cnt1 = 0;
        	}
        	
        	// ������ 2�� ����� ����ϱ� ���� ���ǹ�
        	if(idx2[cnt2] == answers[i]) {
        		answer2++;
        	}
        	cnt2++;
        	if(cnt2 == idx2.length) {
        		cnt2 = 0;
        	}
        	
        	// ������ 3�� ����� ����ϱ� ���� ���ǹ�
        	if(idx3[cnt3] == answers[i]) {
        		answer3++;
        	}
        	cnt3++;
        	if(cnt3 == idx3.length) {
        		cnt3 = 0;
        	}
        }
        System.out.println("1�� : "+answer1 + "��");
        System.out.println("2�� : "+answer2 + "��");
        System.out.println("3�� : "+answer3 + "��");
        
        // max��� ������ answer1�� ���� �ְ�,
        int max = answer1;
        
        // max���� answer2�� ũ��
        if(max < answer2) {
        	// max�� answer2�̰�
        	max = answer2;
        	// answer�迭�� 2�� �ִ´�.
        	answer = new int[] {2};
        }
	// max���� answer3�� ũ�ٸ�
	if(max < answer3) {
        	// max�� answer3�� ����
        	max = answer3;
        	// answer�迭�� 3�� �����Ѵ�.
        	answer = new int[] {3};
        }
	// �׷����ʴٸ�
	if(max == answer1){
        	// answer�迭�� 1�� ����.
        	answer = new int[] {1};
        }
        
        // ���࿡ answer1�� answer2�� ���� answer2�� answer3�� ����, answer1�� answer3�� ���ٸ�
        if(answer1 == answer2 && answer2 == answer3 && answer1 == answer3) {
        	// answer�迭�� 1,2,3�� ����
        	answer = new int[] {1,2,3};
        // �׷����ʰ� answer1�� answer2�� ����, max�� answer3�� �ƴ϶��
        } else if((answer1 == answer2) && max != answer3) {
        	// answer�� 1��2�� ����.
        	answer = new int[] {1,2};
        // �׷����ʰ� answer1�� answer3�� ����, max�� answer2�� �ƴ϶��
        } else if((answer1 == answer3) && max != answer2) {
        	// 1,3�� answer�� ����
        	answer = new int[] {1,3};
        // �׷����ʰ� answer2�� answer3�� ����, max�� answer1�� �ƴ϶��
        } else if((answer2 == answer3) && max != answer1) {
        	// answer�� 2,3 ����
        	answer = new int[] {2,3};
        }
        return answer;
    }
	
	public static void main(String[] args) {
		// 1�� => 1,2,3,4,5
		// 2�� => 2,1,2,3,2,4,2,5
		// 3�� => 3,3,1,1,2,2,4,4,5,5
		System.out.println(Arrays.toString(solution(new int[] {1,2,3,4,5})));
		System.out.println(Arrays.toString(solution(new int[] {1,3,2,4,2})));
		System.out.println(Arrays.toString(solution(new int[] {2,3,1,4,5})));
		System.out.println(Arrays.toString(solution(new int[] {4,2,5,3,1})));
		System.out.println(Arrays.toString(solution(new int[] {3,1,2,5,4})));
	}

}
