/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Professor
 */
public class Caneta {
    public String cor;
    public int qtdCarga;
    public String marca;
    
    public void escrever(String msg) {
        System.out.println("escrevendo a msg "+ msg);
        qtdCarga--;
    }
    
    public void desenhar(String figura) {
        System.out.println("desenhando um(a)" + figura);
        qtdCarga -= 2;
    }
    
    public void pintar() {
        System.out.println("caneta " + cor + " pintando...");
        qtdCarga -= 3;
    }

    @Override
    public String toString() {
        return "Caneta{" + "cor=" + cor + ", qtdCarga=" + qtdCarga + ", marca=" + marca + '}';
    }
    
    
}
