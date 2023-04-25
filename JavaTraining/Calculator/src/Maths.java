import java.io.IOException;

public class Maths{
	 
	public void calculation() throws IOException{
		int operator;		
		int c;
		do {
		operator=Menu.show();
		int result;
		System.out.println("Enter first number");
		int a=BasicInput.readInteger();
		
		System.out.println("Enter second number");
		int b=BasicInput.readInteger();
		
		switch (operator) {	

	      // performs addition between numbers
	      case 1:
	        result = a + b;
	        System.out.println(a + " + " + b + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case 2:
	        result = a - b;
	        System.out.println(a + " - " + b + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case 3:
	        result = a * b;
	        System.out.println(a + " * " + b + " = " + result);
	        break;

	      // performs division between numbers
	      case 4:
	        result = a / b;
	        System.out.println(a + " / " + b + " = " + result);
	        break;
	        
	     // performs cube between numbers
	      case 5:
		        result = a*a*a;
		        System.out.println(a + " Cube " + " = " + result);
		        break;
		        
	      case 6:
		        result = a*b;
		        System.out.println(a + " Square " + " = " + result);
		        break;      
	      
	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
		System.out.println("Enter 7 for continue calculation or Enter 9 to stop calculation");
		c=BasicInput.readInteger();
		}while(c==7);
	}
	
}
