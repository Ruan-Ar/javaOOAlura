package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoRuan = new Conta();
		contaDoRuan.saldo = 100;
		contaDoRuan.deposita(50);
		
		System.out.println(contaDoRuan.saldo);
		contaDoRuan.saca(40);
		System.out.println(contaDoRuan.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if (contaDaMarcela.transfere(3700, contaDoRuan)) {
			System.out.println("Transferencia feita com sucesso!");
		}else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println("Saldo conta da Marcela: " + contaDaMarcela.saldo);
		
	}

}
