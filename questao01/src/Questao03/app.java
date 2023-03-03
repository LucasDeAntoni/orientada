/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao03;
import java.util.Scanner;
/**
 *
 * /@author T-GAMER
 */
public class app {
    public static void main (String[]args){
        Scanner tec = new Scanner(System.in);
        
        pessoa alpha;
        alpha = new pessoa();
        System.out.println("digite o peso e altura do primeiro.");
        alpha.peso = tec.nextDouble();
        alpha.altura = tec.nextDouble();
        alpha.calcularImc();
        System.out.println("IMC = "+ alpha.calcularImc());
        
        System.out.println("digite o peso e altura do segundo.");
        pessoa segundo;
        segundo = new pessoa();
        segundo.peso = tec.nextDouble();
        segundo.altura = tec.nextDouble();
        segundo.calcularImc();
        System.out.println("IMC = "+ segundo.calcularImc());
        
        System.out.println("digite o peso e altura do terceiro.");
        pessoa terceiro;
        terceiro = new pessoa();
        terceiro.peso = tec.nextDouble();
        terceiro.altura = tec.nextDouble();
        terceiro.calcularImc();
        System.out.println("IMC = "+ terceiro.calcularImc());
        
        tec.close();
    }
    
}
