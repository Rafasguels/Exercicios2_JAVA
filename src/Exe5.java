//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Locale;
import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codP1, numP1, codP2, numP2;
		double valorUnit1, valorUnit2, valorT;
		
		codP1 = sc.nextInt();
		numP1 = sc.nextInt();
		valorUnit1 = sc.nextDouble();
		
		codP2 = sc.nextInt();
		numP2 = sc.nextInt();
		valorUnit2 = sc.nextDouble();
		
		valorT = numP1 * valorUnit1 + numP2 * valorUnit2;
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valorT);
		
		sc.close();	

	}

}
