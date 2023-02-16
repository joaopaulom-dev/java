/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joaoribeiro.java;

/**
 *
 * @author joao.paulo
 */
public class Operacao {
    
    public void soma(int x, int y){
        //Pega resultado da soma
        int resultado = x + y;
        
        //Apresenta soma na tela
        System.out.println(x + " + " + y + " = " + resultado);
    }
    
    public void subtracao(int x, int y){
        //Pega resultado da soma
        int resultado = x - y;
        
        //Apresenta soma na tela
        System.out.println(x + " - " + y + " = " + resultado);
    }
    
    public void multiplicacao(int x, int y){
        //Pega resultado da soma
        int resultado = x * y;
        
        //Apresenta soma na tela
        System.out.println(x + " . " + y + " = " + resultado);
    }
    
    public void divisao(int x, int y){
        //Pega resultado da soma
        int resultado = x / y;
        
        //Pega resto da soma
        int resto = x % y;
        
        //Apresenta soma na tela
        System.out.println(x + " : " + y + " = " + resultado + " com resto igual à " + resto);
    }
    
}
