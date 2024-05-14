package exercicios;

import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		
				// TODO Auto-generated method stub

				Scanner entrada = new Scanner(System.in);

				int voto = 0, cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, cand5 = 0, cand6 = 0, cont = 0;

				System.out.println("Digite seu voto");
				voto = entrada.nextInt();

				while (voto != 0) {
					
					switch (voto) {
					case 1:
						cand1++;
						break;
					case 2:
						cand2++;
						break;
					case 3:
						cand3++;
						break;
					case 4:
						cand4++;
						break;
					case 5:
						cand5++;
						break;
					case 6:
						cand6++;
						break;
					default:
						System.out.println("opção invalida");
						cont--;
					}
					cont++;
					System.out.println("Digite seu voto");
					voto = entrada.nextInt();
				}
				System.out.println("----- ELEIÇÃO -----");
				System.out.println("Total de votos: " + cont);
				System.out.println("votos candidato 1:" + cand1);
				System.out.println("votos candidato 2:" + cand2);
				System.out.println("votos candidato 3:" + cand3);
				System.out.println("votos candidato 4:" + cand4);
				System.out.println("votos candidato 5:" + cand5);
				System.out.println("votos candidato 6:" + cand6);

			}
}
