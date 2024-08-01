/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Z41R3
 */
public class PortaCorrer extends Porta {
    
    @Override
    public void abrir() {
        System.out.println("Porta de correr abrindo.");
    }
    
    @Override
    public void fechar() {
        System.out.println("Porta de correr fechando.");
    }
    
    @Override
    public void travar() {
        System.out.println("Porta de correr travando.");
    }
    
    @Override
    public void destravar() {
        System.out.println("Porta de correr destravando.");
    }
    
}
