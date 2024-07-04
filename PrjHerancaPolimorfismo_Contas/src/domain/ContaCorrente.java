/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Professor
 */
public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(double limite, int numero) {
        super(numero);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public void sacar(double valor) {
        if ((this.saldo + this.limite) >= valor) {
            this.saldo -= valor;
        }
    }
    
    @Override
    public double getSaldo() {
        return this.saldo + this.limite;
    }
    
}
