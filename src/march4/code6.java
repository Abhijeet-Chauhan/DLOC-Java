package march4;
@FunctionalInterface
public interface code6 {
	public void squareIT(int i);
}

class H6{
	public static void main(String[] args) {
		code6 h=(i)->System.out.println("sqare"+(i*i));
		h.squareIT(4);
	}
}
