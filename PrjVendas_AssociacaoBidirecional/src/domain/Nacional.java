/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Professor
 */
public class Nacional extends Fornecedor {
    private String cnpj;
    //private Fornecedor fornecedor; não é heranca, é associação

    public Nacional(String cnpj) {
        this.cnpj = cnpj;
    }

    public Nacional(String cnpj, int id, String nome, String email, String fone) {
        super(id, nome, email, fone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + " Nacional{" + "cnpj=" + cnpj + '}';
    }
    
    @Override
    public void setFone(String fone) {
        this.fone = "+55" + fone;
    }    
    
}
