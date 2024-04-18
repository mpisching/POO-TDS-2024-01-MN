/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.Categoria;
import domain.Fornecedor;
import domain.Internacional;
import domain.Nacional;
import domain.Produto;
import java.math.BigDecimal;

/**
 *
 * @author Professor
 */
public class MainApp {
    public static void main(String[] args)  {
        Categoria categoria = new Categoria(1, "Ar condicionado");
        Produto produto1 = new Produto(1, "Ar inverter 9000 btus");
        produto1.setCategoria(categoria);
        Produto produto2 = new Produto(2, "Ar quente e frio 12000 btus");
        produto2.setCategoria(categoria);
        
//        Fornecedor fornecedor = new Fornecedor(
//                1, "Dell", "contato@dell.com", 
//                "343435533");
        
        Nacional nacional = new Nacional(
                "1234554321", 2, 
                "Spring", "contato@spring.com.br", 
                "4343434");
        nacional.setFone("4343434");
        
        //adicionando os produtos na lista de produtos do fornecedor nacional...
        nacional.add(produto1);
        nacional.add(produto2);
        
        
        Internacional internacional = new Internacional("Espanha", "12312", 3, "Espanha alimentos", 
                "contato@espanhaalimentos.com.es", "2342342332");
        internacional.setFone("2342342332");
        
        //print(fornecedor);
        print(nacional, true);//true para exibir os produtos do fornecedor
        print(internacional, true);
        
        Fornecedor fornecedor = nacional;//upcast - do subtipo para o supertipo
        //fornecedor = internacional;
        if (fornecedor instanceof Nacional) {
            Nacional n = (Nacional)fornecedor; //downcast - do supertipo para o subtipo
        } else {
            Internacional in = (Internacional)fornecedor; //downcast - do supertipo para o subtipo
        }
        
        printResumido(fornecedor);
        
    }
    
    private static void printResumido(Fornecedor fornecedor) {
        System.out.println("Dados do fornecedor " + fornecedor.getClass().getSimpleName());
        System.out.println("Nome..: " + fornecedor.getNome());
        if (fornecedor instanceof Nacional) {
            System.out.println("CNPJ..: " + ((Nacional)fornecedor).getCnpj());
        } else {
            System.out.println("NIF...: " + ((Internacional)fornecedor).getNif());
            System.out.println("Pais..: " + ((Internacional)fornecedor).getPais());
        }
    }

    private static void print(Fornecedor fornecedor) {
        System.out.println("Fornecedor: " + fornecedor.toString());
    }
    
    private static void print(Fornecedor fornecedor, boolean comProdutos) {
        System.out.println("Fornecedor: " + fornecedor.toString());
        if (comProdutos) {
            System.out.println("**** PRODUTOS DO FORNECEDOR ****");
            for (Produto p : fornecedor.getProdutos()) {
                System.out.println("Nome: " + p.getNome() + " Categoria: " +
                        p.getCategoria().getDescricao() + "\n");
            }
        }
    }
    
//    private static void print(Nacional fornecedor) {
//        System.out.println("Fornecedor Nacional: " + fornecedor.toString());
//    }
//    
//    private static void print(Internacional fornecedor) {
//        System.out.println("Fornecedor internacional: " + fornecedor.toString());
//    }

    
}
