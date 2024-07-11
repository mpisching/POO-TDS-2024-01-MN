/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Professor
 */
public abstract class Fornecedor 
        extends Object implements IFornecedor{

    protected int id;
    protected String nome;
    private String email;
    protected String fone;
    
    //private Produto produto; // só aceita um produto
    //private Produto[] produto = new Produto[100000];//aceita vários mas não é viável
    private List<Produto> produtos = new ArrayList<>();

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public void add(Produto produto) {
        this.produtos.add(produto);
        produto.setFornecedor(this);
    }
    
    public void remove(Produto produto) {
        this.produtos.remove(produto);
        produto.setFornecedor(null);
    }
    
    public Fornecedor() {
    }

    public Fornecedor(int id, String nome, String email, String fone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public abstract void setFone(String fone);

    @Override
    public String toString() {
        return "Fornecedor{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", fone=" + fone + '}';
    }
    

    @Override
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Email: ").append(email).append("\n");
        sb.append("Fone: ").append(fone).append("\n");
        return sb.toString();
    }
}
