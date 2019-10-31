package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) { //Este programa calcula as áreas de dois triângulos a partir das medidas dos seus três lados e retorna qual dos triângulos tem a maior área
		
		Locale.setDefault(Locale.US);  //configura a forma padrão de nomenclatura de números em ponto flutuante como sendo igual ao padrão internacional (usando . para separar as casas decimais)
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.printf("Triangle X area: %.4f%n", x.area());
		System.out.printf("Triangle Y area: %.4f%n", y.area());
		
		if (x.area() > y.area()) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();

	}

}
