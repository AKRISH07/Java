package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<Bike> ls = new ArrayList<Bike>();
		ls.add(new Bike(25,"Yamaha"));
		ls.add(new Bike(35,"Suzuki"));
		ls.add(new Bike(15,"FZ"));
		ls.add(new Bike(65,"Duke"));
		
		Comparator<Bike> cmp = new Comparator<Bike>() {

			@Override
			public int compare(Bike b1,Bike b2) {
				if(b1.getMil()>b2.getMil())
					return 1;
				else
					return -1;
			}
			
		};
		
		Collections.sort(ls,cmp);

		for(Bike str: ls) {
			System.out.println(str);
		}
	}

}
