package arrayListExercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio1L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String coresDigitadas;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite a "+ (i + 1) + "° cor: ");
			coresDigitadas = scan.nextLine();
			cores.add(coresDigitadas);
		}
		
		System.out.println(cores);
		//Organiza em ordem alfabética
		Collections.sort(cores);
		System.out.println(cores);
		scan.close();
	}
}
