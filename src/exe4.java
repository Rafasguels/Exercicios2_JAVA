//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
//decimais.

import java.util.Locale;
import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, horasTra;
		double valorH, salarioF;
		
		num = sc.nextInt();
		horasTra = sc.nextInt();
		valorH = sc.nextDouble();
		
		salarioF = horasTra * valorH;
		
		System.out.println("Number = " + num);
		System.out.printf("Salary = U$ %.2f%n", salarioF);
		
		sc.close();
		
		
	}

}
