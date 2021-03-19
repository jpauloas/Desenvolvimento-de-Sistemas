package ativ_fix_comp_JoaoPauloAraujoSouto;

public class Carro {
		private int idCarro; // atributo para identificação do carro
		private String NOME; // atributo para nome 
		private String MODELO; // atributo para modelo
		private String MARCA; // atributo para marca
		private String ANO; // atributo para ano 
		private String COR; // atributo para cor do carro
		
		public Carro() {
			
		}
			
		public void setidCarro(int idCarro) {
			this.idCarro = idCarro;
		}
		public int getidCarro() {
			return idCarro;
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
