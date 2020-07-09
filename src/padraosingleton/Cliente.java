
package padraosingleton;

public class Cliente {

    public static void main(String[] args) {
        gerarSenha("A1");
        gerarSenha("A1"); 
    }
    
    private static void gerarSenha(String senha){
    SingletonSenha novaSenha = SingletonSenha.getInstancia(); 
        System.out.println(novaSenha.bookSenha(senha));
    }
}