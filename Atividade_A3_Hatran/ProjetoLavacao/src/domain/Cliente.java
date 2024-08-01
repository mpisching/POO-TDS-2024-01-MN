/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import java.util.ArrayList;
import java.util.List; // vamos utilizar dessas biblioteca para nos ajudar a atribuir 
// e retirar valores armazenados, sem que precise determinar uma valor fixo para o armazenamento  
/**
 *
 * @author PC
 */
public abstract class Cliente implements ICliente { // Classe Generica / Será usada como modelo para as demais, sendo então abstrata
    //Atributos
    protected int id;
    protected String nome;
    protected String celular;
    protected String emial;
    protected String dataCadastro; 
    
    protected Pontuacao pontuacao; // composição 
    
    private List<Veiculo> veiculos = new ArrayList<>();
    // A associação é 1 para 0..*, ou seja um cliente pode ter 0 ou muitos veiculos
    // solução mais viavel para armazanar um ou mais dados referentes a classe Veiculo
    
    // Metodos Especiais
    // --> Construtor --> método que é executado automaticamente quando uma classe é instanciada (objeto é criado).
    public Cliente() { 
       pontuacao = new Pontuacao(); // chamar class Pontuacao -- a classe Pontuacao é istancia junto a classe Cliente. 
    }

    public Cliente(int id, String nome, String celular, String emial, String dataCadastro) {
        this();
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.emial = emial;
        this.dataCadastro = dataCadastro;
    }
    
    // --> Getters --> obter de forma indireta os valores armazenados dentro do objeto.  
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCelular() {
        return celular;
    }
    
    public String getEmial() {
        return emial;
    }
    
    public String getDataCadastro() {
        return dataCadastro;
    }
    
    public Pontuacao getPontuacao() {
        return pontuacao;
    }

    public List<Veiculo> getVeiuclos() {
        return veiculos;
    }
    // --> Setters --> permite configurar indiretamente valores dentro de um objeto (atributos). 
    public void setId(int id) {
        this.id = id;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }
    
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    /*public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos; Não é a forma mais adequada pois não executa a função de uma associação bidirecional
    }*/
    
    // --> Metodos  
    public void add(Veiculo veiculo) {
        this.veiculos.add(veiculo); // Está adicionando o veiculo a lista de veiculos pertencente a classe cliente
        veiculo.setCliente(this); // Chama a classe veiculo e adiciona o cliente a quem pertence o veiculo  
    }
    // linha 97: Adiciona um veiculo existente ao cliente
    // linha 98: Determina a quem o veiculo pertecem
    // realizando tal função, temos a solução para uma associação bidirecional 
    
    public void remove(Veiculo veiculo) {
        this.veiculos.remove(veiculo);
        veiculo.setCliente(null);
    }
    // linha 105: Remove um veiculo existente a lista de veiculos da classe cliente
    // linha 106: Determina que o veiculo não pertence a nenhum cliente
    
//    @Override
//    public String toString() {
//        return  "id=" + id + ", nome=" + nome +
//                ", celular=" + celular + ", emial=" + emial + ", dataCadastro="+ dataCadastro+
//                " pontuacao=" + pontuacao.saldo() +'}'+"\n ==> Dados do " + veiculos ;
//    }

    // Sobrescrever metodos obrigatórios
    @Override
    public String getDados() {
        return  "Nome=" + nome + ", celular=" + celular + ", emial=" + emial + ", dataCadastro="+ dataCadastro+
                " pontuacao=" + pontuacao.saldo() +'}'+"\nDados do " + veiculos ;
    }

    @Override
    public String getDados(String Observacao) {
        return  "Nome=" + nome + ", celular=" + celular + ", emial=" + emial + ", dataCadastro="+ dataCadastro+
                " pontuacao=" + pontuacao.saldo() +'}'+"\nDados do " + veiculos +" Observacao:"+ Observacao;
    }
   
}
