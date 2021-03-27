package Atv16;

public class Cliente implements Pessoa {

	private int idPessoa;
	private String NOME;
	private String CPF;
	private String RG;
	private int NUM_TELEFONE;
	private String GENERO;
	private Endereco ENDERECO;
	
	public int getIdPessoa() { 
		return idPessoa;
	}
	
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getCpf() {
		return CPF;
	}
	
	public void setCpf(String cpf) {
		this.CPF = cpf;
	}
	
	public String getRg() {
		return RG;
	}
	
	public void setRg(String rg) {
		this.RG = rg;
	}
	
	public String getNome() {
		return NOME;
	}
	
	public void setNome(String nome) {
		this.NOME = nome;
	}
	
	public int getTelefone() {
		return NUM_TELEFONE;
	}
	
	public void setTelefone(int telefone) {
		this.NUM_TELEFONE = telefone;
	}
	
	public String getGenero() {
		return GENERO;
	}
	
	public void setSexo(String genero) {
		this.GENERO = genero;
	}
	
	public Endereco getEndereco() {
		return ENDERECO;
	}
	
	public void setEndereco(Endereco endereco) {
		this.ENDERECO = endereco;
	}
}