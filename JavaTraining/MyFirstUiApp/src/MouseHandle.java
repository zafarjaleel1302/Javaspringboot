import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandle implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		MyFrame mf=(MyFrame)e.getSource();
		System.out.println("Mouse Got Click "+mf.getTitle());

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
