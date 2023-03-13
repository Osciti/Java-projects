
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class High_low extends JFrame {
// creates 6 text fields for the dye 
	private JPanel contentPane;
	private JTextField txf1;
	private JTextField txf2;
	private JTextField txf3;
	private JTextField txf4;
	private JTextField txf5;
	private JTextField txf6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					High_low frame = new High_low();
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
	public High_low() {
        //Randomizes the dye then print out onto the text fields
		setTitle("High_low");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lbldye = new JLabel("");
		lbldye.setBounds(173, 10, 103, 108);
		Image img = new ImageIcon(this.getClass().getResource("/Yatzy.png")).getImage();
		contentPane.setLayout(null);
		lbldye.setIcon(new ImageIcon(img));
		contentPane.add(lbldye);
		
		JButton btnRoll = new JButton("Roll");
		btnRoll.setBounds(178, 232, 85, 21);
		btnRoll.setForeground(new Color(255, 255, 255));
		btnRoll.setBackground(new Color(0, 0, 0));
		btnRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dye1,dye2,dye3,dye4,dye5 = 0;
				dye1 = (int)(1+Math.random()*6);
				dye2 = (int)(1+Math.random()*6);
				dye3 = (int)(1+Math.random()*6);
				dye4 = (int)(1+Math.random()*6);
				dye5 = (int)(1+Math.random()*6);
				
				txf1.setText(String.valueOf(dye1));
				txf2.setText(String.valueOf(dye2));
				txf3.setText(String.valueOf(dye3));
				txf4.setText(String.valueOf(dye4));
				txf5.setText(String.valueOf(dye5));
				txf6.setText(String.valueOf(dye1 + dye2 + dye3 + dye4 + dye5));
			}
		});
		contentPane.add(btnRoll);
		
		txf1 = new JTextField();
		txf1.setBounds(131, 127, 31, 19);
		txf1.setFont(new Font("Arial Black", Font.PLAIN, 10));
		txf1.setBackground(new Color(255, 255, 255));
		txf1.setEditable(false);
		contentPane.add(txf1);
		txf1.setColumns(10);
		
		txf2 = new JTextField();
		txf2.setBounds(171, 127, 31, 19);
		txf2.setFont(new Font("Arial Black", Font.PLAIN, 10));
		txf2.setBackground(new Color(255, 255, 255));
		txf2.setEditable(false);
		txf2.setColumns(10);
		contentPane.add(txf2);
		
		txf3 = new JTextField();
		txf3.setBounds(291, 127, 31, 19);
		txf3.setFont(new Font("Arial Black", Font.PLAIN, 10));
		txf3.setBackground(new Color(255, 255, 255));
		txf3.setEditable(false);
		txf3.setColumns(10);
		contentPane.add(txf3);
		
		txf4 = new JTextField();
		txf4.setBounds(211, 127, 31, 19);
		txf4.setFont(new Font("Arial Black", Font.PLAIN, 10));
		txf4.setBackground(new Color(255, 255, 255));
		txf4.setEditable(false);
		txf4.setColumns(10);
		contentPane.add(txf4);
		
		txf5 = new JTextField();
		txf5.setBounds(251, 127, 31, 19);
		txf5.setFont(new Font("Arial Black", Font.PLAIN, 10));
		txf5.setBackground(new Color(255, 255, 255));
		txf5.setEditable(false);
		txf5.setColumns(10);
		contentPane.add(txf5);
		
		txf6 = new JTextField();
		txf6.setBounds(201, 171, 49, 19);
		txf6.setFont(new Font("Arial Black", Font.PLAIN, 10));
		txf6.setBackground(new Color(255, 255, 255));
		txf6.setEditable(false);
		txf6.setColumns(10);
		contentPane.add(txf6);
	}

}
