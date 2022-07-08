import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<String> vc = new Vector<String>();
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			String a = sc.next();
			if(!vc.contains(a)) {
				vc.add(a);
			}
		}
		Collections.sort(vc, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length()-o2.length();
                }
			}
			
		});
		for(int i = 0; i < vc.size(); i++) {
			System.out.println(vc.get(i));
		}
	}

}
