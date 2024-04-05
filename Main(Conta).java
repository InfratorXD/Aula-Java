package br.com.caze.main;

import br.com.caze.conta.Conta;

public class Main {

	public static void main(String[] args) {
		
		Conta conta_bancaria = new Conta(001,"Guilherme Cazé",1000.0);
		conta_bancaria.depositar(500);
		conta_bancaria.sacar(100);
		conta_bancaria.Verificar_saldo();

	}

}
