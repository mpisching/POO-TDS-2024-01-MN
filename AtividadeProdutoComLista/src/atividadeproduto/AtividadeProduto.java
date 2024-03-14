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
            System.out.println("4 - quantidade atual");
            System.out.println("5 - listar todos");
            System.out.println("0 - sair");
            System.out.print("Opcao: ");
            opcao = leia.nextInt();
            switch (opcao) {
                case 1: novo(); break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: listarTodos(); break;
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

}
