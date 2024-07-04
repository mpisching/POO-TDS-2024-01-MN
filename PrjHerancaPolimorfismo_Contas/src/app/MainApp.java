/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.Conta;
import domain.ContaCorrente;
import domain.ContaPoupanca;

/**
 *
 * @author Professor
 */
public class MainApp {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(1000, 1234);
        //c1.depositar(1000);
        depositar(1000, c1);
        
        sacar(500, c1);
        
        print(c1);
        
        Conta c2 = new ContaPoupanca(10, 4321);
        //c2.depositar(5000);
        depositar(5000, c2);
        
        sacar(3000, c2);
        
        print(c2);
    }
    
    public static void print(Conta conta) {
        System.out.println("Saldo: " + conta.getSaldo());
    }
    
    public static void depositar(double valor, Conta conta) {
        conta.depositar(valor);
    }

    private static void sacar(double valor, Conta conta) {
        conta.sacar(valor);
    }
}
