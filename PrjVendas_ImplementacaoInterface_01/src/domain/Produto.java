/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.math.BigDecimal;

/**
 *
 * @author Professor
 */
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    
    private Categoria categoria;
    
    private Fornecedor fornecedor;
    
    //cria o objeto estoque na própria classe Produto
    //caracterizando a composição.
    private Estoque estoque = new Estoque();
    //private Estoque estoque;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
//    private void createEstoque() {
//        estoque = new Estoque();
//    }
    
    public Produto() {
        //createEstoque();
    }

    public Produto(int id, String nome) {
        this();
        this.id = id;
        this.nome = nome;
    }
    
    public Produto(int id, String nome, String descricao, 
            BigDecimal preco, Categoria categoria) {
        this(id, nome);
//        this.id = id;
//        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    /**
     * O método set para composição não é desejavel
     * @return 
     */
//    public void setEstoque(Estoque estoque) {
//        this.estoque = estoque;
//    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", categoria=" + categoria + ", estoque=" + estoque + '}';
    }  
    
}
