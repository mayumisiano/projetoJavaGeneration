package projetojava;

import java.util.Scanner;
import java.time.*;
import java.time.format.*;

public class Professores extends Escola {
	
	Scanner leia = new Scanner(System.in);
	
	private int registro;
	private String materia;
	private String turno;
	int totalFaltas;
	String ponto;
	
	public Professores (String nome, String genero, String endereco, String cpf, int idade, int telefone, int registro, String materia,
			String turno) {
		super(nome, genero, endereco, cpf, idade, telefone);
		this.registro = registro;
		this.materia = materia;
		this.turno = turno;
		
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void lerFalta() {
		int f1, f2, f3, f4;
		System.out.println("Quantas faltas " + getNome() + " teve no 1º Bimestre? ");
		f1 = leia.nextInt();
		System.out.println("Quantas faltas " + getNome() + " teve no 2º Bimestre? ");
		f2 = leia.nextInt();
		System.out.println("Quantas faltas " + getNome() + " teve no 3º Bimestre? ");
		f3 = leia.nextInt();
		System.out.println("Quantas faltas " + getNome() + " teve no 4º Bimestre? ");
		f4 = leia.nextInt();		totalFaltas = f1 + f2 + f3 + f4;
		System.out.println("\n===== Total de faltas em 2022: " + totalFaltas + " =====");

	}
	
	public float calcBonus() {
		float desconto, bonus;
		desconto = (totalFaltas * 2) * 1500 / 100;
		if (desconto >= 1500) {
			return 0;
		}else {
			bonus = 1500 - desconto;
			return bonus;
		}
	}
	
	public void batePonto() {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		ponto = myDateObj.format(myFormatObj);
		System.out.println("Você bateu o ponto em: "+ponto);
	}
	
	public void imprimirProf() {
		System.out.println("\n*******Professor*****");
		System.out.println("\nNome: "+getNome()+"\nGênero: "+getGenero()+"\nEndereço: "+getEndereco()+"\nCPF: "+getCpf()+"\nIdade: "
				+getIdade()+"\nTelefone: "+getTelefone()+"\nRegistro: "+registro+"\nMatéria: "+materia+"\nTurno: "+turno+"\nBônus Salarial: R$"+calcBonus()+"\nTotal de Faltas: "+totalFaltas+"\nÚltimo Ponto: "+ponto);
	}

}