
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24223);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());;
		
		Cliente ruan = new Cliente();
		ruan.setNome("Ruan Andrade");
		conta.setTitular(ruan);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		
	}

}
