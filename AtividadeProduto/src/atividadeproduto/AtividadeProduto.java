package atividadeproduto;

import domain.Produto;
import java.util.Scanner;

public class AtividadeProduto {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.descricao = "Arroz";
        p1.codigo = 10;
        p1.valor = 4.00;
        p1.qtdAtual = 10;
        p1.qtdMaxima = 100;
        
        print(p1);
        if (p1.repor(30)) {
            System.out.println("Reposição realizada com sucesso");
        } else {
            System.out.println("Não foi possível fazer a reposição");
        }
        print(p1);
        if (p1.retirar(130)) {
            System.out.println("Retirada realizada com sucesso");
        } else {
            System.out.println("Não foi possível fazer a retirada do estoque");
        }
        print(p1);
        
        
    }
    
    public static void print(Produto p) {
        System.out.println(p.toString());
    }

}
