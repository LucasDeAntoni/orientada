/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        System.out.println("informe o numero e o titular da sua conta, respectivamente.");

        String numero1 = tec.next();
        conta1.setNumero(numero1);
        String titular1 = tec.next();
        conta1.setTitular(titular1);
        
        conta1.depositar(1000);
        conta1.depositar(700);
        
        System.out.println("informe o numero e o titular da segunda conta, respectivamente.");
        String numero2 = tec.next();
        conta2.setNumero(numero2);
        String titular2 = tec.next();
        conta2.setTitular(titular2);
        
        conta2.depositar(5000);
        conta2.sacar(3000);
        
        conta2.transferir(1800, conta1);
        System.out.println("Titular da conta 1: " + conta1.getTitular() + ", Saldo: R$" + conta1.getSaldo());
        System.out.println("Titular da conta 2: " + conta2.getTitular() + ", Saldo: R$" + conta2.getSaldo());
        
        tec.close();
    }
}
