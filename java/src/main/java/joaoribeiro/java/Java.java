/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package joaoribeiro.java;

/**
 *
 * @author joao.paulo
 */
public class Java {

    public static void main(String[] args) {
        //Instancia novo objeto da classe
        OlaMundo instancia  = new OlaMundo();
        Empresa  instancia2 = new Empresa();
        
        //Informa valores para as propriedades da classe
        instancia2.id_em        = 47;
        instancia2.fantasia_em  = "Logon Solucoes";
        instancia2.alteraStatusEm(true);
        
        //Apresenta mensagem na tela
        //instancia.olaMundo();
        
        //Apresenta dados da empresa na tela
        instancia2.apresentaDadosEm();
        
        //Apresenta token de acesso na tela
        Empresa.geraTokenEm();
    }
    
}
