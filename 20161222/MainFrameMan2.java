import java.awt.*;
 import javax.swing.*;
 public class MainFrameMan2{
 	public static void main(String[] args) {
 		FrameMan fm= new FrameMan();
 	}
 }
 class FrameMan{
 	JFrame frame;
 	JPanel panel;
 	JLabel label;
 	ImageIcon icon;
 	public FrameMan(){
 		System.out.println("Aloha2");
 		frame=new JFrame();
 		frame.setLocation(200,200);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon=new ImageIcon("icon_256.png");
		panel=new JPanel();
		label=new JLabel(icon);
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
 	}
 }