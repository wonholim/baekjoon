

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static class Hero{
		int LV;
		int HP;
		int max_HP;
		int ATT;
		int bonus_ATT;
		int DEF;
		int bonus_DEF;
		int EXP;
		int max_EXP;
		int max_O;
		boolean HR;
		boolean RE;
		boolean CO;
		boolean EX;
		boolean DX;
		boolean HU;
		boolean CU;
		public Hero(int LV, int HP, int max_HP, int ATT, int bonus_ATT, int DEF, int bonus_DEF, int EXP, int max_EXP, int max_O, boolean HR, boolean RE, boolean CO, boolean EX, boolean DX, boolean HU, boolean CU){
			this.LV = LV;
			this.HP = HP;
			this.max_HP = max_HP;
			this.ATT = ATT;
			this.bonus_ATT = bonus_ATT;
			this.DEF = DEF;
			this.bonus_DEF = bonus_DEF;
			this.EXP = EXP;
			this.max_EXP = max_EXP;
			this.max_O = max_O;
			this.HR = HR;
			this.RE = RE;
			this.CO = CO;
			this.EX = EX;
			this.DX = DX;
			this.HU = HU;
			this.CU = CU;
		}
	}
	public static class Box{
		int x;
		int y;
		String WAO;
		String O;
		int WA;
		public Box(int x, int y, String WAO, int WA) {
			this.x = x;
			this.y = y;
			this.WAO = WAO;
			this.WA = WA;
		}
		public Box(int x, int y, String WAO, String O) {
			this.x = x;
			this.y = y;
			this.WAO = WAO;
			this.O = O;
		}
	}
	public static class Monster{
		int x;
		int y;
		String name;
		int monster_W;
		int monster_A;
		int monster_HP;
		int monster_EXP;
		int monster_max_HP;
		public Monster(int x, int y, String name, int monster_W, int monster_A, int monster_HP, int monster_EXP, int monster_max_HP) {
			this.x = x;
			this.y = y;
			this.name = name;
			this.monster_W = monster_W;
			this.monster_A = monster_A;
			this.monster_HP = monster_HP;
			this.monster_EXP = monster_EXP;
			this.monster_max_HP = monster_max_HP;
		}
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static int n;
	static int m;
	static int hero_x;
	static int hero_y;
	static char map[][];
	static String instruction;
	static int monster_count;
	static int box_count;
	static int boss_x;
	static int boss_y;
	static ArrayList<Monster> monster_list = new ArrayList<>();
	static ArrayList<Box> box_list = new ArrayList<>();
	static Hero hero;
	static int turn;
	static String lastEnemie;
	static boolean bossCheck = false;
	static int hero_start_x;
	static int hero_start_y;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		init();
		createHeroStatus();
		turn = start();
		end();
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void end() {
		// TODO Auto-generated method stub
		boolean heroCheck = hero_alive();
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < m + 1; j++) {
				if(heroCheck && i == hero_x && j == hero_y) {
					sb.append('@');
				}else {
					sb.append(map[i][j]);
				}
			}
			sb.append("\n");
		}
		if(hero.HP <= 0) {
			sb.append("Passed Turns : " + turn + "\n");
			sb.append("LV : " + hero.LV + "\n");
			sb.append("HP : " + hero.HP + "/" + hero.max_HP + "\n");
			sb.append("ATT : " + hero.ATT + "+" + hero.bonus_ATT + "\n");
			sb.append("DEF : " + hero.DEF + "+" + hero.bonus_DEF + "\n");
			sb.append("EXP : " + hero.EXP + "/" + hero.max_EXP + "\n" );
			sb.append("YOU HAVE BEEN KILLED BY " + lastEnemie + "..\n");
		}else {
			// 사냥중 보스를 잡으면 멈춰야 하는지 체크
			if(!bossCheck) {
				sb.append("Passed Turns : " + (turn - 1) + "\n");
				sb.append("LV : " + hero.LV + "\n");
				sb.append("HP : " + hero.HP + "/" + hero.max_HP + "\n");
				sb.append("ATT : " + hero.ATT + "+" + hero.bonus_ATT + "\n");
				sb.append("DEF : " + hero.DEF + "+" + hero.bonus_DEF + "\n");
				sb.append("EXP : " + hero.EXP + "/" + hero.max_EXP + "\n" );
				sb.append("Press any key to continue.\n");
			}else {
				sb.append("Passed Turns : " + turn + "\n");
				sb.append("LV : " + hero.LV + "\n");
				sb.append("HP : " + hero.HP + "/" + hero.max_HP + "\n");
				sb.append("ATT : " + hero.ATT + "+" + hero.bonus_ATT + "\n");
				sb.append("DEF : " + hero.DEF + "+" + hero.bonus_DEF + "\n");
				sb.append("EXP : " + hero.EXP + "/" + hero.max_EXP + "\n" );
				sb.append("YOU WIN!\n");
			}
		}
	}
	private static int start() {
		// TODO Auto-generated method stub
		int i;
		for(i = 0; i < instruction.length(); i++) {
			move(instruction.charAt(i));
			hero_levelUp();
			if(!hero_alive()) break;
			if(bossCheck) break;
		}
		return i + 1;
	}
	private static void hero_levelUp() {
		// TODO Auto-generated method stub
		if(hero.EXP >= hero.max_EXP) {
			hero.LV += 1;
			hero.EXP = 0;
			hero.max_EXP = hero.LV * 5;
			hero.ATT += 2;
			hero.DEF += 2;
			hero.max_HP += 5;
			hero.HP = hero.max_HP;
		}
	}
	private static boolean hero_alive() {
		// TODO Auto-generated method stub
		if(hero.HP <= 0) return false;
		else return true;
	}
	// 가시에 죽을 때 가시 에너미 추가
	private static void move(char move) {
		// TODO Auto-generated method stub
		if(move == 'U') {
			if(move_check(hero_x - 1, hero_y)) {
				if(move_next(hero_x - 1, hero_y)) {
					hero_x = hero_x - 1;
					hero_y = hero_y;
				}
			}else {
				if(map[hero_x][hero_y] == '^') {
					if(hero.DX) hero.HP -= 1;
					else hero.HP -= 5;
					lastEnemie = "SPIKE TRAP";
				}
			}
		}else if(move == 'D') {
			if(move_check(hero_x + 1, hero_y)) {
				if(move_next(hero_x + 1, hero_y)) {
					hero_x = hero_x + 1;
					hero_y = hero_y;
				}
			}else {
				if(map[hero_x][hero_y] == '^') {
					if(hero.DX) hero.HP -= 1;
					else hero.HP -= 5;
					lastEnemie = "SPIKE TRAP";
				}
			}
		}else if(move == 'R') {
			if(move_check(hero_x, hero_y + 1)) {
				if(move_next(hero_x, hero_y + 1)) {
					hero_x = hero_x;
					hero_y = hero_y + 1;
				}
			}else {
				if(map[hero_x][hero_y] == '^') {
					if(hero.DX) hero.HP -= 1;
					else hero.HP -= 5;
					lastEnemie = "SPIKE TRAP";
				}
			}
		}else if(move == 'L') {
			if(move_check(hero_x, hero_y - 1)) {
				if(move_next(hero_x, hero_y - 1)) {
					hero_x = hero_x;
					hero_y = hero_y - 1;
				}
			}else {
				if(map[hero_x][hero_y] == '^') {
					if(hero.DX) hero.HP -= 1;
					else hero.HP -= 5;
					lastEnemie = "SPIKE TRAP";
				}
			}
		}
		if(hero.HP <= 0) {
			hero.HP = 0;
			if(hero.RE) {
				hero.HP = hero.max_HP;
				hero_x = hero_start_x;
				hero_y = hero_start_y;
				hero.RE = false;
				hero.max_O--;
			}
		}
	}
	private static boolean move_next(int x, int y) {
		// TODO Auto-generated method stub
		if(map[x][y] == '&') {
			Monster monster = searchMonster(x, y);
			lastEnemie = monster.name;
			int count = 1;
			while(true) {
				if(hero.CO && hero.DX && count == 1) { monster.monster_HP -= Math.max(1, ((hero.ATT + hero.bonus_ATT) * 3) - monster.monster_A); count--; }
				else if(hero.CO && count == 1) { monster.monster_HP -= Math.max(1, ((hero.ATT + hero.bonus_ATT) * 2) - monster.monster_A); count--; }
				else monster.monster_HP -= Math.max(1, (hero.ATT + hero.bonus_ATT) - monster.monster_A);
				
				if(monster.monster_HP <= 0) {
					if(hero.EX) hero.EXP += Math.floor(monster.monster_EXP * 1.2);
					else hero.EXP += monster.monster_EXP;
					
					if(hero.HR) {
						hero.HP += 3;
						if(hero.HP > hero.max_HP) hero.HP = hero.max_HP;
					}
					break;
				}
				
				hero.HP -= Math.max(1, monster.monster_W - (hero.DEF + hero.bonus_DEF));
				if(hero.HP <= 0) {
					hero.HP = 0;
					if(hero.RE) {
						hero.HP = hero.max_HP;
						hero_x = hero_start_x;
						hero_y = hero_start_y;
						hero.RE = false;
						hero.max_O--;
						monster.monster_HP = monster.monster_max_HP;
						return false;
					}
					break;
				}
			}
			if(monster.monster_HP <= 0) {
				map[x][y] = '.';
				monster_list.remove(monster);
			}
		}else if(map[x][y] == 'B') {
			Box box = searchBox(x, y);
			if(box.WAO.equals("W")) {
				hero.bonus_ATT = box.WA;
			}else if(box.WAO.equals("A")) {
				hero.bonus_DEF = box.WA;
			}else {
				if(hero.max_O < 4) {
					if(box.O.equals("HR")) {
						if(!hero.HR) {
							hero.HR = true;
							hero.max_O++;
						}
					}else if(box.O.equals("RE")) {
						if(!hero.RE) {
							hero.RE = true;
							hero.max_O++;
						}
					}else if(box.O.equals("CO")) {
						if(!hero.CO) {
							hero.CO = true;
							hero.max_O++;
						}
					}else if(box.O.equals("EX")) {
						if(!hero.EX) {
							hero.EX = true;
							hero.max_O++;
						}
					}else if(box.O.equals("DX")) {
						if(!hero.DX) {
							hero.DX = true;
							hero.max_O++;
						}
					}else if(box.O.equals("HU")) {
						if(!hero.HU) {
							hero.HU = true;
							hero.max_O++;
						}
					}else if(box.O.equals("CU")) {
						if(!hero.CU) {
							hero.CU = true;
							hero.max_O++;
						}
					}
				}
			}
			box_list.remove(box);
			map[x][y] = '.';
		}else if(map[x][y] == '^') {
			if(hero.DX) hero.HP -= 1;
			else hero.HP -= 5;
			lastEnemie = "SPIKE TRAP";
			if(hero.HP <= 0) {
				hero.HP = 0;
				if(hero.RE) {
					hero.HP = hero.max_HP;
					hero_x = hero_start_x;
					hero_y = hero_start_y;
					hero.RE = false;
					hero.max_O--;
				}
			}
		}else if(map[x][y] == 'M') {
			Monster monster = searchMonster(x, y);
			lastEnemie = monster.name;
			int count = 1;
			int cnt = 1;
			while(true) {
				if(hero.CO && hero.DX && count == 1) { monster.monster_HP -= Math.max(1, ((hero.ATT + hero.bonus_ATT) * 3) - monster.monster_A); count--; }
				else if(hero.CO && count == 1) { monster.monster_HP -= Math.max(1, ((hero.ATT + hero.bonus_ATT) * 2) - monster.monster_A); count--; }
				else monster.monster_HP -= Math.max(1, (hero.ATT + hero.bonus_ATT) - monster.monster_A);
				
				if(monster.monster_HP <= 0) {
					
					if(hero.EX) hero.EXP += Math.floor(monster.monster_EXP * 1.2);
					else hero.EXP += monster.monster_EXP;
					
					bossCheck = true;
					if(hero.HU && cnt == 1) {hero.HP = hero.max_HP; cnt--;}
					if(hero.HR) {
						hero.HP += 3;
						if(hero.HP > hero.max_HP) hero.HP = hero.max_HP;
					}
					break;
				}
				if(hero.HU && cnt == 1) {hero.HP = hero.max_HP; cnt--;}
				else hero.HP -= Math.max(1, monster.monster_W - (hero.DEF + hero.bonus_DEF));
				
				if(hero.HP <= 0) {
					hero.HP = 0;
					if(hero.RE) {
						hero.HP = hero.max_HP;
						hero_x = hero_start_x;
						hero_y = hero_start_y;
						hero.RE = false;
						hero.max_O--;
						monster.monster_HP = monster.monster_max_HP;
						return false;
					}
					break;
				}
			}
			if(monster.monster_HP <= 0) {
				map[x][y] = '.';
				monster_list.remove(monster);
			}
		}
		return true;
	}
	private static Box searchBox(int x, int y) {
		// TODO Auto-generated method stub
		for(Box box : box_list) {
			if(box.x == x && box.y == y) return box;
		}
		return null;
	}
	private static Monster searchMonster(int x, int y) {
		// TODO Auto-generated method stub
		for(Monster monster : monster_list) {
			if(monster.x == x && monster.y == y) return monster;
		}
		return null;
	}
	private static boolean move_check(int x, int y) {
		// TODO Auto-generated method stub
		if(x > 0 && y > 0 && x <= n && y <= m) {
			if(map[x][y] == '#') return false;
			else return true;
		}else return false;
	}
	private static void createHeroStatus() {
		// TODO Auto-generated method stub
		hero = new Hero(1, 20, 20, 2, 0, 2, 0, 0, 5, 0, false, false, false, false, false, false, false);
	}
	public static void init() throws IOException {
		// TODO Auto-generated method stub
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new char[n + 1][m + 1];
		for(int i = 1; i < n + 1; i++) {
			String line = br.readLine();
			for(int j = 1; j < m + 1; j++) {
				map[i][j] = line.charAt(j - 1);
				if(map[i][j] == '@') {
					hero_x = i;
					hero_y = j;
					hero_start_x = i;
					hero_start_y = j;
					map[i][j] = '.';
				}else if(map[i][j] == '&' || map[i][j] == 'M') {
					monster_count++;
					if(map[i][j] == 'M') {
						boss_x = i;
						boss_y = j;
					}
				}else if(map[i][j] == 'B') {
					box_count++;
				}
			}
		}
		instruction = br.readLine();
		while(monster_count --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			int monster_W = Integer.parseInt(st.nextToken());
			int monster_A = Integer.parseInt(st.nextToken());
			int monster_HP = Integer.parseInt(st.nextToken());
			int monster_EXP = Integer.parseInt(st.nextToken());
			int monster_max_HP = monster_HP;
			monster_list.add(new Monster(x, y, name, monster_W, monster_A, monster_HP, monster_EXP, monster_max_HP));
		}
		while(box_count --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			String WAO = st.nextToken();
			if(WAO.equals("O")) {
				String O = st.nextToken();
				box_list.add(new Box(x, y, WAO, O));
			}else {
				int WA = Integer.parseInt(st.nextToken());
				box_list.add(new Box(x, y, WAO, WA));
			}
		}
	}

}
