package krypkasino;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class krypkasino extends JFrame {

	private JPanel contentPane;
	private JTextField txfOP;
	private JTextField txfMP;
	private JButton btnTabbeO;
	private JButton btnTabbeM;
	private JLabel lblO;
	private JLabel lblM;
	private JButton btnAnge;
	private JTextField txfO;
	private JTextField txfM;
	private JButton btnBrja;
	private JLabel lblwin;
	int OP,MP,g;
	private JButton btnGräns;
	private JTextField txfGräns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					krypkasino frame = new krypkasino();
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
	public krypkasino() {

	//I det här programmet 

		setTitle("KrypKasino");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblkort = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/krypkasino.jpg")).getImage();
		lblkort.setIcon(new ImageIcon(img));
		lblkort.setBounds(135, 10, 165, 91);
		contentPane.add(lblkort);
		
		txfOP = new JTextField();
		txfOP.setBackground(new Color(255, 255, 255));
		txfOP.setEditable(false);
		txfOP.setHorizontalAlignment(SwingConstants.CENTER);
		txfOP.setFont(new Font("Arial Black", Font.PLAIN, 50));
		txfOP.setBounds(10, 10, 96, 91);
		contentPane.add(txfOP);
		txfOP.setColumns(10);
		
		txfMP = new JTextField();
		txfMP.setBackground(new Color(255, 255, 255));
		txfMP.setEditable(false);
		txfMP.setHorizontalAlignment(SwingConstants.CENTER);
		txfMP.setFont(new Font("Arial Black", Font.PLAIN, 50));
		txfMP.setColumns(10);
		txfMP.setBounds(329, 10, 96, 91);
		contentPane.add(txfMP);
		
		btnTabbeO = new JButton("Tabbe");
		btnTabbeO.setEnabled(false);
		btnTabbeO.setBounds(10, 232, 96, 21);
		contentPane.add(btnTabbeO);
		
		btnTabbeM = new JButton("Tabbe");
		btnTabbeM.setEnabled(false);
		btnTabbeM.setBounds(329, 232, 96, 21);
		contentPane.add(btnTabbeM);
		
		lblO = new JLabel("OT");
		lblO.setForeground(new Color(255, 255, 255));
		lblO.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblO.setBounds(32, 135, 47, 33);
		contentPane.add(lblO);
		
		lblM = new JLabel("MT");
		lblM.setForeground(new Color(255, 255, 255));
		lblM.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblM.setBounds(358, 135, 67, 33);
		contentPane.add(lblM);
		
		btnAnge = new JButton("Ange");
		btnAnge.setEnabled(false);
		btnAnge.setBounds(171, 232, 93, 21);
		contentPane.add(btnAnge);
		
		txfO = new JTextField();
		txfO.setEnabled(false);
		txfO.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txfO.setBounds(135, 182, 36, 19);
		contentPane.add(txfO);
		txfO.setColumns(10);
		
		txfM = new JTextField();
		txfM.setEnabled(false);
		txfM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txfM.setColumns(10);
		txfM.setBounds(264, 182, 36, 19);
		contentPane.add(txfM);
		
		btnBrja = new JButton("Nytt Spel\r\n");
		btnBrja.setBounds(135, 105, 165, 21);
		contentPane.add(btnBrja);
		
		lblwin = new JLabel("");
		lblwin.setForeground(new Color(255, 255, 255));
		lblwin.setHorizontalAlignment(SwingConstants.CENTER);
		lblwin.setBounds(171, 209, 91, 13);
		contentPane.add(lblwin);
		
		btnGräns = new JButton("Gräns");
		btnGräns.setEnabled(false);
		btnGräns.setBounds(135, 130, 165, 21);
		contentPane.add(btnGräns);
		
		txfGräns = new JTextField();
		txfGräns.setEditable(false);
		txfGräns.setHorizontalAlignment(SwingConstants.CENTER);
		txfGräns.setBounds(135, 155, 165, 19);
		contentPane.add(txfGräns);
		txfGräns.setColumns(10);
		
		btnGräns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txfGräns.getText();
				g = Integer.valueOf(text);
				txfGräns.setText("Gränsen är " + g);
				txfGräns.setEditable(false);
				btnGräns.setEnabled(false);
				btnAnge.setEnabled(true);
				btnTabbeO.setEnabled(true);
				btnTabbeM.setEnabled(true);
				txfO.setEnabled(true);
				txfM.setEnabled(true);
			}
		});
		
		btnTabbeO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OP++;
				txfOP.setText(String.valueOf(OP));
			}
		});
		
		btnTabbeM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MP++;
				txfMP.setText(String.valueOf(MP));
			}
		});
		
		btnAnge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txfO.getText();
				String text2 = txfM.getText();
				if (text2.equals("")) {
					OP = Integer.valueOf(text) + OP;
					MP = (11 - Integer.valueOf(text) + MP);
					txfOP.setText(String.valueOf(OP));
					txfMP.setText(String.valueOf(MP));
					txfO.setText("");
					txfM.setText("");
				}
				else if (text.equals("")) {
					OP = (11 - Integer.valueOf(text2) + OP);
					MP = (Integer.valueOf(text2) + MP);
					txfOP.setText(String.valueOf(OP));
					txfMP.setText(String.valueOf(MP));
					txfO.setText("");
					txfM.setText("");
				}
				else if (text != "" && text2 != "") {
					OP = (Integer.valueOf(text) + OP);
					MP = (Integer.valueOf(text2) + MP);
					txfOP.setText(String.valueOf(OP));
					txfMP.setText(String.valueOf(MP));
					txfO.setText("");
					txfM.setText("");
				}
				String txf = txfOP.getText();
				String txf2 = txfMP.getText();
				if (Integer.valueOf(txf) >= g && Integer.valueOf(txf2) < g) {
					lblwin.setText("Martin vinner!");
					txfGräns.setEditable(false);
					btnGräns.setEnabled(false);
					btnAnge.setEnabled(false);
					btnTabbeO.setEnabled(false);
					btnTabbeM.setEnabled(false);
					txfO.setEnabled(false);
					txfM.setEnabled(false);
				}
				else if (Integer.valueOf(txf2) >= g && Integer.valueOf(txf) < g) {
					lblwin.setText("Oscar vinner!");
					txfGräns.setEditable(false);
					btnGräns.setEnabled(false);
					btnAnge.setEnabled(false);
					btnTabbeO.setEnabled(false);
					btnTabbeM.setEnabled(false);
					txfO.setEnabled(false);
					txfM.setEnabled(false);
				}
				else if (Integer.valueOf(txf) >= g && Integer.valueOf(txf2) >= g) {
					lblwin.setText("Båda förlorar!");
					txfGräns.setEditable(false);
					btnGräns.setEnabled(false);
					btnAnge.setEnabled(false);
					btnTabbeO.setEnabled(false);
					btnTabbeM.setEnabled(false);
					txfO.setEnabled(false);
					txfM.setEnabled(false);
				}
			}
		});
		
		btnBrja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OP = 0;
				MP = 0;
				txfGräns.setText("");
				btnGräns.setEnabled(true);
				txfGräns.setEditable(true);
				txfOP.setText(String.valueOf(OP));
				txfMP.setText(String.valueOf(MP));
				lblwin.setText("");
			}
		});
	}

}
