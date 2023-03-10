/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

public class ContaBancaria {

    public String titular;
    public String numero;
    public double saldo;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setSaldo() {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor){
        if (valor>0){
            this.saldo = saldo + valor;     
        }                      
    }    
    public void sacar(double valor){
        if (valor>0){
            this.saldo = saldo - valor;     
        }  
    }
    public void transferir(double valor, ContaBancaria destino){
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
        }
    }
}
    

    

