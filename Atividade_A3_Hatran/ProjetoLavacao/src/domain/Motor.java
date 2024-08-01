/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author PC
 */
// Associação Composição
public class Motor { // classe formada por agregacao composta com classe modelo, caso algum objeto formado pelo classe modelo deixar de existir, o objeto motor também deixará de existir 
    // Atributos
    private int potencia;
    
    private ETipoCombustivel tipoCobustivel = ETipoCombustivel.GASOLINA; // associação com a classe enum tipoCombustivel
    
    // Metodos Especiais
    // --> Getters --> obter de forma indireta os valores armazenados dentro do objeto.
    public int getPotencia() {
        return potencia;
    }

    public ETipoCombustivel getTipoCobustivel() {
        return tipoCobustivel;
    }
    
    // --> Setters --> permite configurar indiretamente valores dentro de um objeto (atributos).
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setTipoCobustivel(ETipoCombustivel tipoCobustivel) {
        this.tipoCobustivel = tipoCobustivel;
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + "CV " + ", TipoCombustivel=" + tipoCobustivel + '}';
    }
       
}
