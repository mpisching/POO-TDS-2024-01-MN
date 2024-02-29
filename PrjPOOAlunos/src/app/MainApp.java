/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.Aluno;

/**
 *
 * @author Professor
 */
public class MainApp {
    public static void main(String[] args) {
        Aluno a1; //a1 é uma variável de referência
        a1 = null;
        a1 = new Aluno();//instanciação de objetos - cria e coloca o objeto na memória
        a1.matricula = 100;
        a1.nome = "Fulano de tal";
        a1.cpf = "123.321.231-98";
        a1.nota1 = 9.0f;
        a1.nota2 = 10.0f;
        a1.nota3 = 8.0f;
        System.out.println("Media do " + a1.nome + 
                " = " + a1.calcularMedia());
        Aluno a2 = new Aluno();
        a2.matricula = 200;
        a2.nome = "Ciclano de tal";
        a2.cpf = "543.123.231-98";
        a2.nota1 = 8.0f;
        a2.nota2 = 8.0f;
        a2.nota3 = 8.0f;
        System.out.println("Media do " + a2.nome + 
                " = " + a2.calcularMedia());
        Aluno a3 = a1;
        a3.nome = "Beltrano";
        System.out.println("Media do " + a3.nome + 
                " = " + a3.calcularMedia());
        System.out.println("Media do " + a1.nome + 
                " = " + a1.calcularMedia());


    }
}
