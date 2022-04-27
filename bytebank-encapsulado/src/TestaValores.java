
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24223);
		
		
		//conta está inconsistente em relação à regra de negócio
		conta.setAgencia(-50);
		conta.setNumero(-350);
		
		System.out.println(conta.getAgencia());

	}

}
