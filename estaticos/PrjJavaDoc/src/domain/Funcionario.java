/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Classe para tratar da entidade Funcionario
 * @author Professor
 */
public class Funcionario {
    private int matricula;
    private String nome;
    private float salarioBase;
    //TODO: verificar se o auxilio alimentacao é um valor unico para todos funcionarios
    private static float auxilioAlimentacao = 500.0f;

    /**
     * Método para construir um objeto Funcionario
     */
    public Funcionario() {
    }

//    public Funcionario(int matricula, String nome, float salarioBase, float auxilioAlimentacao) {
//        this.matricula = matricula;
//        this.nome = nome;
//        this.salarioBase = salarioBase;
//        Funcionario.auxilioAlimentacao = auxilioAlimentacao;
//    }

    /**
     * Método para criar um objeto Funcionario
     * @param matricula  um interio, a matricula do funcionario
     * @param nome  uma string que é nome do funcionario
     * @param salarioBase um float que é o salário base do funcionário
     */
    public Funcionario(int matricula, String nome, float salarioBase) {
        this.matricula = matricula; //comentario
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

    /**
     * Método que retorna o valor corrente do auxilio alimentação
     * @return float - o valor do auxílio
     */
    public static float getAuxilioAlimentacao() {
        return auxilioAlimentacao;
    }

    /**
     * Método estático para definir o valor do auxílio alimentação
     * @param auxilioAlimentacao 
     */
    public static void setAuxilioAlimentacao(float auxilioAlimentacao) {
        Funcionario.auxilioAlimentacao = auxilioAlimentacao;
    }

    
    @Override
    public String toString() {
        return "Funcionario{" + "matricula=" + matricula + ", nome=" + nome + ", salarioBase=" + salarioBase + ", auxilioAlimentacao=" + auxilioAlimentacao + '}';
    }

    public float calcularSalario() {
        //TODO: verificar se o auxilio ... .af 
       return salarioBase + auxilioAlimentacao;
    }
    
    
}
