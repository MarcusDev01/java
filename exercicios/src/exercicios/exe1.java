/**
 * 
 */
package exercicios;

import java.util.Scanner;


public class exe1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int idade, cont = 0;
		double tot1 = 0, tot2 = 0, tot3=0, tot4=0, tot5=0;

		for (int i = 0; i < 20; i++) {

			System.out.println("Digite sua idade");
			idade = entrada.nextInt();
			cont++;
			
				if (idade <= 15) {
					tot1++;
				} else if (idade > 16 && idade <= 30) {
					tot2++;
				} else if (idade >= 31 && idade <= 45) {
					tot3++;
				} else if (idade >= 46 && idade <= 60) {
					tot4++;
				} else 
					tot5++;
				
		}
		
		
		System.out.println("faixa 1:"+tot1);
		System.out.println("faixa2:"+tot2);
		System.out.println("faixa3:"+tot3);
		System.out.println("faixa4:"+tot4);
		System.out.println("faixa5:"+tot5);
		
		System.out.println("Porcetagem 1: " + (tot1*100)/cont);
		System.out.println("Porcetagem 2: " + (tot2*100)/cont);
		System.out.println("Porcetagem 3: " + (tot3*100)/cont);
		System.out.println("Porcetagem 4: " + (tot4*100)/cont);
		System.out.println("Porcetagem 5: " + (tot5*100)/cont);
		
	}// main

}// class


