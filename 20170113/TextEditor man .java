import java.awt.*;
		import java.awt.event.*;
		import javax.swing.*;
		import java.io.*;

		public class TextEditorMan {
			public static void main(String[] args) {
				TextEditorMan man = new TextEditorMan();
			}
		}


		class TextEditorMan {
			
			JFrame frame;				
			JTextField fileName;		
			JPanel fieldPanel;			

			
			public TextEditorMan() {
		
				frame = new JFrame("TextEditor");
				frame.setLocation(400, 400); 	
				frame.setSize(500, 500);		
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				
				fileName = new JTextField("ALOHA", 10);
				fieldPanel = new JPanel();

				
				fieldPanel.add(fileName);
				frame.setVisible(true);
			}
		}