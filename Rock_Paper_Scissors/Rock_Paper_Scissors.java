package Rock_Paper_Scissors;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rock_Paper_Scissors extends JFrame {

	private JPanel contentPane;
	private JTextField txfDator;
	private JTextField txfResultat;
	int dator,spelare;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rock_Paper_Scissors frame = new Rock_Paper_Scissors();
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
	public Rock_Paper_Scissors() {
		setTitle("Sten sax påse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/Boulder.png")).getImage();
		Image img3 = new ImageIcon(this.getClass().getResource("/Scissor.png")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/Påse.png")).getImage();
		
		JPanel spel = new JPanel();
		spel.setBackground(new Color(255, 128, 255));
		spel.setBorder(new TitledBorder(null, "Sten, sax eller p\u00E5se", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		spel.setBounds(33, 27, 419, 355);
		contentPane.add(spel);
		spel.setLayout(null);
		
		JButton btnSten = new JButton("");
		btnSten.setEnabled(false);
		btnSten.setBounds(15, 15, 120, 120);
		spel.add(btnSten);
		btnSten.setBackground(new Color(196, 128, 60));
		btnSten.setIcon(new ImageIcon(img));
		
		JButton btnSax = new JButton("");
		btnSax.setEnabled(false);
		btnSax.setBounds(150, 15, 120, 120);
		spel.add(btnSax);
		btnSax.setBackground(new Color(255, 0, 0));
		btnSax.setIcon(new ImageIcon(img3));
		
		JButton btnPåse = new JButton("");
		btnPåse.setEnabled(false);
		btnPåse.setBounds(285, 15, 120, 120);
		spel.add(btnPåse);
		btnPåse.setBackground(new Color(255, 255, 255));
		btnPåse.setIcon(new ImageIcon(img2));
		
		JLabel lblDatornValde = new JLabel("Datorn valde");
		lblDatornValde.setBounds(39, 237, 96, 19);
		spel.add(lblDatornValde);
		
		txfDator = new JTextField();
		txfDator.setEditable(false);
		txfDator.setBounds(117, 237, 177, 19);
		spel.add(txfDator);
		txfDator.setColumns(10);
		
		txfResultat = new JTextField();
		txfResultat.setEditable(false);
		txfResultat.setColumns(10);
		txfResultat.setBounds(39, 290, 307, 19);
		spel.add(txfResultat);
		
		JPanel result = new JPanel();
		result.setBackground(new Color(255, 128, 255));
		result.setBorder(new TitledBorder(null, "Mina Resultat", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		result.setBounds(487, 160, 289, 226);
		contentPane.add(result);
		result.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setWrapStyleWord(true);
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setLocation(10, 24);
		scroll.setSize(269, 192);
		textArea.setBounds(10, 20, 269, 196);
		result.add(scroll);
		
		JButton btnSpela = new JButton("Spela");
		btnSpela.setBounds(520, 27, 85, 21);
		contentPane.add(btnSpela);
		
		btnSten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spelare = 1;
				if (dator == 1) {
					txfDator.setText("Sten");
					txfResultat.setText("Oavgjort");
					textArea.append("Oavgjort\n");
					
					}
				else if (dator == 2) {
					txfDator.setText("Sax");
					txfResultat.setText("You win");
					textArea.append("You win\n");
					}
				else if (dator == 3) {
					txfDator.setText("Påse");
					txfResultat.setText("You lose");
					textArea.append("You lose\n");
					}
				btnSten.setEnabled(false);
				btnSax.setEnabled(false);
				btnPåse.setEnabled(false);
				btnSpela.setEnabled(true);
			}
		});
		
		btnSax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spelare = 2;
				if (dator == 1) {
					txfDator.setText("Sten");
					txfResultat.setText("You lose");
					textArea.append("You lose\n");
					
					}
				else if (dator == 2) {
					txfDator.setText("Sax");
					txfResultat.setText("Oavgjort");
					textArea.append("Oavgjort\n");
					}
				else if (dator == 3) {
					txfDator.setText("Påse");
					txfResultat.setText("You win");
					textArea.append("You win\n");
					}
				btnSten.setEnabled(false);
				btnSax.setEnabled(false);
				btnPåse.setEnabled(false);
				btnSpela.setEnabled(true);
			}
		});
		
		btnPåse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spelare = 3;
				if (dator == 1) {
					txfDator.setText("Sten");
					txfResultat.setText("You win");
					textArea.append("You win\n");
					
					}
				else if (dator == 2) {
					txfDator.setText("Sax");
					txfResultat.setText("You lose");
					textArea.append("You lose\n");
					}
				else if (dator == 3) {
					txfDator.setText("Påse");
					txfResultat.setText("Oavgjort");
					textArea.append("Oavgjort\n");
					}
				btnSten.setEnabled(false);
				btnSax.setEnabled(false);
				btnPåse.setEnabled(false);
				btnSpela.setEnabled(true);
			}
		});
		
		btnSpela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSten.setEnabled(true);
				btnSax.setEnabled(true);
				btnPåse.setEnabled(true);
				btnSpela.setEnabled(false);
				txfResultat.setText("");
				txfDator.setText("");
				dator = (int)(1+Math.random()*3);
			}
		});
	}
}
