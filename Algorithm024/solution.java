package Algorithm024;

public class solution {
	
	// ��� �Ѵ� �л��� % ���ϱ�

	public static void main(String[] args) {
		
		// �л��� : 7
		int student = 7;
		// �л����� ����
		int[] score = new int[] {100,95,90,80,70,60,50};
		
		// �հ�
		int sum = 0;
		// ���
		double avg = 0;
		
		// sum�� score�� ������ ��� �����ݴϴ�.
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		// avg���� sum / �л� ���� double���·� ����ݴϴ�. 
		avg = (double)sum / student;
		
		// int a�� ����� �Ѵ� �л����Դϴ�.
		int a = 0;
		
		for(int i = 0; i < score.length; i++) {
			if(avg < score[i]) {
				a++;
			}
		}
		double answer = 0;
		
		// A�� ��%�� �л��� ����� �Ѵ��� �����ݴϴ�.
		double A = ((double)a / student) * 100;
		// A�� *1000�� ���� 57.1428 * 1000 ���� 57142.8.. �� �ݿø����� 57143�� 1000���� ������ ����ݴϴ�.
		answer = Math.round(A * 1000.0) / 1000.0;
		//System.out.println(String.format("%.3f", answer));
		
		System.out.println(answer+"%");
		// 57.143%
		
	}
	
}
