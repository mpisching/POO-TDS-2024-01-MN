/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Professor
 */
public class ContaPoupanca extends Conta {
    private int diaAniversario;

    public ContaPoupanca(int diaAniversario, int numero) {
        super(numero);
        this.diaAniversario = diaAniversario;
    }
    
    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }
    
    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }    
    
}
