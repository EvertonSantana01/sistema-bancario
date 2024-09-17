import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements Iconta {

	List<String> historicoTransacoes = new ArrayList<>();
	private static final int AGENCIA_PADRAO = 1;
	private static int SAQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente titular;
	
 
	public Conta(Cliente titular) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SAQUENCIAL++ ;
		this.titular = titular ;
	}
	public void imprimirHistorico() {
        System.out.println("=== Histórico de Transações ===");
        System.out.println("Titular da conta: " + this.titular.getNome() +" CPF: " + this.titular.getCpf());
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }
	
	public void sacar(double valor) {
		saldo -= valor ;
		historicoTransacoes.add(String.format("Saque de: %.2f", valor));
	}
	public void depositar(double valor) {
		saldo += valor;
		historicoTransacoes.add(String.format("Deposito de: %.2f", valor));
	}
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		historicoTransacoes.add(String.format("Transferir de: %.2f", valor));
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getTitular() {
		return titular; 
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.titular.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	protected abstract Object getNumero();
}
