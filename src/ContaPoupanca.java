
public class ContaPoupanca extends Conta {
	
	private static final double TAXA_JUROS = 0.02;
	
	public void aplicarJuros() {
		double juros = this.getSaldo() * TAXA_JUROS;
		this.depositar(juros);
		System.out.println(String.format("Juros de %.2f aplicados", juros));
	}

	public ContaPoupanca(Cliente titular) {
		super(titular);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtarto() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
