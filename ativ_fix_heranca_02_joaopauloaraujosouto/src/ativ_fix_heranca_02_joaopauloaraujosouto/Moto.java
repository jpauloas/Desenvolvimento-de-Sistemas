package ativ_fix_heranca_02_joaopauloaraujosouto;

import java.util.ArrayList;

public class Moto implements Veiculo{
	private int idveiculo;// atributo para identificação da moto
	private String nome; // atributo para nome 
	private String modelo; // atributo para modelo
	private String marca; // atributo para marca
	private String ano; // atributo para ano 
	private String cor; // atributo para cor da moto
	
	ArrayList<Moto> motos = new ArrayList<Moto>();
	
	public Moto() {
		
	}
		
	public void setidveiculo(int idveiculo) {
		this.idveiculo = idveiculo;
	}
	public int getidveiculo() {
		return idveiculo;
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
