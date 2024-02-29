/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Professor
 */
public class Aluno {
    public int matricula;
    public String nome;
    public String cpf;
    public float nota1;
    public float nota2;
    public float nota3;
    
    public float calcularMedia() {
        return ((nota1 + nota2 + nota3) / 3.0F);
    }
}
