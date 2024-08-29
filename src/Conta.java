public class Conta {

    private double saldo;
    private String tipo;

    public Conta(double saldoInicial, String tipo) {
        this.saldo = saldoInicial;
        this.tipo = tipo != null ? tipo : "Corrente";
    }

    public boolean depositar(double valor) {
        if (this.tipo.equalsIgnoreCase("Corrente") && valor > 1000) {
            System.out.println("Depósito superior ao limite permitido para conta Corrente.");
            return false;
        }

        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }



    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        System.out.println("Saldo insuficiente para realizar o saque.");
        return false;
    }




    public boolean transferir(double valor, Conta contaDestino) {
        if (this.tipo.equalsIgnoreCase("Poupança") && contaDestino.getTipo().equalsIgnoreCase("Corrente")) {
            System.out.println("Transferência da Poupança para Corrente não permitida.");
            return false;
        }

        if (sacar(valor)) { // Se conseguiu sacar, transfere
            contaDestino.depositar(valor);
            return true;
        }
        System.out.println("Transferência não permitida. Saldo insuficiente.");
        return false;
    }



    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
