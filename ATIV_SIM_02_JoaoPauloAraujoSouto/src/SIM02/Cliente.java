package SIM02;

public class Cliente {
	private String NomeFantasia;
	private int Id;
	private int Cnpj;
	private int  Telefone;
	private String  Endereco; 
	private String Demandante; 
	private String  EmailDemandante;
	private String  EmailEmpresa; 
	
	public Cliente() {
		
	}
	public void setNomeFantasia(String NomeFantasia) {
		this.NomeFantasia = NomeFantasia;
	}
	public String getNomeFantasia() {
		return NomeFantasia;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public int getId() {
		return Id;
	}
	public void setCnpj(int Cnpj) {
		this.Cnpj = Cnpj;
	}
	public int getCnpj() {
		return Cnpj;
	}
	public void setTelefone(int Telefone) {
		this.Telefone = Telefone;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setEndereco(String Endereco) {
		this.Endereco = Endereco;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setDemandante(String Demandante) {
		this.Demandante = Demandante;
	}
	public String getDemandante() {
		return Demandante;
	}
	public void setEmailDemandante(String EmailDemandante) {
		this.EmailDemandante = EmailDemandante;
	}
	public String getEmailDemandante() {
		return EmailDemandante;
	}
	public void setEmailEmpresa(String EmailEmpresa) {
		this.EmailEmpresa = EmailEmpresa;
	}
	public String getEmailEmpresa() {
		return EmailEmpresa;
	}

}
