package br.com.hospitalx.veiculo;

public class Carro {
	
	
	//Atributos (CARACTERISTICAS)
	 
	private String marca;
	private String modelo;
	private int ano;
	
	//Inicializar as caracteristicas (CONSTRUTOR)
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		
		
	}

	//Metodos (AÇÕES)
	
public void acelerar() {
	
		System.out.println("Acelerando..." + marca);
	}
	
}
				
