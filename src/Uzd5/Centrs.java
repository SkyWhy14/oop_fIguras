package Uzd5;

public class Centrs {
	
	//Atributi
	public int x,y;
	
	//Konstruktors
	
 	public Centrs(int x, int y) {
 	this.x = x;
 	this.y = y;
 	}
 	
 	//Metodes	
 	public String izvadKoordinatas() {
 		return "Centra punkts atrodas: (x = " + x + ",y = " + y + ")";
 	}
    public void parvietot(int koordX, int koordY) {
		x += koordX;
		y += koordY;
	}
}
