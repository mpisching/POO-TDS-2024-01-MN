/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Professor
 */
public class Estoque {
    private int quantidade;
    private int qtdMaxima;
    private int qtdMinima;
    
    private ESituacao situacao = ESituacao.INATIVO;
    
    public int getQuantidade() {
        return quantidade;
    }
    
    /*
     * Pelas regras de negócio do sistema, a quantidade de estoque somente
       pode ser atualizada por meio dos métodos repor e retirar, pois eles 
       implementam as regras de negócio referente a manipulação do atributo
       quantidade. Por isso, o método setQuantidade deixa de ser desejado.
     *
     */
//    public void setQuantidade(int quantidade) {
//        this.quantidade = quantidade;
//    }

    public int getQtdMaxima() {
        return qtdMaxima;
    }

    public void setQtdMaxima(int qtdMaxima) {
        this.qtdMaxima = qtdMaxima;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public ESituacao getSituacao() {
        return situacao;
    }

    public void setSituacao(ESituacao situacao) {
        this.situacao = situacao;
    }
    
    public void repor(int qtd) throws Exception{
        if (situacao != ESituacao.ATIVO) {
            throw new Exception(
                    "Impossível atualizar o estoque. "
                  + "O estoque está com a situação " 
                  + situacao.getDescricao());
        } else if (qtd + quantidade > qtdMaxima) {
            throw new Exception(
                    "Quantidade de reposição superior a quantidade máxima.");
        } else {
            this.quantidade += qtd;
        } 
    }
    
    public void retirar(int qtd) throws Exception {
        if (situacao != ESituacao.ATIVO) {
            throw new Exception(
                    "Impossível atualizar o estoque. "
                  + "O estoque está com a situação " 
                  + situacao.getDescricao());
        } else if (qtd <= quantidade) {
            this.quantidade -= qtd;
        } else {
            throw new Exception(
                    "Quantidade de retirada é maior " 
                  + "que a quantidade disponível no estoque.");
        }
    }

    @Override
    public String toString() {
        return "Estoque{" + "quantidade=" + quantidade + ", qtdMaxima=" + qtdMaxima + ", qtdMinima=" + qtdMinima + ", situacao=" + situacao + '}';
    }

    
    
    
    
}
