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
        Produto produto = new Produto(1, "Ar inverter 9000 btus");
        produto.setCategoria(categoria);
        
        System.out.println("Categoria: " + categoria.toString());
        
        Fornecedor fornecedor = new Fornecedor(
                1, "Dell", "contato@dell.com", 
                "343435533");
        
        Nacional nacional = new Nacional(
                "1234554321", 2, 
                "Spring", "contato@spring.com.br", 
                "4343434");
        
        Internacional internacional = new Internacional("Espanha", "12312", 3, "Espanha alimentos", 
                "contato@espanhaalimentos.com.es", "2342342332");
        
        print(fornecedor);
        print(nacional);
        print(internacional);
        
    }

    private static void print(Fornecedor fornecedor) {
        System.out.println("Fornecedor: " + fornecedor.toString());
    }
    
    private static void print(Nacional fornecedor) {
        System.out.println("Fornecedor Nacional: " + fornecedor.toString());
    }
    
    private static void print(Internacional fornecedor) {
        System.out.println("Fornecedor internacional: " + fornecedor.toString());
    }
}
