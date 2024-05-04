package tp3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class GUIAdmin {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIAdmin window = new GUIAdmin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 387, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 59, 348, 281);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search Book by author:");
		lblNewLabel.setBounds(36, 23, 113, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(150, 20, 113, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Book list:");
		lblNewLabel_1.setBounds(33, 61, 46, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("search");
		btnNewButton.setBounds(273, 19, 65, 23);
		panel.add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(36, 86, 263, 159);
		panel.add(list);
		
		JLabel lblNewLabel_2 = new JLabel("Admin");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(149, 11, 114, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("add book");
		btnNewButton_1.setBounds(29, 371, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("delete book");
		btnNewButton_2.setBounds(128, 371, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
