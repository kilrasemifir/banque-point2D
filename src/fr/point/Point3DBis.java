package fr.point;

public class Point3DBis {

	private int z;
	private Point2D point2D;
	
	public Point3DBis(int x, int y, int z) {
		this.z = z;
		this.point2D = new Point2D(x,y);
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public int getX() {
		return this.point2D.getX();
	}

	public void setX(int x) {
		this.point2D.setX(x);
	}
	
	public int getY() {
		return this.point2D.getY();
	}

	public void setY(int y) {
		this.point2D.setY(y);
	}
	
	public void translater(int dx, int dy, int dz) {
		this.point2D.translater(dx, dy);
		this.z += dz;
	}
	
	public void afficher() {
		System.out.println("[" + this.toString() + "]");
	}
	
	public String toString() {
		return this.point2D.toString() + ", " + this.z;
	}
	
}
