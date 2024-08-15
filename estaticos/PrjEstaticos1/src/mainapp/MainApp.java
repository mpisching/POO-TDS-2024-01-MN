/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

import domain.Funcionario;

/**
 *
 * @author Professor
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("Auxilio Alimentacao: " + Funcionario.getAuxilioAlimentacao());
        Funcionario.setAuxilioAlimentacao(300.0F);
//        Funcionario f1 = new Funcionario(1, "Fulano", 2000.0F, 150.0F);
//        Funcionario f2 = new Funcionario(2, "Ciclano", 12000.0F, 250.0F);
//        Funcionario f3 = new Funcionario(3, "Beltrano", 20000.0F, 350.0F);
        Funcionario f1 = new Funcionario(1, "Fulano", 2000.0F);
        Funcionario f2 = new Funcionario(2, "Ciclano", 12000.0F);
        Funcionario f3 = new Funcionario(3, "Beltrano", 20000.0F);
        Funcionario f4 = new Funcionario();
        //f1.setAuxilioAlimentacao(500.0f);
        
        f4.setMatricula(4);
        f4.setNome("Diplano");
        f4.setSalarioBase(3000.0f);
        
        System.out.println("F1: " + f1);
        System.out.println("F2: " + f2);
        System.out.println("F3: " + f3);
        System.out.println("F4: " + f4);
        
        Funcionario.setAuxilioAlimentacao(600.0F);
        
        System.out.println("F1: " + f1);
        System.out.println("F2: " + f2);
        System.out.println("F3: " + f3);
        System.out.println("F4: " + f4);
        
    }
}
