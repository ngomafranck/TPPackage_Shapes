package co.simplon.shapes;

public class Square extends Shape {
	private double cote;
	
	public Square() {
		super();
		cote=0;		
	}
	public Square(double cote) {
		super("Square");
		this.cote=cote;		
	}
	public void setCote(double cote) {
		this.cote = cote;
	}
	public double getCote() {
		return this.cote;
	}
	public double Aire() {
		// TODO Auto-generated method stub
		return this.cote * this.cote;
	}
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "Je suis un carré"+" "  + "de coté"+" "+ this.getCote() +" "+ "et dont l'Aire est:"+" "+ Aire();
	}
	

}
