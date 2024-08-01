/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Z41R3
 */
public class JanelaCorrer extends Janela {

    @Override
    public void abrir() {
        System.out.println("Janela de correr abrindo.");
             
    }
    @Override
    public void fechar() {
        System.out.println("Janela de correr fechando.");
    }

    @Override
    public void travar() {
        System.out.println("Janela de correr travando");
    }

    @Override
    public void destravar() {
        System.out.println("Janela de correr destravando");
    }
    
}
