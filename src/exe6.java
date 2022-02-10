//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

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
