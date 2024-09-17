
public class ContaCorrente extends Conta {

	private double limiteChequeEspecial = 500.0;
	
	private static final double TAXA_MANUTENCAO =10.0;
	
	public ContaCorrente(Cliente titular) {
		super(titular);
	}
	
	public void sacar(double valor) {
		if(saldo + limiteChequeEspecial >= valor) {
			saldo -= valor;
			System.out.println(String.format("Saque de %.2f realizado", valor));
		}
		else {
			System.out.println("Saldo insuficiente, mesmo com o cheque especial.");
		}
	}

	public void imprimirExtarto() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	public void aplicarTaxaManutencao() {
		this.sacar(TAXA_MANUTENCAO);
		System.out.println(String.format("Taxa de manutenção de %.2f aplicada", TAXA_MANUTENCAO));
	}

	@Override
	protected Object getNumero() {
		return null;
	}

}
