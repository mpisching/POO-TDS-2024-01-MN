/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.Categoria;
import domain.Produto;
import java.math.BigDecimal;

/**
 *
 * @author Professor
 */
public class MainApp {
    public static void main(String[] args) {
        Categoria c1 = new Categoria();
        c1.setId(1);
        c1.setDescricao("Vestuario");
        Categoria c2 = new Categoria(2, "Calcado");
        
        Produto p1 = new Produto();
        p1.setId(1);
        p1.setNome("Camisa");
        p1.setDescricao("Camisa polo");
        p1.setPreco(new BigDecimal(110.0));
        p1.setCategoria(c1);
        
        Produto p2 = 
           new Produto(2, "Tenis", "Tenis Runner", 
                   new BigDecimal(400.0), c2);
        
        Produto p3 = 
           new Produto(3, "Bermuda", "Bermuda cargo", 
                   new BigDecimal(220.0), c1);
        
        
        System.out.println("Produto: " + p1);
        System.out.println("Produto: " + p2);
        System.out.println("Produto: " + p3);
        
        System.out.println("Nome: " + p1.getNome() +
                "Categoria: " + p1.getCategoria().getDescricao());
        
    }
}
