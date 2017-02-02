import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exam1{
	public static void main(String[] args) {
		Exam2 man = new Exam2();
	}
}


class Exam2 implements ActionListener {

	ImageIcon thumb;
	ImageIcon thumb1;
	JFrame frame;					
	JButton button;					
			
	
	JLabel label;
	JPanel panel;

				

	public Exam2(){
		frame = new JFrame("Exam1");
		frame.setLocation(400, 400);		
		frame.setSize(500, 500);			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		thumb = new ImageIcon("thumb.jpg");
		thumb1 = new ImageIcon("thumb1.jpg");
		

			
			label = new JLabel(thumb);
			panel = new JPanel();
			button= new JButton("Click Me");
			button.addActionListener(this);
			button.setActionCommand("open");

		Container con = frame.getContentPane();
		
		panel.add(label);
		panel.add(button);
		con.add(panel);
		
		
		frame.setVisible(true);
			
	}

	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();

		if(cmd.equals("open")){

			label.setIcon(thumb);
			label.setIcon(thumb1);

		}

			
	}
}