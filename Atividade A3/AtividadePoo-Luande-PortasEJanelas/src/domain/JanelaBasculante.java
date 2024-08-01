/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Z41R3
 */
public class JanelaBasculante extends Janela {

    @Override
    public void abrir() {
        System.out.println("Janela basculante abrindo.");
    }
    
    @Override
    public void fechar() {
        System.out.println("Janela basculante fechando.");
    }
    
    @Override
    public void travar() {
        System.out.println("Janela basculante travando. .");
    }
    
    @Override
    public void destravar() {
        System.out.println("Porta basculante destravando. .");
    }
}
