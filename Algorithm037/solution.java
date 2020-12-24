package Algorithm037;

public class solution {
	
	// ������ ��� ���ver
	
	static final int SIZE = 5;
	static final int APART = 1;
	
	// �������� ���� ���� ����
	static int apartCnt = 0;
	// �� ������ ������� �����ϱ� ���� �迭
	static int []houseHold = new int[10];

	static int[][] map = {
			{0,0,0,1,1},
			{0,0,0,0,1},
			{1,0,0,0,0},
			{1,1,0,0,0},
			{1,1,0,1,1}
	};
	public static void main(String[] args) {
		// map�� ���鼭
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				// 1�϶�, ����Ʈ�� �����ϴ� �������� ++�ϱ� ����.
				if(map[i][j] == 1) {
					// 1�� �ִ� ���� �����¿츦 üũ�Ͽ� ����� ������ ���� �Լ�ȣ��
					check(i, j, apartCnt);
					apartCnt++;
				}
			}
		}
		
		// ���� ����Ʈ ���� ����ϰ�,
		System.out.println("������ : " + apartCnt);
		// ������� ������ ���� �ҷ��� ���
		for(int i : houseHold) {
			System.out.print(i + " ");
		}
	}
	
	public static void check(int x, int y, int cnt) {
		
		// �Ѿ�� �ش� �������� ���� 0���� �ٲ�����Ѵ�.
		map[x][y] = 0;
		// �ϳ��� �������� 1������ ����Ʈ�� ����� Ȯ���ϱ� ���� cnt�������� ���� ++�Ѵ�.
		houseHold[cnt]++;
		
		// ����� ����� �ʰ�, �����¿찡 1�̶�� �ٽ� �Լ��� ȣ���ϱ� ���� ���ǹ���
		if(x-1 >= 0 && map[y][x-1] == APART){
			check(y, x-1, cnt);
		}
		if(x + 1 <= SIZE-1 && map[y][x+1] == APART) {
			check(y, x+1, cnt);
		}
		if(y + 1 <= SIZE-1 && map[y+1][x] == APART) {
			check(y+1, x, cnt);
		}
		if(y - 1 >= 0 && map[y-1][x] == APART) {
			check(y-1, x, cnt);
		}
		
	}

}
