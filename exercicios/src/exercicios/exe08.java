/**
 * 
 */
package exercicios;

import java.util.Scanner;

public class exe08 {

	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		int aulas=0,matricula=0,reprovadosN=0,aprovados = 0,reprovadosF=0,reprovadosTotal=0;
		double nota1=0,nota2=0,nota3=0;
		
		for(int i=0;i<10;i++) {
			double media;
			System.out.println("numero matricula");
			matricula=entrada.nextInt();
			
			System.out.println("nota1");
			nota1=entrada.nextDouble();
			
			System.out.println("nota2");
			nota2=entrada.nextDouble();
			
			System.out.println("nota3");
			nota3=entrada.nextDouble();
			
			System.out.println("frequencia");
			aulas=entrada.nextInt();
			
			media=(nota1+nota2+nota3)/3;
			
			System.out.println("Média: "+ media);
			if(media>=6 && aulas>=40) {
				System.out.println("aprovado");
				aprovados++;
			}else{
				System.out.println("reprovado");
				reprovadosN++;
			}
			if(aulas<40){
				System.out.println("reprovado");
				reprovadosF++;
			}
			reprovadosTotal=reprovadosN+reprovadosF;

		}
		
		System.out.println("numero de aprovados:"+aprovados);
		System.out.println("numero de reprovados:"+reprovadosTotal);
		System.out.println("numero de reprovados por falta:"+reprovadosF);
		

	}

}
