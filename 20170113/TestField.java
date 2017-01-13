import java.awt.*;
import javax.swing.*;
public class TestField{
	public static void main(String[] args) {
		TestFieldMan man=new TestFieldMan();
	}
}
class TestFieldMan{
	JFrame frame;
	JButton button;
	JTextField fieldName;
	JPanel fieldPanel;

	public TestFieldMan(){
		frame=new JFrame("TestButton");
		frame.setLocation(400, 400);		
		frame.setSize(500, 500);			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button=new JButton("Click Me");
		fieldName=new JTextField("Aloha",20);
		fieldPanel=new JPanel();

		Container con=frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));

		fieldPanel.add(fieldName);
		fieldPanel.add(button);		

		con.add(fieldPanel);		

		
		frame.setVisible(true);
	}
}