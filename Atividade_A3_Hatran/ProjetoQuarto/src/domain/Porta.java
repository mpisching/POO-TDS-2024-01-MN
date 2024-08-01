/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author PC
 */
// Classe Gerenerica(superclasse).
// O nome da classe no diagrama está em italico e por ser generica,
// consideramos ela abstrata.
public abstract class Porta implements IAbertura, ITravamento {

    // Sobrescrevendo metodos obrigatórios
    @Override
    public void abrir() {
        System.out.println("A porta está aberta!");
    }

    @Override
    public void fechar() {
        System.out.println("A porta está fechada!");
    }

    @Override
    public void travar() {
        System.out.println("A porta está travada!");
    }

    @Override
    public void destravar() {
        System.out.println("A porta está destravada!");
    }
    
}
