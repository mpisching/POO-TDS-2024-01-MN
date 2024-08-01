/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author PC
 */
// NÃO É UMA ASSOCIAÇÃO
public class PessoaJuridica extends Cliente { // Esta classe é uma especialização da classe generica
    // Atributos
    private String cnpj;
    private String inscricaoEstadual;
    
    // Metodos Especiais
    // --> Construtor --> método que é executado automaticamente quando uma classe é instanciada (objeto é criado).
    public PessoaJuridica(int id, String nome, String celular, String emial, String dataCadastro) {
        super(id, nome, celular, emial, dataCadastro);
    }
     
    /*public PessoaJuridica(String cnpj, String inscricaoEstadual) { Queria me referir ao construtor acima
        this(int id, String nome, String celular, String emial);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }*/
    
    public PessoaJuridica(String cnpj, String inscricaoEstadual, int id, String nome, String celular, String emial, String dataCadastro) {
        super(id, nome, celular, emial, dataCadastro);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    // --> Getters --> obter de forma indireta os valores armazenados dentro do objeto.
    public String getCnpj() {
        return cnpj;
    }
    
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    // --> Setters --> permite configurar indiretamente valores dentro de um objeto (atributos).
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return  "Cliente{" + "cnpj=" + cnpj + ", inscricaoEstadual=" 
                + inscricaoEstadual +" "+ super.toString() +'}';
    }
      
    // Sobrescrever metodos obrigatórios da superclasse.
    @Override
    public String getDados() {
        return  super.getDados() + "\nCliente{" + "cnpj=" + cnpj + ", inscricaoEstadual=" 
                + inscricaoEstadual +'}';
    }
    
    @Override
    public String getDados(String Observacao) {
        return  super.getDados(Observacao) + "\nCliente{" + "cnpj=" + cnpj + ", inscricaoEstadual=" 
                + inscricaoEstadual +'}';
    }
}
