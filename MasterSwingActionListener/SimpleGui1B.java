import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener{
	JButton jButton;
		public static void main(String[] args){
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
	}
public void go(){
	JFrame frame = new JFrame();
	jButton = new JButton("Click me");

	jButton.addActionListener(this);

	frame.getContentPane().add(jButton);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,300);
	frame.setVisible(true);
	}
public void actionPerformed(ActionEvent event){
	jButton.setText("I've been clicked!");
	}
}