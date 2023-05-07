import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {
    private TextField firsrtTf;	
	private TextField secondTf;
	private TextField thirdTf;
	public ActionHandler(TextField firstTf, TextField secondTf,TextField thirdTf) {
		this.firsrtTf = firstTf;
		this.secondTf = secondTf;
		this.thirdTf = thirdTf;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	  String firstValue = this.firsrtTf.getText();    
      String secondValue = this.secondTf.getText();
      int firstNumber = Integer.parseInt(firstValue);    
      int secondNumber = Integer.parseInt(secondValue); 
      int result=0;
      if(e.getActionCommand().equals("+")) {

    	  result=firstNumber+secondNumber;
			
		}else if (e.getActionCommand().equals("-")) {
			result=firstNumber-secondNumber;

		}else if (e.getActionCommand().equals("x")) {

			result=firstNumber*secondNumber;
		}else if (e.getActionCommand().equals("/")) {

			result=firstNumber/secondNumber;
		}
       
      String FinalResult = String.valueOf(result);    
      thirdTf.setText(FinalResult);    

	}

}
