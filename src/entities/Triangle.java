package entities;

public class Triangle {
	public double a; //lados do triangulo 
	public double b;
	public double c;
	
	public double area() { //Metodo que calcula a Area do triangulo
		double p = (a + b + c) / 2.0; 
		
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c)); 
		
		return area;
	}
}
