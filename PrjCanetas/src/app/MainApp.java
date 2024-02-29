/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.Caneta;

/**
 *
 * @author Professor
 */
public class MainApp {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        c1.cor = "Azul";
        c1.qtdCarga = 70;
        c1.marca = "Pentel";
        c2.cor = "Preto";
        c2.qtdCarga = 80;
        c2.marca = "Pentel";
        System.out.println("C1: " + c1);
        System.out.println("C2: " + c2);
        c1.escrever(" aula de POO");
        c2.pintar();
        c1.desenhar("quadrado");
        System.out.println("C1: " + c1);
        System.out.println("C2: " + c2);
    }
}
