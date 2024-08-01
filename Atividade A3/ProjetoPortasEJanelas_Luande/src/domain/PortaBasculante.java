/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Z41R3
 */
public class PortaBasculante extends Porta {
    @Override
    public void abrir() {
        super.abrir();
        System.out.println(" basculante.");
    }
    
    @Override
    public void fechar() {
        System.out.println("Porta basculante fechando.");
    }
    
    @Override
    public void travar() {
        System.out.println("Porta basculante travando. .");
    }
    
      @Override
    public void destravar() {
        System.out.println("Porta basculante destravando. .");
    }
}
