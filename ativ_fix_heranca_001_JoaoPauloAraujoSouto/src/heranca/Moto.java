package heranca;

public class Moto {
	
	private int idMoto;// atributo para identificação da moto
	private String nome; // atributo para nome 
	private String modelo; // atributo para modelo
	private String marca; // atributo para marca
	private String ano; // atributo para ano 
	private String cor; // atributo para cor da moto
	
	public Moto() {
		
	}
		
	public void setidCarro(int idMoto) {
		this.idMoto = idMoto;
	}
	public int getidMoto() {
		return idMoto;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getnome() {
		return nome;
	}
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	public String getmodelo() {
		return modelo;
	}
	public void setmarca(String marca) {
		this.marca = marca;
	}
	public String getmarca() {
		return marca;
	}
	public void setano(String ano) {
		this.ano = ano;
	}
	public String getano() {
		return ano;
	}
	
	public void setcor(String cor) {
		this.cor = cor;
	}
	public String getcor() {
		return cor;
	}
}