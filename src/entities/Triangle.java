package entities;

public class Triangle {
	public double a; //lados do triângulo 
	public double b;
	public double c;
	
	public double area() { //Método que calcula a área do triângulo
		double p = (a + b + c) / 2.0; 
		
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c)); 
		
		return area;
	}
}
