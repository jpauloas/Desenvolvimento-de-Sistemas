package SIM02;

public class Equipe {
	private String NomeEquipe;
	private int IdEquipe;
	private String NomeChefe;
	private String  Funcao;
	private String  Descricao; 
	private int NumEquipe; 
	private String  NomeEng;
	private String  NomeEngAux; 
	private String  NomeArq;
	private String  NomeEstagiario;
	
	public Equipe() {
		
	}
	
	public void setNomeEquipe(String nomeequipe) {
		this.NomeEquipe = nomeequipe;
	}
	public String getNomeEquipe() {
		return NomeEquipe;
	}
	public void setIdEquipe(int idequipe) {
		this.IdEquipe = idequipe;
	}
	public int getIdEquipe() {
		return IdEquipe;
	}
	public void setNomeChefe(String nomechefe) {
		this.NomeChefe = nomechefe;
	}
	public String getNomeChefe() {
		return NomeChefe;
	}
	public void setFuncao(String funcao) {
		this.Funcao = funcao;
	}
	public String getFuncao() {
		return Funcao;
	}
	public void setDescricao(String descricao) {
		this.Descricao = descricao;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setNumEquipe(int numequipe) {
		this.NumEquipe = numequipe;
	}
	public int getNumEquipe() {
		return NumEquipe;
	}
	public void setNomeEng(String nomeeng) {
		this.NomeEng = nomeeng;
	}
	public String getNomeEng() {
		return NomeEng;
	}
	public void setNomeEngAux(String nomeengaux) {
		this.NomeEngAux = nomeengaux;
	}
	public String getNomeEngaux() {
		return NomeEngAux;
	}
	public void setNomeArq(String nomearq) {
		this.NomeArq = nomearq;
	}
	public String getNomeArq() {
		return NomeArq;
	}
	public void setNomeEstagiario(String nomeestagiario) {
		this.NomeEstagiario = nomeestagiario;
	}
	public String getNomeEstagiario() {
		return NomeEstagiario;
	}

}
