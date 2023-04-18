
public class Entrypoint {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int a=30;
		int b=20;
		Maths m=new Maths();
		m.add(a, b);
		m.multiply(a, b);
		m.subtract(a, b);
		m.divide(a, b);
		m.square(a);
		m.cube(a);

	}

}
