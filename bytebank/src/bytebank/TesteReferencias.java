package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta);
		
		Conta segundaConta = primeiraConta;
		
		segundaConta.saldo += 100;
		
		/* Neste caso primeiraConta e segundaConta estam fazendo REFERÊNCIA para o mesmo objeto,
		 por isso chegamos ao mesmo valor em ambos os casos*/

	}

}
