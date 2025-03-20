spackage march18;

public class Person implements Comparable<Person>{
String name;
int age;
double weight;
public Person(String name, int age, double weight) {
	super();
	this.name = name;
	this.age = age;
	this.weight = weight;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
}
public int compareTo(Person other) {
	return this.age-other.age;
}

}
