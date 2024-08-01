/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datasource;

import domain.Empresa;
import domain.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mpisc
 */
public class DataSource {
    private static List<Produto> produtos = new ArrayList<>();
    private static Empresa empresa;
    
    public static void inicializarDados() {
        empresa = new Empresa("IFSC IND. E COM.");
        produtos.add(new Produto(1, "Caderno", 30.0));
        produtos.add(new Produto(2, "Caneta Esferográfica Azul", 20.0));
        produtos.add(new Produto(3, "Lapis", 5.0));
        produtos.add(new Produto(4, "Borracha", 2.0));        
    } 
    
    public static Empresa getEmpresa() {
        return empresa;
    }
    
    public static Produto getProduto(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
