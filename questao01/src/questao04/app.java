/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao04;
import java.util.Scanner;
/**
 *
 * @author T-GAMER
 */
public class app {
        public static void main (String[]args){
        Scanner tec = new Scanner(System.in);
        
        String nome1;
        String nome2;
        String nome3;
        
        pessoa alpha;
        alpha = new pessoa();
        System.out.println("digite o peso e altura e nome do primeiro.");
        alpha.peso = tec.nextDouble();
        alpha.altura = tec.nextDouble();
        nome1 = tec.next();
        
        alpha.calcularImc();
        
        
        System.out.println("digite o peso e altura e nome do segundo.");
        pessoa segundo;
        segundo = new pessoa();
        segundo.peso = tec.nextDouble();
        segundo.altura = tec.nextDouble();
        nome2 = tec.next();
        segundo.calcularImc();
        
        
        System.out.println("digite o peso e altura e nome do terceiro.");
        pessoa terceiro;
        terceiro = new pessoa();
        terceiro.peso = tec.nextDouble();
        terceiro.altura = tec.nextDouble();
        nome3 = tec.next();
        terceiro.calcularImc();
        
        System.out.println("informações do terceiro:");
        System.out.println("nome: "+nome3 +", peso: "+ terceiro.peso + ", altura: "+ terceiro.altura + ", IMC: "+ terceiro.calcularImc());
        System.out.println("informações do segundo:");
        System.out.println("nome: "+nome2 +", peso: "+ segundo.peso + ", altura: "+ segundo.altura + ", IMC: "+ segundo.calcularImc());
        System.out.println("informações do primeiro:");
        System.out.println("nome: "+nome1 +", peso: "+ alpha.peso + ", altura: "+ alpha.altura + ", IMC: "+ alpha.calcularImc());
        
        tec.close();
    }
}
