import java.io.IOException;

public class Menu {
	
	public static int show() throws IOException {
		
		System.out.println("Please enter your choice to perform maths operation");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divison");
		System.out.println("5.Square");
		System.out.println("6.Cube");
		
		return BasicInput.readInteger();
		
		
	}
	

}
