package main.modal;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente client) {
		// TODO Auto-generated constructor stub
		super(client);
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
}
