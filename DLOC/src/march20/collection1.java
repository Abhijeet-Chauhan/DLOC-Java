package march20;

import java.util.TreeSet;
public class collection1  implements Comparable {

		String name;
		int id;
		int salary;

		collection1(String name, int id, int salary){
			this.name = name;
			this.id = id;
			this.salary = salary;
		}
		@Override
		public int compareTo(collection1 other)
		{	collection1 emp = (collection1)other;
			return this.salary-other.salary;
		}
		
		public String toString() {
			return "("+name+": "+id+": "+salary+":)";
		}
		
		public static void main(String[] args) {
			TreeSet set = new TreeSet();
			set.add(new collection1("abhi",1,10000));
			set.add(new collection1("om",2,20000));
			System.out.println(set);
		
		}
}
