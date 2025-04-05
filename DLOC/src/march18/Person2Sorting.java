package march18;

import java.util.Comparator;

public class Person2Sorting implements Comparator<Person2>{
public int compare(Person2 p1, Person2 p2) {
	return p1.getName().compareTo(p2.getName());
}

}
class Person2SortingByAge implements Comparator<Person2>{
public int compare(Person2 p1, Person2 p2) {
	return p1.getAge()-p2.getAge();
}

class main{

	public static void main(String[] args) {
		List<Person> person = new ArrayList<Person>(Arrays.asList(new Person("abc",22,56.4),
				new Person("def",21,66.4),
				new Person("ghi",26,26.4),
				new Person("klm",23,76.4)));
//		person.add(new Person("abhi",22,60.0));
		System.out.println(person);
		Collections.sort(person);
		System.out.println(person);
		
	}
}
}

