/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joaoribeiro.java;

//Faz include de classes
import java.util.UUID;

/**
 *
 * @author joao.paulo
 */
public class Empresa {
    
    public  int     id_em;
    public  String  fantasia_em;
    private boolean status_em;
    
    public static void geraTokenEm(){
        //Cria token de acesso para empresa
        String token_em_nv = UUID.randomUUID().toString();
        
        //Apresenta token na tela
        System.out.println("Token: " + token_em_nv);
    }
    
    public void apresentaDadosEm(){
        //Apresenta dados da empresa na tela
        System.out.print("\n\n\n");
        
        System.out.println("// --------------------------------- Empresa --------------------------------- //");
        System.out.println("Nr: " + id_em);
        System.out.println("Fantasia: " + fantasia_em);
        System.out.println("Status: " + status_em);
        
        System.out.print("\n\n\n");
    }
    
    public void alteraStatusEm(boolean s){
        //Atera o status de servico da empresa
        status_em = s;
    }
    
}
