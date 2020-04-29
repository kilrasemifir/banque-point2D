package fr.point;

public class Point2D{

	private static int compteur = 0;
	private int x, y;
	
	//public <CLASSNAME>(<PARAMS>)
	public Point2D() { // Constructeur 1
		this(0,0); // appel Constructeur 2
	}
	
	public Point2D(int x, int y) {// Constructeur 2
		this.x = x;
		this.y = y;
		compteur++;
	}
	
	public Point2D(int x, char y) {
		// TODO
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void translater(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public void afficher() {
		System.out.println("["+this.toString()+"]");
	}
	
	public static int getCompteur() {
		return compteur;
	}
	
	@Override
	public String toString() {
		return "" + x + ", " + y;
	}
	
}
