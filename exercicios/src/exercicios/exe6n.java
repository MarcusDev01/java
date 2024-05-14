/**
 * 
 */
package exercicios;

import java.util.Scanner;

/**
 * 
 */
public class exe6n {

	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		
		int tempo=0,meses24 = 0,nasce=0;
		char sexo;
		double masc=0,fem=0,porcF=0,porcM=0,porc24=0;
		
		System.out.println("nasce");
		nasce=entrada.nextInt();
		
		for(int cont=0;cont<nasce;cont++) {
			
			System.out.println("nasce"+(cont+1));
			
			
			System.out.println("sexo");
			sexo=entrada.next().charAt(0);
			
			while(sexo!='M' && sexo!='m' && sexo!='F' && sexo!='f') {
				System.out.println("sexo invalido");
				System.out.println("digite o sexo novamnete");
				sexo=entrada.next().charAt(0);
			}
			
				
			
			System.out.println("tempo");
			tempo=entrada.nextInt();
			
			
			if (tempo<=24) {
				meses24++;
			}
			
			if(sexo=='m' || sexo=='M') {
				masc++;
			}else if(sexo=='f' || sexo=='F') {
				fem++;
			}
			
			porcM=masc/nasce*100;
			porcF=fem/nasce*100;
			porc24=meses24/nasce*100;
					
		}
		System.out.println("masc;"+porcM);
		System.out.println("fem;"+porcF);
		System.out.println("meses 24;"+porc24);
		

	}

}
