package Level1;

import java.util.Calendar;

public class solution06 {
	
	/*
	 * 2016�� 1�� 1���� �ݿ����Դϴ�.
	 * 2016�� a�� b���� ���� �����ϱ��?
	 * �� �� a,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	 * ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN, MON, TUE, WED, THU, FRI, SAT�Դϴ�.
	 * ������ a=5, b=24��� 5��24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.
	 * 
	 * ��������
	 * 2016���� �����Դϴ�.
	 * 2016�� a�� b���� ������ �ִ� ���Դϴ�.
	 */
	
	public static String solution(int a, int b) {
        String answer = "";
        
        Calendar cal = Calendar.getInstance();
        
        cal.set(2016, a-1, b);
        
        
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        
        switch(dayOfWeek) {
        	case 1:
        		answer = "SUN";
        		break;
        	case 2:
        		answer = "MON";
        		break;
        	case 3:
        		answer = "TUE";
        		break;
        	case 4 :
        		answer = "WED";
        		break;
        	case 5:
        		answer = "THU";
        		break;
        	case 6:
        		answer = "FRI";
        		break;
        	case 7:
        		answer = "SAT";
        		break;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(5, 24));
	}

}
