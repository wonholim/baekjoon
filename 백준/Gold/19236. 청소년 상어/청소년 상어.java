
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Node implements Comparable<Node>{
		int x;
		int y;
		int s;
		int d;
		public Node(int x, int y, int s, int d) {
			this.x = x;
			this.y = y;
			this.s = s;
			this.d = d;
		}
		public static Node newInstance(Node o) {
			Node tmp = new Node(o.x, o.y, o.d, o.s);
			return tmp;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.s - o.s;
		}
	}
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
	static int max = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		List<Node> list = new ArrayList<>();
		Node[][] fishes = new Node[4][4];
		for(int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 4; j++) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken()) - 1;
				fishes[i][j] = new Node(i, j, a, b);
				list.add(fishes[i][j]);
			}
		}
		Node shark = list.remove(0);
		fishes[0][0] = null;
		go(shark, fishes, list);
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void go(Node shark, Node[][] fishes, List<Node> list) {
		// TODO Auto-generated method stub
		if (shark.x + dx[shark.d] < 0 || shark.y + dy[shark.d] < 0 || shark.x + dx[shark.d] >= 4 || shark.y + dy[shark.d] >= 4) {
			max = Math.max(max, shark.s);
			return;
		}
		Collections.sort(list);
		int size = list.size();
		// 물고기 이 동
		for (int i = 0; i < size; i++) {
			Node moveFish = list.get(i);
			int dir = moveFish.d;
			for(int k = 0; k < 8; k++) {
				int xx = moveFish.x;
				int yy = moveFish.y;
				xx += dx[dir];
				yy += dy[dir];
				if(xx >= 0 && yy >= 0 && xx < 4 && yy < 4 && !(shark.x == xx && shark.y == yy)) {
					if(fishes[xx][yy] == null) {
						fishes[moveFish.x][moveFish.y] = null;
						fishes[xx][yy] = new Node(xx, yy, moveFish.s, dir);
						for(Node cur : list) {
							if(cur.s == fishes[xx][yy].s) {
								list.remove(cur);
								list.add(new Node(xx, yy, moveFish.s, dir));
								break;
							}
						}
					}else {
						Node tmpFish = new Node(fishes[xx][yy].x, fishes[xx][yy].y, fishes[xx][yy].s, fishes[xx][yy].d);
						fishes[xx][yy] = new Node(xx, yy, moveFish.s, dir);
						fishes[moveFish.x][moveFish.y] = new Node(moveFish.x, moveFish.y, tmpFish.s, tmpFish.d);
						for(Node cur : list) {
							if(cur.s == fishes[moveFish.x][moveFish.y].s) {
								list.remove(cur);
								list.add(new Node(moveFish.x, moveFish.y, tmpFish.s, tmpFish.d));
								break;
							}
						}
						for(Node cur : list) {
							if(cur.s == fishes[xx][yy].s) {
								list.remove(cur);
								list.add(new Node(xx, yy, moveFish.s, dir));
								break;
							}
						}

					}
					break;
				}else {
					dir = (dir + 1) % 8;
				}
			}
			Collections.sort(list);
		}
		// 상어 이동 모든 경우의 수 
		int xx = shark.x;
		int yy = shark.y;
		for (int i = 0; i < 4; i++) {
			xx += dx[shark.d];
			yy += dy[shark.d];
			if(xx >= 0 && yy >= 0 && xx < 4 && yy < 4) {
				if(fishes[xx][yy] == null) {
					continue;
				}else {
					Node tmpFish = new Node(fishes[xx][yy].x, fishes[xx][yy].y, fishes[xx][yy].s, fishes[xx][yy].d);
					fishes[xx][yy] = null;
					for(Node cur : list) {
						if(cur.s == tmpFish.s){
							list.remove(cur);
							break;
						}
					}
					Node[][] cur = new Node[4][4];
					for(int a = 0; a < 4; a++) {
						for(int b = 0; b < 4; b++) {
							cur[a][b] = fishes[a][b];
						}
					}
					ArrayList<Node> tmpList = new ArrayList<>();
					for(int a = 0; a < list.size(); a++) {
						tmpList.add(list.get(a));
					}
					go(new Node(xx, yy, shark.s + tmpFish.s, tmpFish.d), cur, tmpList);
					fishes[xx][yy] = new Node(tmpFish.x, tmpFish.y, tmpFish.s, tmpFish.d);
					list.add(tmpFish);
					Collections.sort(list);
				}
			}else {
				max = Math.max(max, shark.s);
				continue;
			}
		}
	}

}
