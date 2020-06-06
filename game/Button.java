package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton implements ActionListener{
	private int pointValue;
	boolean isActive;
	public Button(int pointValue) {
		this.pointValue = pointValue;
		setText(String.valueOf(pointValue));
		isActive = true;
		
	}
	public int getPointValue() {
		return pointValue;
	}
	public void setPointValue(int pValue) {
		pointValue = pValue;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean active) {
		isActive = active;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
}
