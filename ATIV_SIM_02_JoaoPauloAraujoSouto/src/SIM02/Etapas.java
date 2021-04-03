package SIM02;

public class Etapas {
	private String Nome;
	private int IdEtapa; 
	private String Descricao; 
	private String Equipe; 
	private int IdEquipe;
	private String  DataInicio;
	private String  DataFinalizacao; 
	private String EntregaFinal; 
	
	public Etapas() {
		
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getNome() {
		return Nome;
	}
	public void setIdEtapa(int idetapa) {
		this.IdEtapa = idetapa;
	}
	public int getIdEtapa() {
		return IdEtapa;
	}
	public void setDescricao(String descricao) {
		this.Descricao = descricao;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setEquipe(String equipe) {
		this.Equipe = equipe;
	}
	public String getEquipe() {
		return Equipe;
	}
	public void setIdEquipe(int idequipe) {
		this.IdEquipe = idequipe;
	}
	public int getIdEquipe() {
		return IdEquipe;
	}
	public void setDataInicio(String datainicio) {
		this.DataInicio = datainicio;
	}
	public String getDataInicio() {
		return DataInicio;
	}
	public void setDataFinalizacao(String datafinalizacao) {
		this.DataFinalizacao = datafinalizacao;
	}
	public String getDataFinalizacao() {
		return DataFinalizacao;
	}
	public void setEntregaFinal(String entregafinal) {
		this.EntregaFinal = entregafinal;
	}
	public String getEntregaFinal() {
		return EntregaFinal;
	}	
}
