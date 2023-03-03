/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;

/**
 *
 * @author T-GAMER
 */
public class app01 {
     public static void main (String[]args){
        pessoa01 marta;
        marta = new pessoa01();
        marta.peso=78;
         marta.altura = 1.75;
         marta.calcularImc();
         System.out.println(marta.calcularImc());
                
}
}