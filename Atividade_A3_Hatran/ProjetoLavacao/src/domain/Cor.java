/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author PC
 */
public class Cor {
    // Atributos
    private int id;
    private String cor;
    
    // Metodos Especiais
    // --> Construtor --> método que é executado automaticamente quando uma classe é instanciada (objeto é criado).
    public Cor(){       
    }
    
    public Cor(String cor){
        this.cor = cor;
    }

    // --> Getters --> obter de forma indireta os valores armazenados dentro do objeto.
    public int getId() {
        return id;
    }
    
    public String getCor() {
        return cor;
    }

    // --> Setters --> permite configurar indiretamente valores dentro de um objeto (atributos).
    public void setId(int id) {
        this.id = id;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // --> Metodos 
    @Override
    public String toString() {
        return "Cor{" + "id=" + id + ", cor=" + cor + '}';
    }
    
    
}
