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
	public void getCnpj(int Cnpj) {
		this.Cnpj = Cnpj;
	}
	public int getCnpj() {
		return Cnpj;
	}
	public void getTelefone(int Telefone) {
		this.Telefone = Telefone;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void getEndereco(String Endereco) {
		this.Endereco = Endereco;
	}
	public String setEndereco() {
		return Endereco;
	}
	public void getDemandante(String Demandante) {
		this.Demandante = Demandante;
	}
	public String setDemandante() {
		return Demandante;
	}
	public void getEmailDemandante(String EmailDemandante) {
		this.EmailDemandante = EmailDemandante;
	}
	public String setEmailDemandante() {
		return EmailDemandante;
	}
	public void getEmailEmpresa(String EmailEmpresa) {
		this.EmailEmpresa = EmailEmpresa;
	}
	public String setEmailEmpresa() {
		return EmailEmpresa;
	}

}
