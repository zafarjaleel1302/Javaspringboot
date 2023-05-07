import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {
	private TextField firsrtTf;	
	private TextField secondTf;
	private TextField thirdTf;
	ActionHandler(TextField firstTf, TextField secondTf,TextField thirdTf){
		this.firsrtTf = firstTf;
		this.secondTf = secondTf;
		this.thirdTf = thirdTf;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String firstValue=this.firsrtTf.getText();
		String secondValue=this.secondTf.getText();
		String thirdValue=this.thirdTf.getText();
		
		int firstNumber=Integer.parseInt(firstValue);
		int secondNumber=Integer.parseInt(secondValue);
		int thirdNumber=Integer.parseInt(thirdValue);		
		
		int newFirstNumber=0;
		int newsecondNumber=0;
		int newThirdNumber=0;		
		
		if (e.getActionCommand().equalsIgnoreCase("Clock-Wise")) {
				newFirstNumber=firstNumber+1;
				String newFirstValue=String.valueOf(newFirstNumber);
				secondTf.setText(newFirstValue);
				
				newsecondNumber=secondNumber+1;
				String newsecondValue=String.valueOf(newsecondNumber);
				thirdTf.setText(newsecondValue);
				
				newThirdNumber=thirdNumber+1;
				String newThirdValue=String.valueOf(newThirdNumber);
				firsrtTf.setText(newThirdValue);			
				
				
			
		}else if (e.getActionCommand().equalsIgnoreCase("Anti-ClockWise")) {
			newFirstNumber=firstNumber-1;
			String newFirstValue=String.valueOf(newFirstNumber);
			thirdTf.setText(newFirstValue);
			
			newsecondNumber=secondNumber-1;
			String newsecondValue=String.valueOf(newsecondNumber);
			firsrtTf.setText(newsecondValue);
			
			newThirdNumber=thirdNumber-1;
			String newThirdValue=String.valueOf(newThirdNumber);
			secondTf.setText(newThirdValue);
			
		}
		
		
	}

}
