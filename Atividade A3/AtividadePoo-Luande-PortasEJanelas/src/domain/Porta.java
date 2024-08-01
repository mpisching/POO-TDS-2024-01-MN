 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Z41R3
 */
public abstract class Porta implements IAbertura, ITravamento {

    @Override
    public void abrir() {
        System.out.println("Porta abrindo.");
    }
    
    @Override
    public void fechar() {
        System.out.println("Porta fechando.");
    }
    
    @Override
    public void travar() {
        System.out.println("Porta travando.");
    }
    
    @Override
    public void destravar() {
        System.out.println("Porta destravando.");
    }
    
}
