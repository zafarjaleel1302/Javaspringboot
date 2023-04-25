import java.io.IOException;

public class BasicInput {
	public static String readString() throws IOException {
		byte b[]=new byte[255];
		int length=System.in.read(b);
		byte bt[]=new byte[length-2];
		System.arraycopy(b, 0, bt, 0, length-2);
		String s=new String (bt);
		return s;
				
	}
	public static float readFloat() throws IOException {
		String s= readString();
		float f=Float.parseFloat(s);
		return f;
	}
	
	public static int readInteger() throws IOException {
		String s=readString();
		int i=Integer.parseInt(s);
		return i;
	}

}
