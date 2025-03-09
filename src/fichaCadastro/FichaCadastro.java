package fichaCadastro;

import java.io.IOException;
import java.util.Scanner;

public class FichaCadastro {
	private static String nome;
	private static int idade;
	private static float altura;
	private static float peso;
	private static char sexo;
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		do {
			System.out.print("Digite o seu nome: ");
			nome = leitura.nextLine();
		}while(nome.length() < 4 || nome.length() > 30);
		
		do {
			System.out.print("Digite a sua idade: ");
			idade = leitura.nextInt();
		}while(idade <= 0 || idade >=100);
		
		do {
			System.out.print("Digite a sua altura: ");
			altura = leitura.nextFloat();
		}while(altura <= 0);
		
		do {
			System.out.print("Digite o seu peso: ");
			peso = leitura.nextFloat();
		} while (peso <=0);
		
		do {
			System.out.print("Digite o seu sexo (M) ou (F) :");
			try {
				sexo = (char)System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (sexo != 'F' && sexo != 'M');
		
		System.out.println("\nNome: " + nome );
		System.out.println("Idade: " + idade );
		System.out.println("Altura: " + altura );
		System.out.println("Peso: " + peso );
		System.out.println("Sexo: " + sexo );
		
	}

}
