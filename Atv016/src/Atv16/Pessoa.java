package Atv16;

public interface Pessoa {
	
	public int getIdPessoa();
	
	public void setIdPessoa(int idPessoa);

	public String getCpf();
	
	public void setCpf(String cpf);
	
	public String getRg();
	
	public void setRg(String rg);
	
	public String getNome();
	
	public void setNome(String nome);
	
	public int getTelefone();
	
	public void setTelefone(int telefone);
	
	public String getGenero();
	
	public void setSexo(String genero);
	
	public Endereco getEndereco();
	
	public void setEndereco(Endereco endereco);
}