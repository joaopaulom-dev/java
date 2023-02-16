/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joaoribeiro.java;

/**
 *
 * @author joao.paulo
 */
public class Variaveis {
    
    public void apresentaVar(){
        // ------------------------------ Numeros ------------------------------ //
        
        byte   idade         = 12;              //Pega valores entre -128 a 127
        short  funcionarios  = 2000;            //Pega valores entre -32768 a 32767
        int    qtd_sql       = 50000;           //Pega valores grandes
        long   qtd_sql_lg    = 120000L;         //Pega valores muito grandes
        float  moeda         = 1240.54f;        //Pega valores decimais
        double calculo       = 23.2324323456D;  //Pega valores decimais muito grandes
        
        // ------------------------------ Outras ------------------------------ //
        
        boolean status   = true;                //Pega valores verdadeiros ou falsos
        char    unidade  = 'C';                 //Pega um único caracter
        String  fantasia = "Logon Solucoes";    //Pega valores de texto
        
        // ------------------------------ Apresenta variaveis na tela ------------------------------ //
        
        System.out.println("\n\n\n");
        
        System.out.println("// ------------------------------ Variaveis ------------------------------ //");
        System.out.println("idade: " + idade);
        System.out.println("funcionarios: " + funcionarios);
        System.out.println("qtd_sql: " + qtd_sql);
        System.out.println("qtd_sql_lg: " + qtd_sql_lg);
        System.out.println("moeda: " + moeda);
        System.out.println("calculo: " + calculo);
        System.out.println("status: " + status);
        System.out.println("unidade: " + unidade);
        System.out.println("fantasia: " + fantasia);
        
        System.out.println("\n\n\n");
    }
    
}
