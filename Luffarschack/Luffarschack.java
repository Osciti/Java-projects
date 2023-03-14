package Luffarschack;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Luffarschack extends JFrame {

	//Det här programmet funkar genom att skapa 9 ruttor sen kollar den om det är spelar 1 eller 2 som kör sen placerar den ett X eller O och markerar ruttan
	//Om 3 ruttor gränsar varandra rakt vinner spelaren med den symbolen

	X x,x2,x3,x4,x5,x6,x7,x8,x9;
	O o,o2,o3,o4,o5,o6,o7,o8,o9;
	int c = 1;
	int c2 = 1;
	int c3 = 1;
	int c4 = 1;
	int c5 = 1;
	int c6 = 1;
	int c7 = 1;
	int c8 = 1;
	int c9 = 1;
	int turn = 9;
	int lx = 0;
	int ly = 0;
	int lx2 = 0;
	int ly2 = 0;
	int w = 5;
	int w2 = 5;
	int w3 = 5;
	int w4 = 5;
	int w5 = 5;
	int w6 = 5;
	int w7 = 5;
	int w8 = 5;
	int w9 = 5;
	int win = 4;
	
	
	public void paint(Graphics g) {
		super.paintComponents(g);
		x.rita(g); x2.rita(g); x3.rita(g); x4.rita(g); x5.rita(g); x6.rita(g); x7.rita(g); x8.rita(g); x9.rita(g);
		o.rita(g); o2.rita(g); o3.rita(g); o4.rita(g); o5.rita(g); o6.rita(g); o7.rita(g); o8.rita(g); o9.rita(g);
		g.setColor(Color.red);
		g.drawLine(lx, ly, lx2, ly2);
		
	}
	private JPanel contentPane;
	private JTextField txf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Luffarschack frame = new Luffarschack();
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
	public Luffarschack() {
		x = new X (0,0,35); x2 = new X (0,0,35); x3 = new X (0,0,35); x4 = new X (0,0,35); x5 = new X (0,0,35); x6 = new X (0,0,35); x7 = new X (0,0,35); x8 = new X (0,0,35); x9 = new X (0,0,35);
		o = new O (0,0,35); o2 = new O (0,0,35); o3 = new O (0,0,35); o4 = new O (0,0,35); o5 = new O (0,0,35); o6 = new O (0,0,35); o7 = new O (0,0,35); o8 = new O (0,0,35); o9 = new O (0,0,35);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 428);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setOpaque(true);
		lbl1.setForeground(new Color(0, 0, 0));
		lbl1.setBackground(new Color(255, 255, 255));
		lbl1.setBounds(50, 50, 70, 70);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setOpaque(true);
		lbl2.setForeground(Color.BLACK);
		lbl2.setBackground(Color.WHITE);
		lbl2.setBounds(160, 50, 70, 70);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setOpaque(true);
		lbl3.setForeground(Color.BLACK);
		lbl3.setBackground(Color.WHITE);
		lbl3.setBounds(270, 50, 70, 70);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("");
		lbl4.setOpaque(true);
		lbl4.setForeground(Color.BLACK);
		lbl4.setBackground(Color.WHITE);
		lbl4.setBounds(50, 160, 70, 70);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("");
		lbl5.setOpaque(true);
		lbl5.setForeground(Color.BLACK);
		lbl5.setBackground(Color.WHITE);
		lbl5.setBounds(160, 160, 70, 70);
		contentPane.add(lbl5);
		
		JLabel lbl6 = new JLabel("");
		lbl6.setOpaque(true);
		lbl6.setForeground(Color.BLACK);
		lbl6.setBackground(Color.WHITE);
		lbl6.setBounds(270, 160, 70, 70);
		contentPane.add(lbl6);
		
		JLabel lbl7 = new JLabel("");
		lbl7.setOpaque(true);
		lbl7.setForeground(Color.BLACK);
		lbl7.setBackground(Color.WHITE);
		lbl7.setBounds(50, 270, 70, 70);
		contentPane.add(lbl7);
		
		JLabel lbl8 = new JLabel("");
		lbl8.setOpaque(true);
		lbl8.setForeground(Color.BLACK);
		lbl8.setBackground(Color.WHITE);
		lbl8.setBounds(160, 270, 70, 70);
		contentPane.add(lbl8);
		
		JLabel lbl9 = new JLabel("");
		lbl9.setOpaque(true);
		lbl9.setForeground(Color.BLACK);
		lbl9.setBackground(Color.WHITE);
		lbl9.setBounds(270, 270, 70, 70);
		contentPane.add(lbl9);
		
		txf = new JTextField();
		txf.setBackground(new Color(255, 255, 255));
		txf.setEditable(false);
		txf.setBounds(50, 21, 290, 19);
		contentPane.add(txf);
		txf.setColumns(10);
		
		JButton btnOmstart = new JButton("Omstart");
		btnOmstart.setEnabled(false);
		btnOmstart.setBounds(230, 355, 110, 19);
		contentPane.add(btnOmstart);
		
		
		
		lbl1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (c == 1) {
					if (turn % 2 == 1) {
						x.sättx(92);
						x.sätty(115);
						repaint();
						w = 1;
					}
					else {
						o.sättx(92);
						o.sätty(115);
						repaint();
						w = 0;
					}
					turn--;
					c--;
				}
			}
		});
		
		lbl2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(c2 == 1){
					if (turn % 2 == 1) {
						x2.sättx(202);
						x2.sätty(115);
						repaint();
						w2 = 1;
					}
					else {
						o2.sättx(202);
						o2.sätty(115);
						repaint();
						w2 = 0;
					}
					turn--;
					c2--;
				}
			}
		});

		lbl3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(c3 == 1){
					if (turn % 2 == 1) {
						x3.sättx(312);
						x3.sätty(115);
						repaint();
						w3 = 1;
					}
					else {
						o3.sättx(312);
						o3.sätty(115);
						repaint();
						w3 = 0;
					}
					turn--;
					c3--;
				}
			}
		});

		lbl4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (c4 == 1) {
					if (turn % 2 == 1) {
						x4.sättx(92);
						x4.sätty(225);
						repaint();
						w4 = 1;
					}
					else {
						o4.sättx(92);
						o4.sätty(225);
						repaint();
						w4 = 0;
					}
					turn--;
					c4--;
				}
			}
		});

		lbl5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (c5 == 1) {
					if (turn % 2 == 1) {
						x5.sättx(202);
						x5.sätty(225);
						repaint();
						w5 = 1;
					}
					else {
						o5.sättx(202);
						o5.sätty(225);
						repaint();
						w5 = 0;
					}
					turn--;
					c5--;
				}
			}
		});

		lbl6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (c6 == 1) {
					if (turn % 2 == 1) {
						x6.sättx(312);
						x6.sätty(225);
						repaint();
						w6 = 1;
					}
					else {
						o6.sättx(312);
						o6.sätty(225);
						repaint();
						w6 = 0;
					}
					turn--;
					c6--;
				}
			}
		});

		lbl7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (c7 == 1) {
					if (turn % 2 == 1) {
						x7.sättx(92);
						x7.sätty(335);
						repaint();
						w7 = 1;
					}
					else {
						o7.sättx(92);
						o7.sätty(335);
						repaint();
						w7 = 0;
					}
					turn--;
					c7--;
				}
			}
		});

		lbl8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (c8 == 1) {
					if (turn % 2 == 1) {
						x8.sättx(202);
						x8.sätty(335);
						repaint();
						w8 = 1;
					}
					else {
						o8.sättx(202);
						o8.sätty(335);
						repaint();
						w8 = 0;
					}
					turn--;
					c8--;
				}
			}
		});

		lbl9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (c9 == 1) {
					if (turn % 2 == 1) {
						x9.sättx(312);
						x9.sätty(335);
						repaint();
						w9 = 1;
					}
					else {
						o9.sättx(312);
						o9.sätty(335);
						repaint();
						w9 = 0;
					}
					turn--;
					c9--;
				}
			}
		});

		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				if (win == 1){
					txf.setText("Spelare 1 Vinst");
					repaint();
					w2 = 4; w4 = 4; w6 = 4; w5 = 4; w8 = 4;
					win = 3;
					btnOmstart.setEnabled(true);
				}
				else if (win == 2){
					txf.setText("Spelare 2 Vinst");
					repaint();
					w2 = 4; w4 = 4; w6 = 4; w5 = 4; w8 = 4;
					win = 3;
					btnOmstart.setEnabled(true);
				}
				if (turn == 0 & win !=3) {
					txf.setText("Oavgjort");
					btnOmstart.setEnabled(true);
				}
					
				if (w == 1 & w2 == 1 & w3 == 1) {
					ly = 115; ly2 = 115;
					lx = 50; lx2 = 360; 
					win = 1;
				}
				else if (w == 0 & w2 == 0 & w3 == 0) {
					ly = 115; ly2 = 115;
					lx = 50; lx2 = 360;
					win = 2;
				}
				if (w4 == 1 & w5 == 1 & w6 == 1) {
					ly = 225; ly2 = 225;
					lx = 50; lx2 = 360; 
					win = 1;
				}
				else if (w4 == 0 & w5 == 0 & w6 == 0) {
					ly = 225; ly2 = 225;
					lx = 50; lx2 = 360;
					win = 2;
				}
				if (w7 == 1 & w8 == 1 & w9 == 1) {
					ly = 335; ly2 = 335;
					lx = 50; lx2 = 360; 
					win = 1;
				}
				else if (w7 == 0 & w8 == 0 & w9 == 0) {
					ly = 335; ly2 = 335;
					lx = 50; lx2 = 360;
					win = 2;
				}
				if (w == 1 & w4 == 1 & w7 == 1) {
					ly = 70; ly2 = 380;
					lx = 92; lx2 = 92; 
					win = 1;
				}
				else if (w == 0 & w4 == 0 & w7 == 0) {
					ly = 70; ly2 = 380;
					lx = 92; lx2 = 92;
					win = 2;
				}
				if (w2 == 1 & w5 == 1 & w8 == 1) {
					ly = 70; ly2 = 380;
					lx = 202; lx2 = 202; 
					win = 1;
				}
				else if (w2 == 0 & w5 == 0 & w8 == 0) {
					ly = 70; ly2 = 380;
					lx = 202; lx2 = 202;
					win = 2;
				}
				if (w3 == 1 & w6 == 1 & w9 == 1) {
					ly = 70; ly2 = 380;
					lx = 312; lx2 = 312; 
					win = 1;
				}
				else if (w3 == 0 & w6 == 0 & w9 == 0) {
					ly = 70; ly2 = 380;
					lx = 312; lx2 = 312;
					win = 2;
				}
				if (w == 1 & w5 == 1 & w9 == 1) {
					ly = 70; ly2 = 380;
					lx = 47; lx2 = 357; 
					win = 1;
				}
				else if (w == 0 & w5 == 0 & w9 == 0) {
					ly = 70; ly2 = 380;
					lx = 47; lx2 = 357;
					win = 2;
				}
				if (w3 == 1 & w5 == 1 & w7 == 1) {
					ly = 380; ly2 = 70;
					lx = 357; lx2 = 47; 
					win = 1;
				}
				else if (w3 == 0 & w5 == 0 & w7 == 0) {
					ly = 380; ly2 = 70;
					lx = 357; lx2 = 47;
					win = 2;
				}
			}
		});

		btnOmstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c = 1;   
				c2 = 1;  
				c3 = 1;  
				c4 = 1;  
				c5 = 1;  
				c6 = 1;  
				c7 = 1;  
				c8 = 1;  
				c9 = 1;  
				turn = 9;
				lx = 0;  
				ly = 0;  
				lx2 = 0; 
				ly2 = 0; 
				w = 5;   
				w2 = 5;  
				w3 = 5;  
				w4 = 5;  
				w5 = 5;  
				w6 = 5;  
				w7 = 5;  
				w8 = 5;  
				w9 = 5;  
				win = 4;
				x.sättx(5000); x2.sättx(5000); x3.sättx(5000); x4.sättx(5000); x5.sättx(5000); x6.sättx(5000); x7.sättx(5000); x8.sättx(5000); x9.sättx(5000); 
				o.sättx(5000); o2.sättx(5000); o3.sättx(5000); o4.sättx(5000); o5.sättx(5000); o6.sättx(5000); o7.sättx(5000); o8.sättx(5000); o9.sättx(5000); 
				repaint();
				btnOmstart.setEnabled(false);
				txf.setText("");
			}
		});
	}
}
