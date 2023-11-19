package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list =new ArrayList<Object>();
		list.add(100);
		list.add(2.2);
		list.add(new String("Two"));
		list.add(new ListDemo());
		
		System.out.println(list);
		
		List<Integer> list2 =new ArrayList<Integer>();
		list2.add(100);
		//list2.add(2.2);
		list2.add(1);
		//list2.add("vikas");
		System.out.println("Using for to print");
		for(Integer i: list2) {
			System.out.println(i);
		}
		System.out.println("Iterator");
		
		Iterator it = list2.iterator();
		while (it.hasNext()) {
			Integer in = (Integer) it.next();
			System.out.println(in);
			
		}
		
		

		

	}

}
