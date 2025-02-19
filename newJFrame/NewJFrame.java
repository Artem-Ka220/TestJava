import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NewJFrame implements ActionListener{
JButton button;
	public static void main(String[] args){
		NewJFrame newJFrame = new NewJFrame();
		newJFrame.go();
	}

public void go(){
	JFrame frame = new JFrame();
	button = new JButton("Click me");
		button.addActionListener(this);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
	frame.setBackground(Color.BLACK);
		frame.setSize(300, 300);
	frame.setVisible(true);
	}

public void actionPerformed(ActionEvent event){
	button.setText("I've been clicked!");
	}
}