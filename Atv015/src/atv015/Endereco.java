package atv015;

public class Endereco {
	
	private int CEP;
	private String RUA;
	private int NUMERO;
	private String BAIRRO;
	private String CIDADE;
	private String ESTADO;
	
	public int getCep() {
		return CEP;
	}
	public void setCep(int cep) {
		this.CEP = cep;
	}
	
	public String getRua() {
		return RUA;
	}
	public void setRua(String rua) {
		this.RUA = rua;
	}
	public int getNumero() {
		return NUMERO;
	}
	public void setNumeroCasa(int numeroCasa) {
		this.NUMERO = numeroCasa;
	}
	public String getBairro() {
		return BAIRRO;
	}
	public void setBairro(String bairro) {
		this.BAIRRO = bairro;
	}
	public String getCidade() {
		return CIDADE;
	}
	public void setCidade(String cidade) {
		this.CIDADE = cidade;
	}
	public String getEstado() {
		return ESTADO;
	}
	public void setEstado(String estado) {
		this.ESTADO = estado;
	}		

}
