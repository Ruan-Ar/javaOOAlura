
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta(1337, 24223, 200.0);
		
		System.out.println(conta1.getSaldo());
		
		System.out.println(conta1.getAgencia());
		
			conta1.setAgencia(1232123);
			
		


	}

}
