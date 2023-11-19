package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		set1.add("A");
		set1.add("B");
		set1.add("Y");
		set1.add("Z");
		set1.add(null);
		set1.add("Vikas");
		System.out.println(set1);
		/*Set<String> set2 = new HashSet<String>();
		set2.add(new Employee(103,"Vikas",7000));
		set2.add(new Employee(104,"Alex",8000));
		set2.add(new Employee(105,"Vicky",9000));
		set2.add(new Employee(106,"Teja",0000));*/
		
		Set<Integer> set3 = new LinkedHashSet<Integer>();
		set3.add(100);
		set3.add(101);
		set3.add(102);
		System.out.println(set3);
		
		
	}

}
