package poo;

import java.util.Scanner;

public class Avaliacao4Exercicio17 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int i, limit=0;
		String[] t = new String[5];
		String[] n = new String[5];
		String[] d = new String[5];
		String busca, buscando;
		
		for(i=0; i<=4; i++) {
		System.out.printf("Nome: ");
		n[i] = sc.nextLine();
		System.out.printf("Endere�o: ");
		d[i] = sc.nextLine();
		System.out.printf("Telefone: ");
		t[i]= sc.nextLine();}
		
		System.out.printf("\nNome de quem voc� deseja procurar: ");
		busca = sc.nextLine();
		busca = busca.toLowerCase();
		
		for(i=1;i<=5;i++) {
			buscando = n[i].toLowerCase();
			if(busca.equals(buscando)) {
			limit = i;
			break;}}
		
		System.out.println("\nO nome �: " +  n[limit]);
		System.out.println("O endere�o �: " +  d[limit]);
		System.out.println("O telefone �: " +  t[limit]);
		
		sc.close();
		
}
}
