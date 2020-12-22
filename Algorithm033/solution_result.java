package Algorithm033;

public class solution_result {
	static final int SIZE = 5;
	static final int COLOR = 2;
	
	static int [][]map = 
			   {{0,0,0,0,0},
			   {0,0,1,1,0},
			   {0,0,0,0,1},
			   {0,0,0,0,0},
			   {0,0,1,0,0}};
	
	
	public static void color(int x, int y) {
		
		// map�� x,y������ 1�� �ƴ϶��. ��, 0�̶�� ���� ĥ�ؾ��ϱ� ������ COLOR�� �����ش�.
		if (map[x][y] != 1)
			map[x][y] = COLOR;
		
		// ���� => �������� �� �� 0���� �۾����� �ȵǼ� ������ �ɾ��ְ�, ���ʿ� �ִ°� 2�� �ƴϰų� 1�� �ƴ϶��. ��, 0�̶�� ĥ���ְ�,
		if (x - 1 >= 0 && map[x-1][y] != COLOR && map[x-1][y] != 1)
			color(x-1, y);
		// ������ => ���������� �� �� ����� �Ѿ�� �ȵǼ� ������ �ɾ��ְ�, �������� 2�� �ƴϰų� 1�� �ƴ϶��. ��, 0�̶�� ĥ���ְ�,
		if (x + 1 <= SIZE-1 && map[x+1][y] != COLOR && map[x+1][y] != 1)
			color(x+1, y);
		// �Ʒ� => �Ʒ��� �� �� ����� ����� �ȵǱ� ������ ������ �ɾ��ְ�, �Ʒ��� 2�� �ƴϰų� 1�� �ƴ϶��. ��, 0�̶�� ĥ���ְ�,
		if (y + 1 <= SIZE-1 && map[x][y+1] != COLOR && map[x][y+1] != 1)
			color(x, y+1);
		// �� => ���� �� �� 0�� ����� �ȵǱ� ������ ������ �ɾ��ְ� 2�� �ƴϰų� 1�� �ƴ϶��. ��, 0�̶�� ĥ���ش�.
		if (y - 1 >= 0 && map[x][y-1] != COLOR && map[x][y-1] != 1)
			color(x, y-1);
		
		
	}
	
	public static void main(String[] args) {

		// ���� ĥ������ �� ����� ���ְ�
		for (int i = 0; i < SIZE; i++){
			for (int j = 0; j < SIZE; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		color(0,0);
		
		// ���� ĥ���� �� ����� ���ش�.
		for (int i = 0; i < SIZE; i++){
			for (int j = 0; j < SIZE; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}
