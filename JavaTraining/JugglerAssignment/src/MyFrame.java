import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame {
	TextField textField1,textField2,textField3;
	Button BtnclockWise,BtnAnitclockWise;
	public MyFrame(boolean visible,String title,int x,int y,int width,int height) {
		
		this.setVisible(visible);
		this.setTitle(title);
		this.setBounds(x,y,width,height);
		this.
		
		textField1 = new TextField();    
		textField1.setBounds(100,50,80,30);
		
		textField2 = new TextField();    
		textField2.setBounds(250,50,80,30);
		
		textField3 = new TextField();    
		textField3.setBounds(175, 100, 80, 30);
		
		BtnclockWise= new Button("Clock-Wise");
		BtnclockWise.setBounds(100,200,80,30);
		
		BtnAnitclockWise= new Button("Anti-ClockWise");
		BtnAnitclockWise.setBounds(250,200,90,30);
		
		
		this.add(textField1);
		this.add(textField2);
		this.add(textField3);
		this.add(BtnclockWise);
		this.add(BtnAnitclockWise);
		
		setLayout(null); 
		
		this.addWindowListener(new MasterEventHandler());
		BtnclockWise.addActionListener(new ActionHandler(textField1,textField2,textField3));
		BtnAnitclockWise.addActionListener(new ActionHandler(textField1,textField2,textField3));
		
	}

}
