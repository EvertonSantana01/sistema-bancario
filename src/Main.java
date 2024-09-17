import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		// Clientes		
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Everton");
		cliente1.setCpf("131321321321");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Pedro");
		cliente2.setCpf("131321321321");
		
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Roberto");
		cliente3.setCpf("13212121");
		
		
		// Contas Correntes
		
		ContaCorrente contaCorrente1 = new ContaCorrente(cliente1);
		ContaCorrente contaCorrente2 = new ContaCorrente(cliente2);
		ContaCorrente contaCorrente3 = new ContaCorrente(cliente3);
		
		//Conta Poupanca 
		ContaPoupanca contaPoupanca1 = new ContaPoupanca(cliente1);
		
		
		// Depositar dinheiro nas contas 
		
		contaCorrente1.depositar(100);
		contaCorrente2.depositar(150);
		contaCorrente3.depositar(250);
		
		contaCorrente1.sacar(700);
		
		contaCorrente1.transferir(100, contaCorrente3);
		
		//Lista com os Clietes ContaCorrente
		
		List<ContaCorrente> contasCorrentes = new ArrayList<>();
		contasCorrentes.add(contaCorrente1);
//		contasCorrentes.add(contaCorrente2);
//		contasCorrentes.add(contaCorrente3);
				
		for(ContaCorrente conta: contasCorrentes) {
				conta.imprimirExtarto();
				conta.aplicarTaxaManutencao();
				conta.imprimirExtarto();
				conta.imprimirHistorico();
		}
		
		List<ContaPoupanca> contasPoupanca = new ArrayList<>();
		contasPoupanca.add(contaPoupanca1);
		
		for(ContaPoupanca pouoanca: contasPoupanca) {
//			pouoanca.depositar(150);
//			pouoanca.sacar(10);
//			pouoanca.aplicarJuros();
//			pouoanca.imprimirHistorico();
//			pouoanca.imprimirExtarto();
		}
		
	}
}
