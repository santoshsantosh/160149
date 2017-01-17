import java.awt.*;
		import java.awt.event.*;
		import javax.swing.*;
		import java.io.*;

		public class TextEditor {
			public static void main(String[] args) {
				TextEditorMan man = new TextEditorMan();
			}
		}

		class TextEditorMan {
			JFrame frame;			
			public TextEditorMan() {
			
				frame = new JFrame("TextEditor");
				frame.setLocation(400, 400); 	
				frame.setSize(500, 500);		
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			
				frame.setVisible(true);
			}
		}