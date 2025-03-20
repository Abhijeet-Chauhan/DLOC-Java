package march18;


public class PersonSorting {
public static void main(String[] args) {
	List<Person> person = new ArrayList<Person>(Arrays.asList(new Person("abc",22,56.4),
			new Person("def",21,66.4),
			new Person("ghi",26,26.4),
			new Person("klm",23,76.4)));
//	person.add(new Person("abhi",22,60.0));
	System.out.println(person);
	Collections.sort(person);
	System.out.println(person);
	
}
}
