public class Main {
    public static void main(String[] args) {

        Conta contaCorrente = new Conta(500, "Corrente");
        Conta contaPoupanca = new Conta(1000, "Poupança");

        System.out.println("\nTentativa de depósito de R$ 1.500,00 na conta Corrente:");
        boolean deposito1 = contaCorrente.depositar(1500);
        System.out.println("Resultado: " + (deposito1 ? "Sucesso" : "Falha"));

        System.out.println("\nTentativa de depósito de R$ 1.500,00 na conta Poupança:");
        boolean deposito2 = contaPoupanca.depositar(1500);
        System.out.println("Resultado: " + (deposito2 ? "Sucesso" : "Falha"));

        System.out.println("\nDepósito de R$ 98,52 na conta Poupança:");
        boolean deposito3 = contaPoupanca.depositar(98.52);
        System.out.println("Resultado: " + (deposito3 ? "Sucesso" : "Falha"));


        System.out.println("\nTentativa de saque de R$ 100,00 na conta Poupança:");
        boolean saque1 = contaPoupanca.sacar(100);
        System.out.println("Resultado: " + (saque1 ? "Sucesso" : "Falha"));

        System.out.println("\nTentativa de transferência de R$ 1.800,00 da conta Corrente para Poupança:");
        boolean transferencia1 = contaCorrente.transferir(1800, contaPoupanca);
        System.out.println("Resultado: " + (transferencia1 ? "Sucesso" : "Falha"));

        System.out.println("\nTentativa de transferência de R$ 700,00 da conta Poupança para Corrente:");
        boolean transferencia2 = contaPoupanca.transferir(700, contaCorrente);
        System.out.println("Resultado: " + (transferencia2 ? "Sucesso" : "Falha"));

        System.out.println("\nSaque de R$ 1.000,00 da conta Poupança:");
        boolean saque2 = contaPoupanca.sacar(1000);
        System.out.println("Resultado: " + (saque2 ? "Sucesso" : "Falha"));

        System.out.println("\nSaque de R$ 1.000,00 da conta Corrente:");
        boolean saque3 = contaCorrente.sacar(1000);
        System.out.println("Resultado: " + (saque3 ? "Sucesso" : "Falha"));

        System.out.println("Saldo final da conta Corrente: R$ " + contaCorrente.getSaldo());
        System.out.println("Saldo final da conta Poupança: R$ " + contaPoupanca.getSaldo());
    }
}
