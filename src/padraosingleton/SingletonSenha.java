package padraosingleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SingletonSenha {
    private static SingletonSenha unicaInstancia; 
    private Set<String> senhas; 
    
    
    private SingletonSenha(){
        this.senhas = new HashSet<>(); 
        senhas.add("A1");
        senhas.add("A2");
    }
    
    public static synchronized SingletonSenha getInstancia(){
        if(unicaInstancia == null){
            unicaInstancia = new SingletonSenha(); 
        }
        return unicaInstancia;
    }
    
    public boolean bookSenha(String senha){
        return senhas.remove(senha); 
    }
    
    
    
}
