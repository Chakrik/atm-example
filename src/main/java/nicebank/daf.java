package nicebank;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class daf {
	public static void main(String args[]) {
		
		 Sample1.getInstance();
		
		int x = 10;
		int y = 25;
		int z = x + y;
		java.util.List list1 = new ArrayList();

		list1.add("banana");
		list1.add("apple");
		list1.add("grapes");

		Iterator iterator = list1.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		File f = null;

		try {
			f.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Null pointer exception");
		}

		System.out.println("Sum of x+y = " + z);
	}
}
