package projetojava;

import java.util.Scanner;

public class Alunos extends Escola {

	Scanner leia = new Scanner(System.in);

	int totalFaltas;
	float mediaFinal;

	private int id;
	private int serie;
	private String turma;

	public Alunos(String nome, String genero, String endereco, String cpf, int idade, int telefone, int id, int serie,
			String turma) {
				
		super(nome, genero, endereco, cpf, idade, telefone);
		
		this.id = id;
		this.serie = serie;
		this.turma = turma;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public void leiaMedia() {
		float n1, n2, n3, n4;
		System.out.println("\n\nQual a média do(a) " + getNome() + " no 1º Bimestre? ");
		n1 = leia.nextFloat();
		System.out.println("Qual a média do(a) " + getNome() + " no 2º Bimestre? ");
		n2 = leia.nextFloat();
		System.out.println("Qual a média do(a) " + getNome() + " no 3º Bimestre? ");
		n3 = leia.nextFloat();
		System.out.println("Qual a média do(a) " + getNome() + " no 4º Bimestre? ");
		n4 = leia.nextFloat();
		mediaFinal = (n1 + n2 + n3 + n4) / 4;
		System.out.println("\n===== Média Final: " + mediaFinal + " =====");

	}

	public void leiaFaltas() {
		int f1, f2, f3, f4;
		System.out.println("Quantas faltas " + getNome() + " teve no 1º Bimestre? ");
		f1 = leia.nextInt();
		System.out.println("Quantas faltas " + getNome() + " teve no 2º Bimestre? ");
		f2 = leia.nextInt();
		System.out.println("Quantas faltas " + getNome() + " teve no 3º Bimestre? ");
		f3 = leia.nextInt();
		System.out.println("Quantas faltas " + getNome() + " teve no 4º Bimestre? ");
		f4 = leia.nextInt();		totalFaltas = f1 + f2 + f3 + f4;
		System.out.println("\n===== Total de faltas: " + totalFaltas + " =====");

	}

	public void aprovaAluno(){
	if(mediaFinal >=7 && mediaFinal <=10){
		System.out.println("\nAluna(o) APROVADA(O)!");
	}else if(mediaFinal >=5 && mediaFinal <7){
		System.out.println("\nAluna(o) de EXAME!\nEntre em contato com o seu professor!");
	}else {
		System.out.println("\nAluna(o) REPROVADA(O)!");
		}
	}

	public void faltasAluno(){
	if(totalFaltas >=0 && totalFaltas <=32){
		System.out.println("\nAluna(o) APROVADA(O)!");
	}else if(totalFaltas >=33 && totalFaltas <=50){
		System.out.println("\nAluna(o) de EXAME!\nEntre em contato com o seu professor!");
	}else {
		System.out.println("\nAluna(o) REPROVADA(O)!");
		}
	}

	public void imprimirAluno() {
		System.out.println("\n****************Aluno****************");
		System.out.println("\nNome: " + getNome() + "\nGênero: " + getGenero() + "\nEndereço: " + getEndereco()
				+ "\nCPF: " + getCpf() + "\nIdade: " + getIdade() + "\nTelefone: " + getTelefone() + "\n\nRA: " + id
				+ "\n" + serie + " série " + turma);
		System.out.println("Média Final: " + mediaFinal);
		System.out.println("Total de faltas: " + totalFaltas);

	}
}