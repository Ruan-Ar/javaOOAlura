public class TesteContas {
    public static void main(String [] args) {

        ContaCorrente cc = new ContaCorrente(999, 999);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(111, 111);
        cp.deposita(200.00);


        cc.transfere(90.0, cp);

        System.out.println("Saldo conta corrente é de: " + cc.getSaldo());
        System.out.println("Saldo Conta poupança é de: " + cp.getSaldo());
        
    }
}
