package arrayListExercicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1L2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<Integer> setNumeros = new HashSet<Integer>();
		int numeroDigitado = 0, contador = 1;
		
		do {
			System.out.println("Digite o "+ (contador) + "° Número: ");
			numeroDigitado = scan.nextInt();
			scan.nextLine();
			
			if(setNumeros.contains(numeroDigitado)) {
				System.out.println("O número digitado já existe na lista, digite um número diferente!");
			}
			else {
				setNumeros.add(numeroDigitado);
				contador ++;
			}
			
		}while(contador != 11);
		
		Iterator<Integer> isetNumeros = setNumeros.iterator();

		while (isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}
		scan.close();
	}
}
