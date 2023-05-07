import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;

public class MyFrame extends Frame {
	
	TextField tf1, tf2, tf3; 
	Label lableTaxfield1,lableTaxfield2,lableTaxfield3;
    Button addButton, subtractButton,MultipyButton,divisonButton;
	public MyFrame(boolean visible,String title,int x,int y,int width,int height) {
		
		this.setVisible(visible);
		this.setTitle(title);
		this.setBounds(x,y,width,height);
		tf1 = new TextField();    
        tf1.setBounds(100,50,80,30);
        lableTaxfield1= new Label("First Number");
        lableTaxfield1.setBounds(100, 25,100 , 30);
        
        tf2 = new TextField();    
        tf2.setBounds(200,50,80,30);
        lableTaxfield2= new Label("Second Number");
        lableTaxfield2.setBounds(200, 25,100 , 30);
        
        tf3 = new TextField();        
        tf3.setBounds(150, 100, 80, 30);  
        tf3.setEditable(false); 
        lableTaxfield3= new Label("Result :");
        lableTaxfield3.setBounds(100, 100,100 , 30);
        addButton = new Button("+");    
        addButton.setBounds(50, 200, 50, 50);  
        subtractButton = new Button("-");    
        subtractButton.setBounds(120, 200, 50, 50);    
        MultipyButton = new Button("x");    
        MultipyButton.setBounds(190, 200, 50, 50);
        divisonButton = new Button("/");    
        divisonButton.setBounds(260, 200, 50, 50);
        
        this.add(tf1);  
        this.add(tf2);  
        this.add(tf3); 
        this.add(lableTaxfield1);
        this.add(lableTaxfield2);
        this.add(lableTaxfield3);
        this.add(addButton);  
        this.add(subtractButton);
        this.add(MultipyButton);  
        this.add(divisonButton);
	    
        setLayout(null); 	
	    	
        addButton.addActionListener(new ActionHandler(tf1,tf2,tf3));
        subtractButton.addActionListener(new ActionHandler(tf1,tf2,tf3));
        MultipyButton.addActionListener(new ActionHandler(tf1,tf2,tf3));
        divisonButton.addActionListener(new ActionHandler(tf1,tf2,tf3));
	    	
	    
		
		this.addWindowListener(new MasterEventHandler());
		this.addMouseListener(new MasterEventHandler());
		//this.addMouseMotionListener(new MasterEventHandler());
	}

}
