/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;

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
        alpha.setPeso(tec.nextDouble());
        alpha.setAltura(tec.nextDouble());
        nome1 = tec.next();
        
        alpha.calcularImc();
        
        
        System.out.println("digite o peso e altura e nome do segundo.");
        pessoa segundo;
        segundo = new pessoa();
        segundo.setPeso(tec.nextDouble());
        segundo.setAltura(tec.nextDouble());
        nome2 = tec.next();
        segundo.calcularImc();
        
        
        System.out.println("digite o peso e altura e nome do terceiro.");
        pessoa terceiro;
        terceiro = new pessoa();
        terceiro.setPeso(tec.nextDouble());
        terceiro.setAltura(tec.nextDouble());
        nome3 = tec.next();
        terceiro.calcularImc();
        
        System.out.println("informações do terceiro:");
        System.out.println("nome: "+nome3 +", peso: "+ terceiro.getPeso() + ", altura: "+ terceiro.getAltura() + ", IMC: "+ terceiro.calcularImc());
        System.out.println("informações do segundo:");
        System.out.println("nome: "+nome2 +", peso: "+ segundo.getPeso() + ", altura: "+ segundo.getAltura() + ", IMC: "+ segundo.calcularImc());
        System.out.println("informações do primeiro:");
        System.out.println("nome: "+nome1 +", peso: "+ alpha.getPeso() + ", altura: "+ alpha.getAltura() + ", IMC: "+ alpha.calcularImc());
        
        tec.close();
    }
}
