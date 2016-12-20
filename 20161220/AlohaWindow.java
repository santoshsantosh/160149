 import java.awt.*;
 import javax.swing.*;
 public class AlohaWindow{
 public static void main(String[] args) {
	JFrame frame=new JFrame();
	frame.setSize(400,400);
	frame.setTitle("Sharma Santosh");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(new FlowLayout());
	JLabel label=new JLabel("HELLO");
	Container ctnr=frame.getContentPane();
	ctnr.add(label);
	JButton button=new JButton("CLICKMe");
	ctnr.add(button);
	frame.setVisible(true);
}
}
