package redeAcademia;

public class Aluno {
	String nome;
	String cpf;
	Integer idade;
	Double altura;
	Double peso;
	Boolean isAtivo;
	Pacotes pacote;
	
	public Aluno(String nome, String cpf, Integer idade, Double altura, Double peso, Boolean isAtivo, Pacotes pacote) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.isAtivo = isAtivo;
		this.pacote = pacote;
	}
	
	public String toString() {
		String ativo = isAtivo == true ? "Sim" : "Não";
		return "Aluno(a): " + nome + " - Plano: " + pacote.getPacote() + " - Ativo: " + ativo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Boolean getIsAtivo() {
		return isAtivo;
	}
	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}	
}