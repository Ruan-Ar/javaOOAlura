
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24223);
		
		
		//conta est� inconsistente em rela��o � regra de neg�cio
		conta.setAgencia(-50);
		conta.setNumero(-350);
		
		System.out.println(conta.getAgencia());

	}

}
