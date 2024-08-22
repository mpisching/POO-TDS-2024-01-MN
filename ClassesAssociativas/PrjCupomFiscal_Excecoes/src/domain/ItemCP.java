/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class ItemCP {
    private float txDesconto;
    private double precoCalculado;
    private int quantidade;
    
    private Produto produto;
    private CupomFiscal cupomFiscal;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public CupomFiscal getCupomFiscal() {
        return cupomFiscal;
    }

    public void setCupomFiscal(CupomFiscal cupomFiscal) {
        this.cupomFiscal = cupomFiscal;
    }

    public float getTxDesconto() {
        return txDesconto;
    }

    public void setTxDesconto(float txDesconto) {
        this.txDesconto = txDesconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getPrecoCalculado() {
        //TODO fazer o calculo do preco a pagar do produto no item do cupom fiscal
        precoCalculado = (txDesconto != 0.0F) ? calcularPreco() : produto.getPreco();
        return precoCalculado;
    }
    
    public double calcularPreco() {
        //FIXME verificar calculo
        return produto.getPreco() - (produto.getPreco() * txDesconto / 100);
    }
    
    public double calcularTotal() {
        return this.quantidade * getPrecoCalculado();
    }
}
