public class SistemaInterno {

    private int senha = 0000;
    
    public void autentica(Autenticavel fa){
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou){
            System.out.println("Acesso Liberado!");
        }else {
            System.out.println("Acesso Negado!");
        }
     
    }
}
