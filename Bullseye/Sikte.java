package Bullseye;

import java.awt.Color;
import java.awt.Graphics;

public class Sikte {
	private int x;
	private int y;
	private int r;
	

	public Sikte(int x, int y , int r) {
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
		
		
		g.setColor(Color.pink);
		g.drawOval(x - r, y - r, r*2, r*2);
		g.drawLine(x-r, y, x+r, y);
		g.drawLine(x, y-r, x, y+r);
		
		
		
	}
	
}