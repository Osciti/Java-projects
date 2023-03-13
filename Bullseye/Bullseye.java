package Bullseye;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.Image;
import java.awt.event.MouseAdapter;


public class Bullseye extends JFrame {

    //Klasserna Hit och sikte använder vi oss för att kunna följa musen och skuta

	int radie;
	Board mål;
	Sikte sikte;
	Hit Hit1,Hit2,Hit3,Hit4,Hit5;
	int ammo = 5;
	private Image dbImage;
	private Graphics dbg;
	private JPanel contentPane;
	private JTextField txfRadie;
	private JTextField txfAmmo;
	private JTextField txfPoäng;
	private JLabel lblPong;
	
	
	public void paint (Graphics g) {
		dbImage = createImage(getWidth(), getHeight());
		dbg = dbImage.getGraphics();
		paintComponent(dbg);
		g.drawImage(dbImage, 0, 0, this);
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponents(g);
		
		
		mål.rita(g);
		sikte.rita(g);
		if (Hit1 != null)Hit1.rita(g);
		if (Hit2 != null)Hit2.rita(g);
		if (Hit3 != null)Hit3.rita(g);
		if (Hit4 != null)Hit4.rita(g);
		if (Hit5 != null)Hit5.rita(g);
		
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bullseye frame = new Bullseye();
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
	public Bullseye() {
		
		mål = new Board(210, 115, 0);
		sikte = new Sikte (0 ,0 ,20);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txfRadie = new JTextField();
		txfRadie.setBounds(132, 219, 96, 19);
		contentPane.add(txfRadie);
		txfRadie.setColumns(10);
		
		JButton btnRadie = new JButton("Sätt radie");
		btnRadie.setBounds(257, 218, 101, 21);
		contentPane.add(btnRadie);
		
		txfAmmo = new JTextField();
		txfAmmo.setHorizontalAlignment(SwingConstants.CENTER);
		txfAmmo.setFont(new Font("Arial Black", Font.PLAIN, 30));
		txfAmmo.setText(String.valueOf(ammo));
		txfAmmo.setEditable(false);
		txfAmmo.setBounds(10, 213, 65, 54);
		contentPane.add(txfAmmo);
		txfAmmo.setColumns(10);
		
		JLabel lblAmmoCount = new JLabel("Ammo count");
		lblAmmoCount.setBounds(77, 238, 87, 19);
		contentPane.add(lblAmmoCount);
		
		txfPoäng = new JTextField();
		txfPoäng.setFont(new Font("Arial Black", Font.PLAIN, 21));
		txfPoäng.setEditable(false);
		txfPoäng.setColumns(10);
		txfPoäng.setBounds(371, 13, 55, 45);
		contentPane.add(txfPoäng);
		
		lblPong = new JLabel("Poäng");
		lblPong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPong.setBounds(318, 26, 55, 29);
		contentPane.add(lblPong);
		
		sikte = new Sikte (0 ,0 ,20);
		btnRadie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mål.sättradie(Integer.valueOf(txfRadie.getText()));
				repaint();
				ammo = 5;
				txfAmmo.setText(String.valueOf(ammo));
				Hit1 = new Hit(0,0,0);
				Hit2 = new Hit(0,0,0);
				Hit3 = new Hit(0,0,0);
				Hit4 = new Hit(0,0,0);
				Hit5 = new Hit(0,0,0);
				
				txfPoäng.setText("");
			}
		});
		
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				
				sikte.sättx(e.getX()+6);
				sikte.sätty(e.getY()+30);
				
				repaint();
			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (ammo == 5) {
				Hit1 = new Hit(e.getX()+6, e.getY()+30, 6);
				repaint();
				ammo--;
				}
				else if (ammo == 4) {
					Hit2 = new Hit(e.getX()+6, e.getY()+30, 6);
					repaint();
					ammo--;
					}
				else if (ammo == 3) {
					Hit3 = new Hit(e.getX()+6, e.getY()+30, 6);
					repaint();
					ammo--;
					}
				else if (ammo == 2) {
					Hit4 = new Hit(e.getX()+6, e.getY()+30, 6);
					repaint();
					ammo--;
					}
				else if (ammo == 1) {
					Hit5 = new Hit(e.getX()+6, e.getY()+30, 6);
					repaint();
					ammo--;
					}
				txfAmmo.setText(String.valueOf(ammo));
				if (ammo == 0)
					txfPoäng.setText("800");
					
				
			}
		});
	}
}
