package Level1;

public class solution21 {
	
	// ¦���� Ȧ��
	
	// ¦���� Even return
	// Ȧ���� Odd return
	
	public static String solution(int num) {
        String answer = "";
        
        if(num % 2 == 0){
            answer = "Even";
        } else {
            answer = "Odd";
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}

}
