package co.simplon.shapes;

public class Triangle extends Shape{
	private double base;
	private double hauteur;
	
	public Triangle() {
		super();
		base=0;
		hauteur=0;		
	}
	
	public Triangle(double base, double hauteur) {
		super("Triangle");
		this.base=base;
		this.hauteur=hauteur;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getBase() {
		return this.base;
	}
	public void setHauteur(double base) {
		this.hauteur = hauteur;
	}
	public double getHauteur() {
		return this.hauteur;
	} 
	
	public double Aire() {
		// TODO Auto-generated method stub
		return (this.base * this.hauteur)/2;
	}
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "Je suis un Triangle " + "de base"+" "+ this.getBase()+" "+ "et de hauteur"+" "+this.getHauteur()+" "+ "et dont l'Aire est:"+" "+ Aire();
	}
	

}
