package br.com.caze.conta;

public class Conta {
	
	private int numero;
	private String titular;
	private double saldo;
	
	public Conta(int numero, String titular, double saldo) {
		
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void Verificar_saldo() {
		System.out.println("Seu saldo é de: " + saldo);
	}
	
	public void depositar(double valor) {
		saldo +=valor;
	}

	public void sacar(double valor) {
		if(saldo>=valor) {
		saldo -=valor;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
}
