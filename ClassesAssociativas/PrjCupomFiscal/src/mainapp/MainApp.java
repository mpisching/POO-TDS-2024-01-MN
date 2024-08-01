/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

import datasource.DataSource;
import domain.CupomFiscal;
import domain.ItemCP;
import java.time.LocalDate;
import java.time.LocalTime;
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
        itemCP1.setProduto(DataSource.getProduto(2));
        itemCP1.setQuantidade(2);
        cf.add(itemCP1);
        ItemCP itemCP2 = new ItemCP();
        itemCP2.setProduto(DataSource.getProduto(4));
        itemCP2.setQuantidade(2);
        itemCP2.setTxDesconto(10F);
        cf.add(itemCP2);
        
        System.out.println(ImpressaoCP.imprimir(cf));
        
        
        
    }
}
