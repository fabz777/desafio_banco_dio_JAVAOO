package desafio_banco_dio;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		super.tipo = "Poupança";
	}
	
}
