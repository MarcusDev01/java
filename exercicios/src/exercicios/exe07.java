/**
 * 
 */
package exercicios;

import java.util.Scanner;

public class exe07 {

	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		int idade=0,totalP=0,contA=0,contB=0,contC=0,contD=0,contE=0,totalId=0;
		char opiniao;
		
		System.out.println("digite a idade");
		idade=entrada.nextInt();
		
		while(idade!=0) {
			totalP++;
			totalId+=idade;
			
		System.out.println("nota A,B,C,D ou e");
		opiniao=entrada.next().charAt(0);
		
		while(opiniao!='A' && opiniao!='B' && opiniao!='C' && opiniao!='D' && opiniao!='E') {
			System.out.println("opçao invalida");
			System.out.println("digite novamente");
			opiniao=entrada.next().charAt(0);	
		}
		
		switch (opiniao){
		case 'A':
			contA++;
			break;
		case 'B':
			contB++;
			break;
		case 'C':
			contC++;
			break;
		case 'D':
			contD++;
			break;
		case 'E':
			contE++;
			break;	
		}
		System.out.println("idade");
		idade=entrada.nextInt();
		
		
		}
		System.out.println("total pessoas:"+totalP);
		System.out.println("media idade"+(double)totalId/totalP);
		System.out.println("A"+(double)contA/totalP*100);
		System.out.println("B"+(double)contB/totalP*100);
		System.out.println("C"+(double)contC/totalP*100);
		System.out.println("D"+(double)contD/totalP*100);
		System.out.println("E"+(double)contE/totalP*100);
	}

}
