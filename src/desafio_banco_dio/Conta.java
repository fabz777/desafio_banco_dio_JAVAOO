package desafio_banco_dio;

public abstract class Conta {
	
	protected static final int AGENCIA_PADRAO = 1;
	private static int sequencial = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected String tipo;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = sequencial++;
		this.cliente = cliente;
		
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}	
	}
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}		
	}
	
	protected void imprimirExtrato() {
		System.out.println(String.format("== Extrato Conta %s ==", this.tipo));
		System.out.println(String.format("Titular: %s", cliente.getNome()));
		System.out.println(String.format("Profissão: %s", cliente.getProfissao()));
		System.out.println(String.format("CPF: %s", cliente.getCpf()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
}
