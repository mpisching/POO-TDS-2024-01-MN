
package domain;

public class Produto {
    private int codigo;
    private String descricao;
    private double valor;
    private int qtdAtual;
    private int qtdMaxima;
    /*
     Médotos construtores sobrecarregados (sobrecarga de métodos - overloading)
    */
    public Produto(int codigo) {
        this.codigo = codigo;
    }
    
   
    public Produto(int codigo, String descricao) {
        //this(codigo);
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Produto(int codigo, String descricao, double valor, int qtdAtual, int qtdMaxima) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.qtdAtual = qtdAtual;
        this.qtdMaxima = qtdMaxima;
    }
    
    
    
    public boolean repor(int qtd)  {
        if (qtdAtual + qtd <= qtdMaxima) {
            qtdAtual += qtd;
            return true;
        } else {
            return false;
        }
    }
    public boolean retirar(int qtd){
        if (qtd <= qtdAtual) {
            qtdAtual -= qtd;
            return true;
        } else {
            return false;
        }
    }
    public int obterQuantidadeAtual() {
        return this.qtdAtual;    
    }
    
    public void reajustarValor(float idx) {
        if (idx > 0.0)
            valor += valor * idx / 100;
        else 
            valor -= valor * Math.abs(idx) / 100;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + ", qtdAtual=" + qtdAtual + ", qtdMaxima=" + qtdMaxima + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdMaxima() {
        return qtdMaxima;
    }

    public void setQtdMaxima(int qtdMaxima) {
        this.qtdMaxima = qtdMaxima;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }
        
}
