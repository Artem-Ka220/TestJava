import javax.swing.*;

public class SimpleGui1{
	public static void main(String[] args){
		JFrame frame = new JFrame();
			JButton jButton = new JButton("click me");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(jButton);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}