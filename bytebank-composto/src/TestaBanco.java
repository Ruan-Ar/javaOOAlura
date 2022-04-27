
public class TestaBanco {
	public static void main(String[] args) {
		Cliente ruan = new Cliente();
		ruan.nome = "Ruan Andrade";
		ruan.cpf = "000.000.000-00";
		ruan.profissao = "programador";
		
		Conta contaDoRuan = new Conta();
		contaDoRuan.deposita(5000);	
		
		
		contaDoRuan.titular = ruan;
		System.out.println(contaDoRuan.titular.nome);
				
	}
}
