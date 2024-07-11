/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Professor
 */
public class Internacional extends Fornecedor {
    private String pais;
    private String nif;

    public Internacional(String pais, String nif) {
        this.pais = pais;
        this.nif = nif;
    }

    public Internacional(String pais, String nif, int id, String nome, String email, String fone) {
        super(id, nome, email, fone);
        this.pais = pais;
        this.nif = nif;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return super.toString() + " Internacional{" + "pais=" + pais + ", nif=" + nif + '}';
    }

    @Override
    public void setFone(String fone) {
        this.fone = "+COD INT" + fone;
    }

    @Override
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        //sb.append("Nome: ").append(nome).append("\n");
        sb.append(super.getDados());
        sb.append("NIF: ").append(nif).append("\n");
        sb.append("País: ").append(pais).append("\n");
        return sb.toString();
    }

    @Override
    public String getDados(String msg) {
        StringBuilder sb = new StringBuilder();
        sb.append(getDados());
        sb.append("Mensagem: ").append(msg).append("\n");
        return sb.toString();
    }
    
}
