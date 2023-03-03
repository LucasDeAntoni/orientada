/*import java.util.Scanner;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package questao02;
import java.util.Scanner;
/**
 *
 * @author T-GAMER
 */
public class app {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("informe o peso e altura.");
               pessoa app;
               app = new pessoa();
               app.peso = tec.nextDouble();
               app.altura = tec.nextDouble();
        System.out.println("IMC= "+app.calcularImc());
    } 
}
