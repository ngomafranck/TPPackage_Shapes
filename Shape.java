package co.simplon.shapes;

public abstract class Shape {
	private String nom;
	
	public Shape(String nom) {
		this.nom=nom;
		System.out.println("Je suis un " + this.nom);
	}
	public Shape() {
		
	}
	
	public abstract double Aire();
	
	public abstract String display();
	

}
