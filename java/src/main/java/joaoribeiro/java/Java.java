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
        OlaMundo  instancia  = new OlaMundo();
        Empresa   instancia2 = new Empresa();
        Variaveis instancia3 = new Variaveis();
        Operacao  instancia4 = new Operacao();
        
        //Informa valores para as propriedades da classe
        instancia2.id_em        = 47;
        instancia2.fantasia_em  = "Logon Solucoes";
        instancia2.alteraStatusEm(true);
        
        //Apresenta mensagem na tela
        //instancia.olaMundo();
        
        //Apresenta dados da empresa na tela
        //instancia2.apresentaDadosEm();
        
        //Apresenta token de acesso na tela
        //Empresa.geraTokenEm();
        
        //Apresenta variaveis na tela
        //instancia3.apresentaVar();
        
        //Apresenta soma de valores na tela
        instancia4.soma(10, 20);
        instancia4.subtracao(20, 10);
        instancia4.multiplicacao(10, 20);
        instancia4.divisao(13, 2);
    }
    
}
