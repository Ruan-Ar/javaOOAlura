package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		 Conta primeiraConta = new Conta();
		 primeiraConta.saldo = 200;;
		 primeiraConta.saldo += 100;
		 
		 
		 Conta segundaConta = new Conta();
		 segundaConta.saldo = 50;
		 
		 System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		 System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		 
	}	

}
