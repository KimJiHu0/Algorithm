package Level1;

public class solution22 {
	
	// ������ ����ִ� �迭 arr�� ��հ��� return�ϴ� solution�� �ϼ��ϼ���.
	
	public static double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        
        // arr�� ���̸�ŭ for���� �����ִµ�, 
        for(int i = 0; i < arr.length; i++){
        	// �̸� ������ sum�̶�� ������ arr�� i������ �����ش�.
            sum += arr[i];
        }
        // �׸��� answer�̶�� ������ double Ÿ������ ����ȯ ���� sum / arr�� length �� ���� ����ش�.
        answer = (double) sum / arr.length;
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4}));
		System.out.println(solution(new int[] {5,5}));
	}

}
