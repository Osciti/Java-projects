package Gissa_Mitt_Tal;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Gissa_Mitt_Tal extends JFrame {

	private JPanel contentPane;
	private JTextField txfResultat;
	private JTextField txfDatornsTal;
	private JTextField txfGissa;
	int datornsTal;
	int antalGissningar;
	int max;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gissa_Mitt_Tal frame = new Gissa_Mitt_Tal();
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
    //Places all the components
	public Gissa_Mitt_Tal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBild = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/gissa_tal.png")).getImage();
		lblBild.setIcon(new ImageIcon(img));
		lblBild.setBounds(12, 12, 340, 40);
		contentPane.add(lblBild);
		
		JPanel pnlSpeldata = new JPanel();
		pnlSpeldata.setBorder(new TitledBorder(null, "Speldata", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSpeldata.setBounds(10, 62, 210, 70);
		contentPane.add(pnlSpeldata);
		pnlSpeldata.setLayout(null);
		
		
		JList listMax = new JList();
		JScrollPane scrollableList = new JScrollPane(listMax);
		scrollableList.setLocation(113, 10);
		scrollableList.setSize(87, 22);
		listMax.setSelectedIndices(new int[] {1});
		listMax.setModel(new AbstractListModel() {
			String[] values = new String[] {"10", "20"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listMax.setSelectedIndex(0);
		listMax.setBounds(129, 20, 59, 35);
		pnlSpeldata.add(scrollableList);
		
		JLabel lblStörstaTalet = new JLabel("Största talet");
		lblStörstaTalet.setBounds(23, 12, 80, 13);
		pnlSpeldata.add(lblStörstaTalet);
		
		JPanel pnlSpelet = new JPanel();
		pnlSpelet.setBorder(new TitledBorder(null, "Spelet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSpelet.setBounds(12, 143, 340, 110);
		contentPane.add(pnlSpelet);
		pnlSpelet.setLayout(null);
		
		JLabel lblDator = new JLabel("Datorns tal:");
		lblDator.setBounds(10, 23, 84, 13);
		pnlSpelet.add(lblDator);
		
		JLabel lblGissa = new JLabel("Gissa ett tal:");
		lblGissa.setBounds(10, 46, 84, 13);
		pnlSpelet.add(lblGissa);
		
		txfResultat = new JTextField();
		txfResultat.setEditable(false);
		txfResultat.setBounds(10, 69, 131, 19);
		pnlSpelet.add(txfResultat);
		txfResultat.setColumns(10);
		
		txfDatornsTal = new JTextField();
		txfDatornsTal.setColumns(10);
		txfDatornsTal.setBounds(89, 20, 36, 19);
		pnlSpelet.add(txfDatornsTal);
		
		txfGissa = new JTextField();
		txfGissa.setEnabled(false);
		txfGissa.setColumns(10);
		txfGissa.setBounds(89, 46, 36, 19);
		pnlSpelet.add(txfGissa);
		
		JLabel lblMinaResultat = new JLabel("Mina resultat");
		lblMinaResultat.setBounds(219, 10, 77, 13);
		pnlSpelet.add(lblMinaResultat);
		
		
		JTextArea txaMinaResultat = new JTextArea();
		txaMinaResultat.setEditable(false);
		txaMinaResultat.setWrapStyleWord(true);
		pnlSpelet.add(txaMinaResultat);
		JScrollPane scroll = new JScrollPane(txaMinaResultat);
		scroll.setLocation(219, 25);
		scroll.setSize(111, 75);
		pnlSpelet.add(scroll);
		txaMinaResultat.setBounds(253, 28, 77, 72);
		
        //Låter dig spela igen efter man är klar
		
        JButton btnSpelaIgen = new JButton("Spela igen");
		btnSpelaIgen.setEnabled(false);
		JButton btnGissa = new JButton("Gissa");
		btnGissa.setEnabled(false);
		btnGissa.setBounds(135, 43, 74, 19);
		pnlSpelet.add(btnGissa);
		btnSpelaIgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String störstaTal = listMax.getSelectedValue().toString();
				max = Integer.valueOf(störstaTal);
				java.util.Random slump = new java.util.Random();

                //Slumpar ett tal

				datornsTal = slump.nextInt(max) + 1;
				
				listMax.setEnabled(false);
				
				txfGissa.setEnabled(true);
				btnGissa.setEnabled(true);
				
				txfDatornsTal.setText("??");
				
				antalGissningar = 0;
			}
			
		});
		btnSpelaIgen.setBounds(230, 95, 122, 21);
		contentPane.add(btnSpelaIgen);
		
		
		btnGissa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				antalGissningar++;
				String gissa = txfGissa.getText();
				int gissaTal = Integer.valueOf(gissa);
				
                //Vissar hur många försök det tog

				if (gissaTal == datornsTal) {
					txfResultat.setText("Korrekt efter " + antalGissningar + " försök");
					txfGissa.setEnabled(false);
					btnGissa.setEnabled(false);
					btnSpelaIgen.setEnabled(true);
					listMax.setEnabled(true);
					
					txaMinaResultat.append(antalGissningar + " försök " + max + " max" + "\n");
				}
				else if (gissaTal < datornsTal)
					txfResultat.setText("För lågt. Försök igen.");
				else
					txfResultat.setText("För högt. Försök igen.");
					
			}
		});

		

		JButton btnStartaSpelet = new JButton("Starta Spelet");
		btnStartaSpelet.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				String störstaTal = listMax.getSelectedValue().toString();
				max = Integer.valueOf(störstaTal);
				java.util.Random slump = new java.util.Random();
				datornsTal = slump.nextInt(max) + 1;
				
				btnStartaSpelet.setEnabled(false);
				listMax.setEnabled(false);
				
				txfGissa.setEnabled(true);
				btnGissa.setEnabled(true);
				
				txfDatornsTal.setText("??");
				
				antalGissningar = 0;
				
			}
		});
		btnStartaSpelet.setBounds(230, 62, 122, 21);
		contentPane.add(btnStartaSpelet);
		

	}
}
