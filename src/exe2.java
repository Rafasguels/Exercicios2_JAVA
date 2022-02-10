//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = pi . raio2
//Considere o valor de pi = 3.14159


import java.util.Locale;
import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		double raio, area;
		
		raio = sc.nextDouble();
		
		area = 3.14159 * Math.pow(raio, 2.0); //ou area=pi*(raio*raio)  
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();

	}

}
