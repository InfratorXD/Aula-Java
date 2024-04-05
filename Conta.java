package br.com.caze.conta;

public class Conta { //CLASE
	
	private int numero; //ATRIBUTOS
	private String titular; //ATRIBUTOS
	private double saldo; //ATRIBUTOS
	
	public Conta(int numero, String titular, double saldo) { //CONSTRUTOR, mesmo nome da classe
		
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void Verificar_saldo() { //METODO
		System.out.println("Seu saldo é de: " + saldo);
	}
	
	public void depositar(double valor) { //METODO
		saldo +=valor;
	}

	public void sacar(double valor) { //METODO
		if(saldo>=valor) {
		saldo -=valor;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
}
