import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window_1 extends JFrame {

	static String username1;
	private JPanel contentPane;

	/**
	 * This code starts the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_1 frame = new Window_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Design the frame. // Edit the frame
	 */
	public Window_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display1 = new JTextArea();
		display1.setBounds(0, 22, 300, 272);
		contentPane.add(display1);
		
		text1 = new JTextArea();
		text1.setBounds(0, 343, 210, 72);
		contentPane.add(text1);
		
		send1 = new JButton("SEND");
		send1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s = text1.getText();
				if (s.equals("")) {
					return;			
				}
				display1.append(username1 + ":" + s + "\n" );
				Window_2.sendText();
				text1.setText("");	
			}
		});
		send1.setBounds(211, 344, 89, 71);
		contentPane.add(send1);
		
		label1 = new JLabel("Chat window for: " + username1);
		label1.setBounds(0, 0, 197, 22);
		contentPane.add(label1);
		
		JButton clear = new JButton("CLEAR");		
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display1.setText("");
			}
		});
		clear.setBounds(201, 0, 89, 23);
		contentPane.add(clear);
		
		// Square Function
		JButton squareFunction = new JButton("Square Function");
		squareFunction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String enterArea = text1.getText() + squareFunction.getText();
				text1.setText("Area of a Square: A = s²\n"
						+ "Perimeter of a Square: P = 4s\n"
						+ "where s is the side of the square");				
			}					
		});
		squareFunction.setBounds(0, 297, 89, 23);
		contentPane.add(squareFunction);
		
		// Rectangle Function
		JButton rectangleFunction = new JButton("Rectangle Function");
		rectangleFunction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText("Area of a Rectangle: A = ab\n"
						+ "Perimeter of a Rectangle: P = 2a + 2b\n"
						+ "where a is the longer side and b is the short side");			
			}
		});
		rectangleFunction.setBounds(89, 297, 89, 23);
		contentPane.add(rectangleFunction);
		
		//Circle Function
		JButton circleFunction = new JButton("Circle Function");
		circleFunction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText("Area of a Circle: A = PI*r²\n"
						+ "Perimeter of a Circle: P = 2*PI*r\n"
						+ "where PI = 22/7 and r is the radius of a circle");			
			}
		});
		circleFunction.setBounds(178, 297, 89, 23);
		contentPane.add(circleFunction);
		
		//Triangle Function
		JButton triangleFunction = new JButton("Triangle Function");
		triangleFunction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText("Area of a Triangle: A = ½bh\n"
						+ "Perimeter of a Circle: P = a+b+c\n"
						+ "where a,b,c are the sides of the triangle\n and h is the perpendicular height");			
			}
		});		
		triangleFunction.setBounds(0, 319, 89, 23);
		contentPane.add(triangleFunction);
		
		//Parallelogram Function
		JButton parallelogramFunction = new JButton("Parallelogram Function");
		parallelogramFunction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText("Area of a Parallelogram: A = bh\n"
						+ "Perimeter of a Parallelogram: P = 2a+2b\n"
						+ "where a,b are the sides of the parallelogram\n and h is the perpendicular height");			
			}
		});				
		parallelogramFunction.setBounds(89, 319, 89, 23);
		contentPane.add(parallelogramFunction);
		
		// Pythagorean Throrem		
		JButton pythagoreanTheorem = new JButton("Pythagorean Theorem");		
		pythagoreanTheorem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText("Area of a Parallelogram: A = bh\n"
						+ "Pythagorean Theorem: realates to a right angle triangle \n"
						+ "with sides a,b,c, where \n"
						+ "a is the vertial height, \n"
						+ "b is the horizontal length and \n"
						+ "c is the slope. \n"
						+ "The theorem defines that a²+b²=c² and \n"
						+ "c is equal to the square root of (a²+b²)");			
			}
		});						
		pythagoreanTheorem.setBounds(178, 319, 89, 23);
		contentPane.add(pythagoreanTheorem);
		
	}


	public static void sendText() {
		String s = Window_2.text2.getText();
		if (s.equals("")) {
			return;			
		}
		display1.append(Window_2.username2 + ":" + s + "\n" );
	}
		
	private javax.swing.JLabel label1;
	private static javax.swing.JTextArea display1;
	private javax.swing.JButton send1;
	public static javax.swing.JTextArea text1;
	private JButton triangleFunction;
	private JButton parallelogramFunction;
}
