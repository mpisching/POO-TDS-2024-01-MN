/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.Aluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Professor
 */
public class MainApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcao = "";
        List<Aluno> listaAlunos = new ArrayList<>();
        do {
            Aluno a1 = new Aluno();
            System.out.print("Matricula.....: ");
            a1.matricula = entrada.nextInt();
            System.out.print("Nome..........: ");
            a1.nome = entrada.next();
            System.out.print("CPF...........: ");
            a1.cpf = entrada.next();
            System.out.print("Nota 1........: ");
            a1.nota1 = entrada.nextFloat();
            System.out.print("Nota 2........: ");
            a1.nota2 = entrada.nextFloat();
            System.out.print("Nota 3........: ");
            a1.nota3 = entrada.nextFloat();

            //System.out.println("Aluno: " + a1.toString());
            System.out.print("Deseja registrar um novo aluno? S/N? ");
            opcao = entrada.next();
            listaAlunos.add(a1);
        } while (opcao.equalsIgnoreCase("s"));
        
        imprimir(listaAlunos);
    }
    
    public static void imprimir(List<Aluno> lista) {
        for (Aluno a: lista) {
            System.out.println("Aluno: " + a);
        }
    }
}
