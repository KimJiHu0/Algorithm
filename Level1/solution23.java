package Level1;

public class solution23 {
	
	public static String solution(String phone_number) {
        String answer = "";

        // phone_number�� ���ڿ��� �߶� String �迭�� �ϳ��ϳ� �־��ش�.
        String[] nArr = phone_number.split("");
        
        // 0�������� ������ ���� 4�� �ձ��� for���� �����ָ� answer�� *�� �־��ش�.
        for(int i = 0; i < nArr.length-4; i++) {
        	answer += "*";
        }
        
        // �տ� *�� ���� �κ��� ������ �������κ��� ���ڸ� answer�� �־��ش�.!
        for(int i = nArr.length-4; i < nArr.length; i++) {
        	answer += nArr[i];
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
		System.out.println(solution("027778888"));
	}

}
