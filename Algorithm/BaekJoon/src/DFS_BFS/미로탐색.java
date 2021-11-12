package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//����
//N��Mũ���� �迭�� ǥ���Ǵ� �̷ΰ� �ִ�.
//
//1	0	1	1	1	1
//1	0	1	0	1	0
//1	0	1	0	1	1
//1	1	1	0	1	1
//�̷ο��� 1�� �̵��� �� �ִ� ĭ�� ��Ÿ����, 0�� �̵��� �� ���� ĭ�� ��Ÿ����. �̷��� �̷ΰ� �־����� ��, (1, 1)���� ����Ͽ� (N, M)�� ��ġ�� �̵��� �� ������ �ϴ� �ּ��� ĭ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. �� ĭ���� �ٸ� ĭ���� �̵��� ��, ���� ������ ĭ���θ� �̵��� �� �ִ�.
//
//���� �������� 15ĭ�� ������ (N, M)�� ��ġ�� �̵��� �� �ִ�. ĭ�� �� ������ ���� ��ġ�� ���� ��ġ�� �����Ѵ�.
//
//�Է�
//ù° �ٿ� �� ���� N, M(2 �� N, M �� 100)�� �־�����. ���� N���� �ٿ��� M���� ������ �̷ΰ� �־�����. ������ ������ �پ �Է����� �־�����.
//
//���
//ù° �ٿ� ������ �ϴ� �ּ��� ĭ ���� ����Ѵ�. �׻� ������ġ�� �̵��� �� �ִ� ��츸 �Է����� �־�����.

class Node {
	
	private int x;
	private int y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}

public class �̷�Ž�� {
	
	public static int n, m;
	public static int[][] graph; // = new int[201][201];
	
	// �̵��� �� ���� ���� ���� (�����¿�)
	public static int dx[] = {-1, 1, 0, 0};
	public static int dy[] = {0, 0, -1, 1};
	
	public static int bfs(int x, int y) {
		// ť ������ ���� queue ���̺귯�� ���
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x, y));
		// ť�� �� ������ �ݺ�
		while(!q.isEmpty()) {
			Node node = q.poll();
			x = node.getX();
			y = node.getY();
			// ���� ��ġ���� 4���� �������� ��ġ Ȯ��
			for(int i = 0; i < 4; ++i) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				// �̷� ã�� ������ ��� ��� ����
				if( nx < 0 || nx >= n || ny <0 || ny >= m) continue;
				// ���� ��� ����
				if(graph[nx][ny] == 0) continue;
				// �ش� ��带 ó�� �湮�ϴ� ��쿡�� �ִ� �Ÿ� ���
				if(graph[nx][ny] == 1) {
					graph[nx][ny] = graph[x][y] + 1;
					q.offer(new Node(nx, ny));
				}
			}
		}
		// ���� ������ �Ʒ������� �ִ� �Ÿ� ��ȯ
		return graph[n-1][m-1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// N, M�� ������ �������� �����Ͽ� �Է� �ޱ�
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // ���� �����
        
        graph = new int[n][m];

        // 2���� ����Ʈ�� �� ���� �Է� �ޱ�
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        // BFS�� ������ ��� ���
        System.out.println(bfs(0, 0));
	}
}
