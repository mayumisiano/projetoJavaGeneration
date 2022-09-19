package projetojava;
//Classe mãe
public class Escola {	
	
	private String nome;
	private String genero; 
	private String endereco;
	private String cpf; 
	private int idade;
	private int telefone;
	

	public Escola (String nome, String genero, String endereco, String cpf, int idade, int telefone) {
		
		this.nome = nome;
		this.genero = genero;
		this.endereco = endereco;
		this.cpf = cpf;
		this.idade = idade;
		this.telefone = telefone;
		
	}		
	
	public void validarCpf() {  		
		
		if(getCpf().length()!=11){
			System.out.println("\n---CPF Inválido!!!---");
		}else {
			System.out.println("\n---CPF Válido!!!---");
		}
	}
		
	public String getNome() {
		return nome;		
	}
		
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}		

}
