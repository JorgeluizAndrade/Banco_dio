package main.modal;

public interface IConta {
	public void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, IConta contaDestino);

	void imprimirExtrato();
}
