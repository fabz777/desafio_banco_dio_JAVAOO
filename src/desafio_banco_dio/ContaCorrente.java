package desafio_banco_dio;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		super.tipo = "Corrente";
	}
		
}
