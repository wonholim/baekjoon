import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Human> vc = new Vector<Human>();
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			Human h = new Human();
			h.age = sc.nextInt();
			h.name = sc.next();
			vc.add(h);
		}
		Collections.sort(vc, new aging());
		for(int k = 0; k < vc.size(); k++) {
			System.out.println(vc.get(k).age + " " + vc.get(k).name);
		}

	}

}
	class Human {
		int age;
		String name;
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	class aging implements Comparator<Human>{

		@Override
		public int compare(Human o1, Human o2) {
			// TODO Auto-generated method stub
			return ((Human)o1).age < ((Human)o2).age ? -1 : (((Human)o1).age == ((Human)o2).age ? 0 : 1);
		}
		
	}

