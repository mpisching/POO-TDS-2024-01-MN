/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author PC
 */
public class Marca {
    // Atributos
    private int id;
    private String nome;

    // Metodos Especiais
    // --> Construtor --> método que é executado automaticamente quando uma classe é instanciada (objeto é criado).
    public Marca() {   
    }

    public Marca(String nome) {
        this.nome = nome;
    }
    
    // --> Getters --> obter de forma indireta os valores armazenados dentro do objeto.
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    // --> Setters --> permite configurar indiretamente valores dentro de um objeto (atributos).
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodos Especiais
    @Override
    public String toString() {
        return "Marca{" + "id=" + id + ", nome=" + nome + '}';
    }
    
}
