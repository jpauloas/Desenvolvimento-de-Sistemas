package SIM02;

public class Funcionario {
	private String Nome;
	private int Id;
	private int Crea;
	private int  Cpf;
	private String  Funcao; 
	private String Equipe; 
	private String  Graduacao;
	private String  Especialidade; 
	
	public Funcionario() {
		
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public String getNome() {
		return Nome;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public int getId() {
		return Id;
	}
	public void setCrea(int Crea) {
		this.Crea = Crea;
	}
	public int getCrea() {
		return Crea;
	}
	public void setCpf(int Cpf) {
		this.Cpf = Cpf;
	}
	public int getCpf() {
		return Cpf;
	}
	public void setFuncao(String Funcao) {
		this.Funcao = Funcao;
	}
	public String getFuncao() {
		return Funcao;
	}
	public void setEquipe(String Equipe) {
		this.Equipe = Equipe;
	}
	public String getEquipe() {
		return Equipe;
	}
	
	public void setGraduacao(String Graduacao) {
		this.Graduacao = Graduacao;
	}
	public String getGraduacao() {
		return Graduacao;
	}
	public void setEspecialidade(String Especialidade) {
		this.Especialidade = Especialidade;
	}
	public String getEspecialidade() {
		return Especialidade;
	}
}
