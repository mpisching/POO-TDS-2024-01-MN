/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mainapp;

import domain.Quarto;
import domain.Janela;
import domain.Porta;
import domain.JanelaCorrer;
import domain.PortaCorrer;
import domain.PortaGiratoria;
import domain.JanelaBasculante;
        
/**
 *
 * @author Z41R3
 */
public class Main {

    
    public static void main(String[] args) {
        Quarto quarto = new Quarto();
        
        Janela janela1 = new JanelaCorrer();
        Janela janela2 = new JanelaBasculante();
        Porta porta1 = new PortaCorrer();
        Porta porta2 = new PortaGiratoria();
        
        
        quarto.addJanela(janela1);
        quarto.addJanela(janela2);
        quarto.addPorta(porta1);
        quarto.addPorta(porta2);
        
        
        quarto.abrirTodasJanelas();
        quarto.fecharTodasPortas();
        quarto.abrirJanelaBasculante();
    }
    
}
