/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mpisc
 */
public class CupomFiscal {
    private int codigo;
    private LocalDate data;
    private LocalTime hora;
    
    private List<ItemCP> itensCP = new ArrayList<>();
    
    private Empresa empresa;

    public CupomFiscal() {
    }

    public CupomFiscal(int codigo, LocalDate data, LocalTime hora) {
        this.codigo = codigo;
        this.data = data;
        this.hora = hora;
    }

    public List<ItemCP> getItensCP() {
        return itensCP;
    }

    public void setItensCP(List<ItemCP> itensCP) {
        this.itensCP = itensCP;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
    public void add(ItemCP item) {
        itensCP.add(item);
        item.setCupomFiscal(this);
    }
    
    public void remove(ItemCP item) {
        itensCP.remove(item);
        item.setCupomFiscal(null);
    }
    
    public double calcularTotal() {
        double total = 0.0;
        for (ItemCP itemCP: itensCP) {
            total += itemCP.calcularTotal();
        }
        return total;
    }
}
