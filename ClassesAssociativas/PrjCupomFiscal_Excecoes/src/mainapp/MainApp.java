/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

import datasource.DataSource;
import domain.CupomFiscal;
import domain.ItemCP;
import exceptions.ProdutoException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import report.ImpressaoCP;

/**
 *
 * @author mpisc
 */
public class MainApp {
    public static void main(String[] args) {
        DataSource.inicializarDados();
        
        //criando um cupom fiscal
        CupomFiscal cf = new CupomFiscal(1, LocalDate.now(), LocalTime.now());
        cf.setEmpresa(DataSource.getEmpresa());
        ItemCP itemCP1 = new ItemCP();
        
        try {
            itemCP1.setProduto(DataSource.getProduto(2));
        } catch (ProdutoException ex) {
            System.out.println("Message: " + ex.getMessage());
        }
        
        itemCP1.setQuantidade(2);
        cf.add(itemCP1);
        ItemCP itemCP2 = new ItemCP();
        try {
            itemCP2.setProduto(DataSource.getProduto(4));
        } catch (ProdutoException ex) {
            System.out.println("Message: " + ex.getMessage());
        }

        itemCP2.setQuantidade(2);
        itemCP2.setTxDesconto(10F);
        cf.add(itemCP2);
        
        System.out.println(ImpressaoCP.imprimir(cf));
        
        //alterando o preco de um produto...
        try {
            System.out.println("bloqueando recursos!");
            DataSource.getProduto(2).setPreco(-25.0);
            System.out.println("Novo preco do produto " + DataSource.getProduto(2).getNome() + 
                " R$ " + DataSource.getProduto(2).getPreco());
        } catch (ProdutoException ex) {
            System.out.println("Message: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Message: " + ex.getMessage());
        } 
        finally {
            System.out.println("liberando recursos!");
        }
        
    }
}
