package exercicios;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		
		int  numero=0, maior=0, menor=0;
		
		for (int i=0;i<10;i++) {
			System.out.println("numero");
			numero=entrada.nextInt();
			if(numero>maior) {
				maior=numero;
			}
			if(i == 0) {
				menor = numero;
			}else {
				if(numero<menor){
					menor=numero;
					
			}
		}
	}
		
		
		System.out.println("maior"+maior);
		System.out.println("menor"+menor);
	
		
	
	
	
	
	
	
	}
}
