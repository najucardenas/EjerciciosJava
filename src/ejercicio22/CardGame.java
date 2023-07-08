package ejercicio22;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class CardGame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardGame frame = new CardGame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CardGame() {
		setBackground(new Color(153, 102, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\juan\\Pictures\\ico1.jpg"));
		setTitle("Juego de Cartas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 429);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 102, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 74, 131);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(246, 11, 74, 131);
		contentPane.add(textArea_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(458, 11, 74, 131);
		contentPane.add(textArea_1_1);
		
		JTextArea textArea_1_1_1 = new JTextArea();
		textArea_1_1_1.setBounds(458, 248, 74, 131);
		contentPane.add(textArea_1_1_1);
		
		JTextArea textArea_1_2 = new JTextArea();
		textArea_1_2.setBounds(246, 248, 74, 131);
		contentPane.add(textArea_1_2);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(10, 248, 74, 131);
		contentPane.add(textArea_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 0));
		panel.setBounds(10, 153, 527, 84);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 153, 255));
		panel_1.setBounds(542, 0, 90, 390);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 56, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("    Jugadores");
		lblNewLabel.setBounds(0, 11, 86, 34);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Jugar");
		btnNewButton.setBounds(0, 87, 89, 23);
		panel_1.add(btnNewButton);
	}
}
