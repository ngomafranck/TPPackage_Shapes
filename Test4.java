package co.simplon.shapes;

import java.awt.Point;
import java.util.ArrayList;

import co.simplon.peoples.Employe;
import co.simplon.towns.Ville;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t1=new Triangle(12,23);
		Triangle t2=new Triangle(10,25);
				
		System.out.println(t1.display());
		System.out.println(t2.display());
		
		Square s1=new Square(100);
		Square s2=new Square(50);
		System.out.println(s1.display());
		System.out.println(s2.display());
		
		Point p1 = new Point(10,0);
	//	Circle c= new Circle(1,2, 5.5f);  // Je n'arrive pas à instancier le cercle
//		ArrayList <Shape>list=new ArrayList<Shape>();
	//	list.add(new Shape(12,23));
//		list.add(new Shape(Triangle t2));
	//	list.add(new Shape(Square s1));
//		list.add(new Shape(Square s2));

//		for(int i = 0; i < list.size(); i++)
	//	{
//			System.out.println(list.get(i));
//		}
	}

}

 





