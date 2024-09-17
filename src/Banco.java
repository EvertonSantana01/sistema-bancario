import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta); // Adiciona a conta na lista do banco
    }

    public void gerarRelatorio() {
        System.out.println("=== Relatório do Banco ===");
        for (Conta conta : contas) {
            System.out.println(String.format("Conta %d - Saldo: %.2f", conta.getNumero(), conta.getSaldo())); // Exibe o saldo de cada conta
        }
    }
}
