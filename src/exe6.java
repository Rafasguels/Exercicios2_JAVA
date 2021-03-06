//Fazer um programa que leia tr?s valores com ponto flutuante de dupla precis?o: A, B e C. Em seguida, calcule e
//mostre:
//a) a ?rea do tri?ngulo ret?ngulo que tem A por base e C por altura.
//b) a ?rea do c?rculo de raio C. (pi = 3.14159)
//c) a ?rea do trap?zio que tem A e B por bases e C por altura.
//d) a ?rea do quadrado que tem lado B.
//e) a ?rea do ret?ngulo que tem lados A e B.

import java.util.Locale;
import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
				
		double areaDoTiangulo = A*C / 2;
		double areaDoCirculo = 3.14159 * (C*C);
		double areaDoTrapezio = ((A+B)*C)/2;
		double areaDoQuadrado = B*B;
		double areaDoRetangulo = A*B;
		
		System.out.printf("Triangulo: %.3f%n", areaDoTiangulo);
		System.out.printf("Circulo: %.3f%n", areaDoCirculo);
		System.out.printf("Trapezio: %.3f%n", areaDoTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaDoQuadrado);
		System.out.printf("Retanculo: %.3f%n", areaDoRetangulo);
		
		sc.close();		
	}
}
