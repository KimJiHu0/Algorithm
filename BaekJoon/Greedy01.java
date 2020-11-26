package BaekJoon;

public class Greedy01 {

	/*
	 * ����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. �������忡�� �����
	 * ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
	 * 
	 * ����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6����
	 * �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
	 * 
	 * ����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static int Greedy(int sugar) {
		
		int threekgcount = 0;
		int threekgna = 0;
		int fivekgcount = 0;
		int fivekgna = 0;
		
		// 3kg ������ ������� �� ������ ���� ���� ���ϱ�
		
		// �����ǹ��� / 3�� ���� threekgcount�� ����ش�.
		threekgcount += sugar / 3;
		// �����ǹ��� / 3 �� ���������� threekgna�� ����ش�.
		threekgna = sugar % 3;
		// ���� ������ / 3�� 0�ϰ�쿡 (������ �������ٸ�)
		if(threekgna % 3 == 0) {
			// threekgcount�� threekgna / 3�� ���� �����ش�.
			threekgcount += threekgna / 3;
		} else {
			// �׷��� ������ (������ �������� �ʴ´ٸ�) -1�� �ʱ�ȭ���ش�.
			threekgcount = -1;
		}
		
		// 5kg ������ 3kg������ ������� �� ������ ���� ���� ���ϱ�
		
		// fivekgcount�� ������ ���� / 5�� ���� ����ش�.
		fivekgcount += sugar / 5;
		// fivekgna�� �����ǹ��� / 5�� ���� �������� ����ְ�
		fivekgna = sugar % 5;
		// ���� �� ������ / 3 �� 0�̶�� (������ �������ٸ�)
		if(fivekgna % 3 == 0) {
			// fivekgcount�� fivekgna / 3 ���� �����ش�.
			fivekgcount += fivekgna / 3;
		} else {
			// �׷��� ������ (������ �������� �ʴ´ٸ�) fivekgcount�� -1�� �ʱ�ȭ���ش�.
			fivekgcount = -1;
		}
		
		// �� count�߿� �ϳ��� -1�� �Ǿ��ִٸ� �ٸ� ���� return�ϱ� ���� if��
		
		// ���� fivekgcount�� -1�̶��
		if(fivekgcount == -1) {
			// threekgcount�� return�ϰ�, 
			return threekgcount;
		// threekgcount�� -1�̶��
		} else if(threekgcount == -1) {
			// fivekgcount�� return�Ѵ�.
			return fivekgcount;
		}
		
		// -1�� ���� ��� ���ڰ� �� ���� count�� return�ϱ� ���� if��
		
		// ���࿡ fivekgcount�� threekgcount���� �۴ٸ�
		if(fivekgcount < threekgcount) {
			// ficekgcount�� return�ϰ�
			return fivekgcount;
		// �׷��� �ʴٸ�
		} else {
			// threekgcount�� return�Ѵ�.
			return threekgcount;
		}
		
		// ���� �ڵ�� ������ �����ϸ� ���� Ǭ �ڵ��̸�, ��������� �ڵ��Դϴ�.
		// �����۵� ������ �ٸ� ������� Ǯ������� �� �����ϴ�.
	}
	
	public static void main(String[] args) {
		System.out.println("����� ������ ���� : " + Greedy(6));
	}

}
