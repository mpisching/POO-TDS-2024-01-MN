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

        @Override
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        /*
          o atributo nome é um problema da superclasse, não deve ser tratado na subclasse
        */
        //sb.append("Nome: ").append(nome).append("\n");
        sb.append(super.getDados());
        sb.append("CNPJ: ").append(cnpj).append("\n");
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
