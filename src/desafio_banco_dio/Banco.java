package desafio_banco_dio;

import java.util.ArrayList;

public class Banco {
	private String nome;
	private ArrayList<Conta> arrContas;

	public Banco() {
		this.nome = "Banco Dio";
		this.arrContas = new ArrayList<Conta>();
	}
	
	public void addConta(Conta conta) {
		this.arrContas.add(conta);
	}
	
	public void getAllContas() {
		for(int i = 0; i < this.arrContas.size(); i++) {
			System.out.println("Conta " + this.arrContas.get(i).getTipo() + " -- Títular: " + this.arrContas.get(i).cliente.getNome() + " -- Agência: " + this.arrContas.get(i).getAgencia() + " -- Número: " + this.arrContas.get(i).getNumero());
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
