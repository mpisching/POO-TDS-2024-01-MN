/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Professor
 */
public class Funcionario {
    private int matricula;
    private String nome;
    private float salarioBase;
    private static float auxilioAlimentacao = 500.0f;

    public Funcionario() {
    }

//    public Funcionario(int matricula, String nome, float salarioBase, float auxilioAlimentacao) {
//        this.matricula = matricula;
//        this.nome = nome;
//        this.salarioBase = salarioBase;
//        Funcionario.auxilioAlimentacao = auxilioAlimentacao;
//    }

    public Funcionario(int matricula, String nome, float salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public static float getAuxilioAlimentacao() {
        return auxilioAlimentacao;
    }

    public static void setAuxilioAlimentacao(float auxilioAlimentacao) {
        Funcionario.auxilioAlimentacao = auxilioAlimentacao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "matricula=" + matricula + ", nome=" + nome + ", salarioBase=" + salarioBase + ", auxilioAlimentacao=" + auxilioAlimentacao + '}';
    }
    
    
}
