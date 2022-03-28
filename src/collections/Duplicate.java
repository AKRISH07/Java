package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Duplicate {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Elements: ");
		String[] str = br.readLine().split(" ");
		ArrayList<String> al = new ArrayList<String>();
		for (int x = 0; x < str.length; x++) {
			al.add(str[x]);
		}

		System.out.println(al.get(0) + " " + al.get(al.size() - 1));
		HashSet<String> hs = new HashSet<String>();
		for (String val : al) {
			hs.add(val);
		}

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
