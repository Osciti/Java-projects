package Bullseye;

import java.awt.Color;
import java.awt.Graphics;

public class Board {

	private int x;
	private int y;
	private int r;
	
	public Board(int x, int y , int r) {
		this.x = x;
		this.y = y;
		this.sättradie(r);
	}
	
	public int hämtaradie() {
		return r;
	}
	
	public void sättradie (int r){
		if (r < 0)
			this.r = -r;
		else
			this.r = r;
	}

	public int hämtax(){
		return x;
	}
	
	public void sättx(int x){
			this.x = x;
	}
	
	public int hämtay(){
		return y;
	}
	
	public void sätty(int y){
			this.y = y;
	}
	
public void rita (Graphics g) {
		
		
		g.setColor(Color.WHITE);
		g.fillOval(x - r, y - r, r*2, r*2);
		g.setColor(Color.black);
		g.drawOval(x - r, y - r, r*2, r*2);
		int radie = (int)(r*0.8);
		g.fillOval(x - radie, y - radie, radie*2, radie*2);
		Color purple = new Color(75, 0, 130);
		
		g.setColor(purple);
		radie = (int)(r*0.6);
		g.fillOval(x - radie, y - radie, radie*2, radie*2);
		g.setColor(Color.red);
		radie = (int)(r*0.4);
		g.fillOval(x - radie, y - radie, radie*2, radie*2);
		g.setColor(Color.yellow);
		radie = (int)(r*0.2);
		g.fillOval(x - radie, y - radie, radie*2, radie*2);
		
		
		
	}
	
}