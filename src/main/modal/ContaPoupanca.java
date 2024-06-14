package main.modal;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente client) {
		super(client);
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

}
