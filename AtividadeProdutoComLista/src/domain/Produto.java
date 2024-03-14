
package domain;

public class Produto {
    public int codigo;
    public String descricao;
    public double valor;
    public int qtdAtual;
    public int qtdMaxima;
    
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
    
    
}
