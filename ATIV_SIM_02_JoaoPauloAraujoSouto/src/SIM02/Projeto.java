package SIM02;

public abstract class Projeto {
	protected String Nome;
	protected int Id; 
	protected String Descricao; 
	protected String NomeCliente; 
	protected int IdCliente; 
	protected String  DataInicio;
	protected String  DataFinalizacao; 
	protected String Complexidade;
	
	public Projeto() {
		
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
	public void setDescricao(String Descricao) {
		this.Descricao = Descricao;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setNomeCliente(String NomeCliente) {
		this.NomeCliente = NomeCliente;
	}
	public String getNomeCliente() {
		return NomeCliente;
	}
	public void setIdCliente(int IdCliente) {
		this.IdCliente = IdCliente;
	}
	public int IdCliente() {
		return IdCliente;
	}
	public void setDataInicio(String DataInicio) {
		this.DataInicio = DataInicio;
	}
	public String getDataInicio() {
		return DataInicio;
	}
	public void setDataFinalizacao(String DataFinalizacao) {
		this.DataFinalizacao = DataFinalizacao;
	}
	public String getDataFinalizacao() {
		return DataFinalizacao;
	}
	public void setComplexidade(String Complexidade) {
		this.Complexidade = Complexidade;
	}
	public String getComplexidade() {
		return Complexidade;
	}
	
	@Override /* impressão dos dados armazenados */
	public String toString() {
		
		return "Nome do projeto: "+ Nome +
					"\n Numero identificador: " + Id +
					"\n Descrição do projeto: "+ Descricao +
					"\n Nome do cliente: "+ NomeCliente +
					"\n Numero identificador do cliente: "+ IdCliente +
					"\n Data de inicio do projeto: "+ DataInicio +
					"\n Data de entrega estimada: " + DataFinalizacao +
					"\n Nivel de complexidade do projeto: "+ Complexidade;
					
		}
	
}
