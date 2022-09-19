package projetojava;

import java.util.Scanner;

public class EscolaTeste {

	public static void main(String[] args) {
		
		Alunos aluno1 = new Alunos ("Maria Joana", "Feminino", "Rua das Lágrimas, 1", "12345678910", 14, 44443333, 12345, 9,
				"B");		
		
		Professores prof1 = new Professores ("João Paulo", "masculino", "Avenida Souza e Silva, 2", "01987654321", 42, 33334444, 57089,
					"História", "Noturno");		
		
		Staff limpeza = new Staff ("Maria Lúcia", "Não-declarado", "Desconhecido", "23654789104", 56, 55556666, "Limpeza", 
		"Matutino e Noturno");
		
		//Chamando os métodos para invocar os comportamentos
		int op,acesso,teacher;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n1- Acessar sistema do Aluno");
		System.out.println("\n2- Acessar o Sistema do Professor");
		System.out.println("\n3- Acessar o Sistema do Staff");
		System.out.println("\n0- Sair do sistema!");
		
		do {
		
		System.out.println("\nQual sistema gostaria de acessar? ");	
		op = ler.nextInt();	
							
		switch(op) {
		
		case 1:		
			
			System.out.println("\n***Bem vinde ao Sistema do Aluno**");
			//Novo menu de Opções dentro do Sistema Aluno
			
			System.out.println("\n1- Calcular a Média do Aluno");
			System.out.println("\n2- Contar a quantidade de faltas");		
			System.out.println("\n3- Imprimir informações do Aluno");			
			
			System.out.println("\nDigite a opção que deseja acessar: ");		
			acesso= ler.nextInt();					
			
			switch(acesso) {
			case 1:
				aluno1.leiaMedia();
				aluno1.aprovaAluno();
				break;
			case 2:
				aluno1.leiaFaltas();
				aluno1.faltasAluno();
				break;			
			case 3:
				aluno1.imprimirAluno();				
				break;			
				default:
					System.out.println("\nOpção Inválida, digite as do menu");					
				}break;				
			
			
		case 2:
			System.out.println("\n***Bem vinde ao Sistema do Professor**");
			System.out.println("\n1- Bater ponto");
			System.out.println("\n2- Contar faltas");	
			System.out.println("\n3- Imprimir informações do Professor");	
			
			System.out.println("\nDigite a opção que deseja acessar: ");
			teacher= ler.nextInt();
			switch(teacher) {
			case 1:
				prof1.batePonto();				
				break;
			case 2:
				prof1.lerFalta();				
				break;
			case 3:
				prof1.imprimirProf();				
				break;			
				default:
					System.out.println("\nOpção inválida, digite as opções do Menu");					
				}break;		
							
			
		case 3:
			System.out.println("\n****Bem vinde ao Sistema do Staff***");
			limpeza.imprimirStaff();
			limpeza.sorteioDia();
			break;
		
		case 0:
			System.out.println("\nSaindo do sistema, volte sempre!");
			break;
			default:
				System.out.println("\nOpção inválida, digite as opções do Menu");
				
		}
				
		}while (op != 0);		
	}						

}



