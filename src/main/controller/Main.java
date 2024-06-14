package main.controller;

import main.modal.Cliente;
import main.modal.Conta;
import main.modal.ContaCorrente;
import main.modal.ContaPoupanca;

public class Main {
	public static void  main(String[] agrs) {
		Cliente jojo = new Cliente();
		jojo.setNome("Jorge");
		
		Conta cc = new ContaCorrente(jojo);
		Conta poupanca = new ContaPoupanca(jojo);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}	
