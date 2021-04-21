import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Server extends JFrame {

	private JPanel contentPane;
	private JTextField name1;
	private JTextField name2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name1 = new JTextField();
		name1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		name1.setBounds(104, 50, 237, 31);
		contentPane.add(name1);
		name1.setColumns(10);
		
		name2 = new JTextField();
		name2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		name2.setBounds(104, 134, 237, 31);
		contentPane.add(name2);
		name2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tutor");
		lblNewLabel.setBounds(187, 25, 104, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("Student");
		lblNewLabel2.setBounds(187, 109, 104, 14);
		contentPane.add(lblNewLabel2);
		
		JButton btnNewButton = new JButton("JOIN CHAT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		btnNewButton.setBounds(160, 203, 128, 47);
		contentPane.add(btnNewButton);
	}

	private void createRoom() {
		String p1, p2;
		
		p1 = name1.getText();
		p2 = name2.getText();
		
		if(p1.equals("") || p2.equals("")) {
			JOptionPane.showMessageDialog (null, "Please enter a valid username!");
			return;
		}
		
		Window_1.username1 = name1.getText();
		Window_2.username2 = name2.getText();
		ChatRoom.createRoom();		
	}	
}