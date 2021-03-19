package ativ_fix_comp_JoaoPauloAraujoSouto;

public class Moto {
	
	private int idMoto;// atributo para identificação da moto
	private String NOME; // atributo para nome 
	private String MODELO; // atributo para modelo
	private String MARCA; // atributo para marca
	private String ANO; // atributo para ano 
	private String COR; // atributo para cor da moto
	
	public Moto() {
		
	}
		
	public void setidCarro(int idMoto) {
		this.idMoto = idMoto;
	}
	public int getidMoto() {
		return idMoto;
	}
	public void setnome(String nome) {
		this.NOME = nome;
	}
	public String getnome() {
		return NOME;
	}
	public void setmodelo(String modelo) {
		this.MODELO = modelo;
	}
	public String getmodelo() {
		return MODELO;
	}
	public void setmarca(String marca) {
		this.MARCA = marca;
	}
	public String getmarca() {
		return MARCA;
	}
	public void setano(String ano) {
		this.ANO = ano;
	}
	public String getano() {
		return ANO;
	}
	
	public void setcor(String cor) {
		this.COR = cor;
	}
	public String getcor() {
		return COR;
	}
}