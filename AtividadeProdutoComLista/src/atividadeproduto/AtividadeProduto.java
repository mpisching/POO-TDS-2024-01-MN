package atividadeproduto;

import domain.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeProduto {
    private static List<Produto> produtos = new ArrayList<>(); 
    private static Scanner leia = new Scanner(System.in);
    
    public static void menu() {
        int opcao = 0;
        do {
            System.out.println("1 - novo");
            System.out.println("2 - repor");
            System.out.println("3 - retirar");
            System.out.println("4 - quantidade atual de um produto");
            System.out.println("5 - listar todos");
            System.out.println("6 - Reajustar preço");
            System.out.println("0 - sair");
            System.out.print("Opcao: ");
            opcao = leia.nextInt();
            switch (opcao) {
                case 1: novo(); break;
                case 2: repor(); break;
                case 3: break;
                case 4: pesquisarProduto(); break;
                case 5: listarTodos(); break;
                case 6: reajustarValor(); break;
                case 0: System.out.println("Finalizando o programa...");break;
                default: System.out.println("Opcao invalida");
            } 
        } while (opcao != 0);
    }
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void print(Produto p) {
        System.out.println(p.toString());
    }
    
    public static void listarTodos() {
        if (produtos.size() == 0) {
            System.out.println("Lista Vazia");
        } else {
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
    }

    private static void novo() {
        Produto p = new Produto();
        System.out.print("Codigo......: ");
        p.codigo = leia.nextInt();
        System.out.print("Descricao...: ");
        p.descricao = leia.next();
        System.out.print("Valor.......: ");
        p.valor = leia.nextDouble();
        System.out.print("Qtd Atual...: ");
        p.qtdAtual = leia.nextInt();
        System.out.print("Qtd Max.....: ");
        p.qtdMaxima = leia.nextInt();
        produtos.add(p);
    }
    
    public static void pesquisarProduto() {
        System.out.print("Codigo......: ");
        int codigo = leia.nextInt();
        for (Produto p: produtos) {
            if (p.codigo == codigo) {
                System.out.println("Produto ===> " + p);
                System.out.println("Quantidade atual: " + p.qtdAtual);
                return;
            }
        }
        System.out.println("Produto não encontrado na lista...");
    }

    private static void repor() {
        System.out.print("Codigo....: ");
        int codigo = leia.nextInt();
        Produto p = encontrarProduto(codigo);
        if (p != null) {
            System.out.print("Quantidade de reposicao: ");
            int qtd = leia.nextInt();
            String status = p.repor(qtd) ? "Sucesso" : "Falha";
            System.out.println("Operacao realizada com " + status);
        } else {
            System.out.println("Produto não existente na lista!!!");
        }
    }

    private static Produto encontrarProduto(int codigo) {
        for (Produto p: produtos) {
            if (codigo == p.codigo) {
                return p;
            }
        }       
        return null;       
    }

    private static void reajustarValor() {
        System.out.print("Codigo....: ");
        int codigo = leia.nextInt();
        Produto p = encontrarProduto(codigo);
        if (p != null) {
            System.out.print("Informe o indice percentual de reajuste: ");
            float idx = leia.nextFloat();
            p.reajustarValor(idx);
        } else {
            System.out.println("Produto não encontrado na lista.");
        }
    }

}
