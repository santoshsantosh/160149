import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 public class MainFrameMan3{
 	public static void main(String[] args) {
 		FrameMan fm= new FrameMan();
 	}
 }
 class FrameMan implements ActionListener{
 	JFrame frame;
 	JPanel panel;
 	JLabel label;
 	JButton button;
 	int num=0;
 	public FrameMan(){
 		openWindow();
 	}
 	private void openWindow(){
 		
 		frame=new JFrame();
 		frame.setLocation(200,200);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		label=new JLabel("Namaste");
		button=new JButton("ClickMe!");
		button.addActionListener(this);
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
 	}
 	public void actionPerformed(ActionEvent e){
 		if(num%2==0){
       		label.setText("Namaste");
 		}else{
 			label.setText("Hello");
 		}
 		num++;
 	}
 }