package desafio_banco_dio;

public class Main {

	public static void main(String[] args) {
		
		Cliente fabio = new Cliente();
		Banco bancodio = new Banco();	
		
		fabio.setCpf("222.222.222-22");
		fabio.setNome("Fábio Soares");
		fabio.setProfissao("Engenheiro de Software");
		
		Conta cc = new ContaCorrente(fabio);
		Conta cp = new ContaPoupanca(fabio);
		
		cc.deposita(100.0);
		cc.saca(10.0);
		cc.transfere(30.0, cp);		
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		bancodio.addConta(cp);
		bancodio.addConta(cc);
		
		bancodio.getAllContas();
		
		
		

	}

}
