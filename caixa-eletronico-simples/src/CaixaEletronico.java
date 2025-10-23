import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 450.0; // saldo inicial
        System.out.println("=== CAIXA ELETRÔNICO ===");
        System.out.println("💰 Seu saldo atual é: R$ " + saldo);
        
        System.out.print("\nDigite o valor que deseja sacar (até R$ " + saldo + "): R$ ");
        double valorSaque = scanner.nextDouble();
        
        // Verifica se há dinheiro suficiente
        if (valorSaque <= saldo && valorSaque > 0) {
            saldo -= valorSaque;
            System.out.println("\n✅ Saque de R$ " + valorSaque + " realizado com sucesso!");
            System.out.println("💰 Saldo atualizado: R$ " + saldo);
            System.out.println("📄 Extrato: Saque de R$ " + valorSaque);
        } else if (valorSaque <= 0) {
            System.out.println("\n⚠️ O valor do saque deve ser maior que zero!");
        } else {
            System.out.println("\n⚠️ Saldo insuficiente para sacar R$ " + valorSaque);
            System.out.println("💰 Saldo atual: R$ " + saldo);
        }

        scanner.close();
    }
}
