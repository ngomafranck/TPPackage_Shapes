package co.simplon.shapes;

import java.awt.Point;

public abstract class Circle {
	private static final char[] Point = null;
	private Point centre;// centre du cercle
	private double x;  // abscisse du centre
	private double y;  // ordonnée du centre
	private double rayon; // rayon du cercle
	public Circle() {
		super();
		rayon=0;
		x=0;
		y=0;
	}
	public Circle(double x, double y, double rayon) {
		super();
		this.x=x;
		this.rayon=y;
		this.centre = new Point(centre);
		this.rayon=rayon;		
	}
	
	public void affiche() {
        System.out.println("centre = (" + x + ", " + y + ")");
    }
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return this.x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getY() {
		return this.y;
	}
	public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }
	public String getCentre() {
        return this.x +","+ this.y;
    }
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	public double getRayon() {
		return this.rayon;
	}
	public double Aire() {
		// TODO Auto-generated method stub
		return Math.PI*this.rayon * this.rayon;
	}
	 public boolean estInterieur(double x, double y) {
	        return (((x - this.x) * (x - this.x) +
	                (y - this.y) * (y - this.y))
	                <= rayon * rayon);
	    }
	public String display() {
		// TODO Auto-generated method stub
		return "Je suis un Cercle de point: " + " "+(this.getX()+","+ this.getY())+" " +"de rayon"+" "+ this.getRayon() + "et dont l'Aire est:"+" "+ Aire();
		
	}
	
	
}















