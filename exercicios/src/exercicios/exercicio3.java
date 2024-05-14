/**
 * 
 */
package exercicios;

import java.util.Scanner;

/**
 * 
 */
public class exercicio3 {


	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int canal=0,pessoas=0,totPessoas=0;
		
		double cont4=0,cont5=0,cont7=0,cont12=0;
		
		
		System.out.println("digite o canal");
		canal=entrada.nextInt();
		
		while (canal!=0) {
			while(canal!=4 && canal!=5 && canal!=7 && canal!=12){
				System.out.println("Digite um canal válido.");
				canal = entrada.nextInt();
				System.out.println(canal);
			}
		
		
		System.out.println("numero de pessoas assistindo o canal");
		pessoas=entrada.nextInt();
		switch(canal) {
		case 4:
			cont4 += pessoas;
			break;
		case 5:
			cont5 += pessoas;
			break;
		case 7:
			cont7 += pessoas;
			break;
		case 12:
			cont12 += pessoas;
			break;	
		}
		totPessoas += pessoas;
			System.out.println("digite um canal:");
			canal = entrada.nextInt();
		}
		
		System.out.println("total pessoas"+totPessoas);
		System.out.println("canal 4: " + (cont4/totPessoas*100) + "%");
		System.out.println("canal 5: " + (cont5/totPessoas*100) + "&");
		System.out.println("canal 7: " + (cont7/totPessoas*100) + "%");
		System.out.println("canal 12: " + (cont12/totPessoas*100)+ "%");

	}

}
