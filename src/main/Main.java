package main;

import java.util.Scanner;

import Animais.Galinha;
import Animais.Morcego;
import Animais.Pato;
import Animais.Vaca;
import HierarquiaDeAnimais.Animal;


public class Main {
	public static void main(String[] args) {
		//Limpando console
		for (int i = 0; i < 50; ++i) System.out.println();
		
		System.out.println("Bem vindo a Fazenda POO!");
		System.out.println("Tecle enter para continuar");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		//Limpando console
		for (int i = 0; i < 50; ++i) System.out.println();
		
		
		
		//-------------------------DADOS DOS ANIMAIS--------------------------------
		
		int idade = 0;
		String tamanho = "";
		String cor = "";
		String altura = "";
		
		System.out.println("Agora vamos criar nossos animais:\n");
		
		Animal[] animais = new Animal[4];		
		animais[0] = new Vaca();
		animais[1] = new Morcego();
		animais[2] = new Pato();
		animais[3] = new Galinha();
		
		String[] nome_animais = new String[4];
		nome_animais[0] = "Vaca";
		nome_animais[1] = "Morcego";
		nome_animais[2] = "Pato";
		nome_animais[3] = "Galinha";
		
		for(int i=0; i<animais.length; i++) {
			System.out.println((i+1)+". "+nome_animais[i]);
			System.out.print("Qual a idade: ");
			idade = scanner.nextInt();
			scanner.nextLine(); //Para capturar o resquicio do nextInt
			animais[i].setIdade(idade);
			System.out.print("Qual o tamanho (Grande, Medio ou Pequeno): ");
			tamanho = scanner.nextLine();
			animais[i].setTamanho(tamanho);
			if(animais[i].getTipoDeCobertura() == "Pelo") {
				System.out.print("Qual a cor dos pelos: ");
			}else{
				System.out.print("Qual a cor das penas: ");
			}
			cor = scanner.nextLine();
			animais[i].setCorDeCobertura(cor);
			if(animais[i].tentarVoar() == "Pode voar") {
				System.out.print("Qual altura pode voar (alto ou baixo): ");
				altura = scanner.nextLine();
				animais[i].setAltura_de_voo(altura);
			}
			System.out.println();
		}
		
		//-------------------------APRESENTANDO A FAZENDA--------------------------------
		//Limpando console
		for (int i = 0; i < 50; ++i) System.out.println();
		
		System.out.println("PRONTO!");
		System.out.println("Agora aperte enter para ver como ficou nossa fazenda.");
		scanner.nextLine();
	
		//Limpando console
		for (int i = 0; i < 50; ++i) System.out.println();
		
		for(int i=0; i<animais.length; i++) {
			System.out.println(nome_animais[i]);
			System.out.println("Idade: "+animais[i].getIdade()+" anos.");
			System.out.println("Tamanho: "+animais[i].getTamanho()+".");
			System.out.println("Possui "+animais[i].getTipoDeCobertura()+" de cor "+animais[i].getCorDeCobertura()+".");
			System.out.println("Pode "+animais[i].acaoComoCordado()+".");
			System.out.println("O barulho que faz é um "+animais[i].emitirSom()+".");
			System.out.println(animais[i].tentarVoar());
			if(animais[i].tentarVoar() == "Pode voar") {
				System.out.println("Voa "+animais[i].getAlturaDeVoo()+".\n");
			}else {
				System.out.println();
			}
		}
		
		System.out.print("Aperte enter para fechar.");
		scanner.nextLine();
		scanner.close();
	}
}


