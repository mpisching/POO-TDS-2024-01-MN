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
public class PessoaFisica extends Cliente{ // Uma das especializações da classe Cliente
    // Atributos
    private String cpf;
    private String dataNascimento;

    // Metodos Especiais
    // --> Construtor --> método que é executado automaticamente quando uma classe é instanciada (objeto é criado).
    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, String dataNascimento) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    
    public PessoaFisica(String cpf, String dataNascimento, int id, String nome, String celular, String emial, String dataCadastro) {
        super(id, nome, celular, emial, dataCadastro);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    
    // --> Getters --> obter de forma indireta os valores armazenados dentro do objeto.
    public String getCpf() {
        return cpf;
    }
    
    public String getDataNascimento() {
        return dataNascimento;
    }
    
    // --> Setters --> permite configurar indiretamente valores dentro de um objeto (atributos).
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    // Metodos ...
    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", dataNascimento="+ dataNascimento +" "+ super.toString() +'}';
    }
    
    // Sobrescrever metodos obrigatórios da superclasse.
    @Override
    public String getDados() {
        return  super.getDados() + "\nCliente{" + "cpf=" + cpf + ", dataNascimento="+ dataNascimento +'}';
    }

    @Override
    public String getDados(String Observacao) {
        return  super.getDados(Observacao) + "Cliente{" + "cpf=" + cpf + ", dataNascimento="+ dataNascimento +'}';
    }
      
}
